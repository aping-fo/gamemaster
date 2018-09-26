package com.luckygames.wmxz.gamemaster.utils;

import com.luckygames.wmxz.gamemaster.controller.AllDialogController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * xml工具类,依赖于dom4j解析
 *
 * @作者 周聪
 * @时间 2018/9/14 21:41
 */
public class XmlUtil2 {

    protected static final Logger logger = LoggerFactory.getLogger(XmlUtil2.class);

    /**
     * xml必须放在resources目录下
     *
     * @param xmlName xml名称
     * @param clazz
     * @return 保护xml的map
     */
    public static List<Object> xml2map(String xmlName, Class<?> clazz) {
        Map<Integer, Map<String, String>> var1 = new ConcurrentHashMap<>();
        DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
        Document var5 = null;
        try {
            DocumentBuilder var3 = var2.newDocumentBuilder();
            ClassPathResource resource = new ClassPathResource(xmlName);//jar包必须使用classpath
            InputStream inputStream = resource.getInputStream();//jar包必须必须使用流
            var5 = var3.parse(inputStream);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        assert var5 != null;
        Element var6 = var5.getDocumentElement();
        NodeList var7 = var6.getChildNodes();

        for (int var8 = 0; var8 < var7.getLength(); ++var8) {
            Node var9 = var7.item(var8);
            if (var9.getNodeType() == 1) {
                HashMap var10 = new HashMap();
                int var11 = 0;
                NodeList var12 = var9.getChildNodes();

                for (int var13 = 0; var13 < var12.getLength(); ++var13) {
                    Node var14 = var12.item(var13);
                    if (var14.getNodeType() == 1) {
                        if (var14.getNodeName().startsWith("id")) {
                            var11 = Integer.valueOf(var14.getTextContent().trim());
                        }
                        var10.put(var14.getNodeName().trim(), var14.getTextContent().trim());
                    }
                }
                var1.put(var11, var10);
            }
        }

        List<Object> list = new ArrayList<>();
        var1.forEach((k, v) -> {
            Object object = map2object(v, clazz);
            list.add(object);
        });
        return list;
    }

    /**
     * 根据map的k和v转为对象
     *
     * @param map   k为对象字段名，v为对象字段值
     * @param clazz 对象类
     * @return 对象
     */
    public static Object map2object(Map<String, String> map, Class<?> clazz) {
        Object object = null;
        try {
            object = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Object finalObject = object;
        map.forEach((k, v) -> {
            Field[] fields = GoodsConfig.class.getFields();
            for (Field field : fields) {
                //根据字段名找到响应方法
                if (field.getName().equals(k)) {
                    try {
                        //根据成员变量的类型将字符串值转换为相应对象
                        Object value;
                        if (field.getType() != HashMap.class && field.getType() != Map.class) {
                            value = getValue(field.getType(), v);
                        } else {
                            value = parseMap(field.getGenericType(), v);
                        }
                        //对对象进行赋值
                        field.set(finalObject, value);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return object;
    }

    /**
     * 根据类型将字符串转为相应类型的对象
     *
     * @param clazz 转的类型
     * @param value 字符串
     * @return 相应类型值对象
     */
    private static Object getValue(Class<?> clazz, String value) {
        if (clazz == String.class) {//是否字符串
            return value;
        } else if (clazz != Integer.TYPE && clazz != Integer.class) {
            if (clazz != Float.TYPE && clazz != Float.class) {
                if (clazz != Double.TYPE && clazz != Double.class) {
                    if (clazz != Long.TYPE && clazz != Long.class) {
                        if (clazz != Boolean.TYPE && clazz != Boolean.class) {
                            try {
                                if (clazz == int[].class) {
                                    return parseArr(Integer.TYPE, value);
                                } else if (clazz == int[][].class) {
                                    return parse2Arr(Integer.TYPE, value);
                                } else if (clazz == float[].class) {
                                    return parseArr(Float.TYPE, value);
                                } else if (clazz == float[][].class) {
                                    return parse2Arr(Float.TYPE, value);
                                } else if (clazz == double[].class) {
                                    return parseArr(Double.TYPE, value);
                                } else if (clazz == double[][].class) {
                                    return parse2Arr(Double.TYPE, value);
                                } else if (clazz == long[].class) {
                                    return parseArr(Long.TYPE, value);
                                } else if (clazz == long[][].class) {
                                    return parse2Arr(Long.TYPE, value);
                                } else {
                                    return clazz == String[][].class ? parse2Arr(String.class, value) : null;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                return value;
                            }
                        } else
                            return value.equals("1") || value.equalsIgnoreCase("true") || ((!value.equals("0") && !value.equalsIgnoreCase("false")) && Boolean.parseBoolean(value));
                    } else {
                        return value != null && !value.trim().isEmpty() ? Long.valueOf(value) : 0L;
                    }
                } else {
                    return value != null && !value.trim().isEmpty() ? Double.valueOf(value) : 0.0D;
                }
            } else {
                return value != null && !value.trim().isEmpty() ? Float.valueOf(value) : 0.0F;
            }
        } else {
            return value != null && !value.trim().isEmpty() ? Integer.valueOf(value) : 0;
        }
    }

    //1维数字转换
    private static Object parseArr(Class<?> var0, String var1) {
        if (var1 != null && !var1.isEmpty()) {
            if (var1.startsWith("[")) {
                var1 = var1.substring(1, var1.length() - 1);
            }
            String[] var2 = var1.split(",");
            Object var3 = Array.newInstance(var0, var2.length);

            for (int var4 = 0; var4 < var2.length; ++var4) {
                var2[var4] = var2[var4].trim();
                if (var0 == Integer.TYPE) {
                    Array.set(var3, var4, Integer.valueOf(var2[var4]));
                } else if (var0 == Float.TYPE) {
                    Array.set(var3, var4, Float.valueOf(var2[var4]));
                } else if (var0 == Double.TYPE) {
                    Array.set(var3, var4, Double.valueOf(var2[var4]));
                } else if (var0 == String.class) {
                    Array.set(var3, var4, var2[var4]);
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    //2维数组转换
    private static Object parse2Arr(Class<?> var0, String var1) {
        if (var1 != null && !var1.isEmpty()) {
            String[] var2 = var1.substring(2, var1.length() - 2).split("],\\[");
            Object var3 = Array.newInstance(var0, var2.length, 0);

            for (int var4 = 0; var4 < var2.length; ++var4) {
                Array.set(var3, var4, parseArr(var0, var2[var4]));
            }

            return var3;
        } else {
            return null;
        }
    }

    //map转换
    private static Object parseMap(Type var0, String var1) throws Exception {
        if (var1 != null && !var1.isEmpty()) {
            ParameterizedType var2 = (ParameterizedType) var0;
            Type[] var3 = var2.getActualTypeArguments();
            Class[] var4 = new Class[]{(Class) var3[0], (Class) var3[1]};
            Object var5 = HashMap.class.newInstance();
            String[] var6 = var1.split(";");
            for (String var10 : var6) {
                String[] var11 = var10.split(":");
                HashMap.class.getMethod("put", Object.class, Object.class).invoke(var5, getValue(var4[0], var11[0]), getValue(var4[1], var11[1]));
            }

            return var5;
        } else {
            return null;
        }
    }
}