package com.luckygames.wmxz.gamemaster.utils;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class GameDataUtils {
    private static Map<String, Map<Integer, Object>> data = new HashMap();

    public GameDataUtils() {
    }

    public static <T> T getConfig(Class<T> var0, int var1) {
        return (T) ((Map) data.get(var0.getSimpleName())).get(var1);
    }

    public static Collection<Object> getConfigs(Class<?> var0) {
        return ((Map) data.get(var0.getSimpleName())).values();
    }

    public static void loadConfigData() throws Exception {
        List var0 = loadClassByPackageName("com.luckygames.wmxz.gamemaster.data");
        Iterator var1 = var0.iterator();

        while (true) {
            Class var2;
            do {
                if (!var1.hasNext()) {
                    return;
                }

                var2 = (Class) var1.next();
            } while (var2.getSimpleName().equals("Response"));

            Object var3 = null;
            String var4 = null;

            try {
                Map var5 = loadConfigFile(var2.getSimpleName());

                int var8;
                Object var9;
                label59:
                for (Iterator var6 = var5.entrySet().iterator(); var6.hasNext(); addConfig(var2.getSimpleName(), var8, var9)) {
                    Entry var7 = (Entry) var6.next();
                    var8 = (Integer) var7.getKey();
                    var9 = var2.newInstance();
                    Iterator var10 = ((Map) var7.getValue()).entrySet().iterator();

                    while (true) {
                        while (true) {
                            if (!var10.hasNext()) {
                                continue label59;
                            }

                            Entry var11 = (Entry) var10.next();
                            String var12 = (String) var11.getKey();
                            var4 = (String) var11.getValue();
                            Field[] var13 = var2.getFields();
                            int var14 = var13.length;

                            for (int var15 = 0; var15 < var14; ++var15) {
                                Field var16 = var13[var15];
                                if (var16.getName().equals(var12)) {
                                    Object var17 = null;
                                    if (var16.getType() != HashMap.class && var16.getType() != Map.class) {
                                        var17 = getValue(var16.getType(), var4);
                                    } else {
                                        var17 = parseMap(var16.getGenericType(), var4);
                                    }

                                    var16.set(var9, var17);
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Exception var18) {
                var18.printStackTrace();
                throw var18;
            }
        }
    }

    private static void addConfig(String var0, int var1, Object var2) {
        Object var3 = (Map) data.get(var0);
        if (var3 == null) {
            var3 = new HashMap();
            data.put(var0, (Map<Integer, Object>) var3);
        }

        ((Map) var3).put(var1, var2);
    }

    private static List<Class<?>> loadClassByPackageName(String var0) {
        LinkedList var1 = new LinkedList();

        try {
            String var2 = var0.replace(".", "/");
            Enumeration var3 = Thread.currentThread().getContextClassLoader().getResources(var2);

            while (true) {
                URL var4;
                String var5;
                do {
                    if (!var3.hasMoreElements()) {
                        return var1;
                    }

                    var4 = (URL) var3.nextElement();
                    var5 = var4.getProtocol();
                } while (!"file".equals(var5));

                String var6 = URLDecoder.decode(var4.getFile(), "UTF-8");
                File[] var7 = (new File(var6)).listFiles();
                File[] var8 = var7;
                int var9 = var7.length;

                for (int var10 = 0; var10 < var9; ++var10) {
                    File var11 = var8[var10];
                    if (var11.getName().indexOf(".class") >= 0) {
                        String var12 = var11.getName().substring(0, var11.getName().length() - 6);
                        Class var13 = Thread.currentThread().getContextClassLoader().loadClass(var0 + '.' + var12);
                        var1.add(var13);
                    }
                }
            }
        } catch (Exception var14) {
            var14.printStackTrace();
            return var1;
        }
    }

    private static Map<Integer, Map<String, String>> loadConfigFile(String var0) throws Exception {
        HashMap var1 = new HashMap();
        DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
        DocumentBuilder var3 = var2.newDocumentBuilder();
        //System.out.println("路径="+System.getProperty("user.dir"));

        //String var4 = System.getProperty("user.dir").concat("\\api\\src\\main\\java\\com\\luckygames\\wmxz\\gamemaster\\data").concat(File.separator).concat(var0).concat(".xml");
        File file = ResourceUtils.getFile("classpath:GoodsConfig.xml");
        Document var5 = var3.parse(file);
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

        return var1;
    }

    private static Object getValue(Class<?> var0, String var1) throws Exception {
        if (var0 == String.class) {
            return var1;
        } else if (var0 != Integer.TYPE && var0 != Integer.class) {
            if (var0 != Float.TYPE && var0 != Float.class) {
                if (var0 != Double.TYPE && var0 != Double.class) {
                    if (var0 != Long.TYPE && var0 != Long.class) {
                        if (var0 != Boolean.TYPE && var0 != Boolean.class) {
                            if (var0 == int[].class) {
                                return parseArr(Integer.TYPE, var1);
                            } else if (var0 == int[][].class) {
                                return parse2Arr(Integer.TYPE, var1);
                            } else if (var0 == float[].class) {
                                return parseArr(Float.TYPE, var1);
                            } else if (var0 == float[][].class) {
                                return parse2Arr(Float.TYPE, var1);
                            } else if (var0 == double[].class) {
                                return parseArr(Double.TYPE, var1);
                            } else if (var0 == double[][].class) {
                                return parse2Arr(Double.TYPE, var1);
                            } else if (var0 == long[].class) {
                                return parseArr(Long.TYPE, var1);
                            } else if (var0 == long[][].class) {
                                return parse2Arr(Long.TYPE, var1);
                            } else if (var0 == String[].class) {
                                return parseArr(String.class, var1);
                            } else {
                                return var0 == String[][].class ? parse2Arr(String.class, var1) : null;
                            }
                        } else if (!var1.equals("1") && !var1.equalsIgnoreCase("true")) {
                            return !var1.equals("0") && !var1.equalsIgnoreCase("false") ? Boolean.parseBoolean(var1) : false;
                        } else {
                            return true;
                        }
                    } else {
                        return var1 != null && !var1.trim().isEmpty() ? Long.valueOf(var1) : 0L;
                    }
                } else {
                    return var1 != null && !var1.trim().isEmpty() ? Double.valueOf(var1) : 0.0D;
                }
            } else {
                return var1 != null && !var1.trim().isEmpty() ? Float.valueOf(var1) : 0.0F;
            }
        } else {
            return var1 != null && !var1.trim().isEmpty() ? Integer.valueOf(var1) : 0;
        }
    }

    private static Object parseArr(Class<?> var0, String var1) throws Exception {
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

    private static Object parse2Arr(Class<?> var0, String var1) throws Exception {
        if (var1 != null && !var1.isEmpty()) {
            String[] var2 = var1.substring(2, var1.length() - 2).split("\\],\\[");
            Object var3 = Array.newInstance(var0, new int[]{var2.length, 0});

            for (int var4 = 0; var4 < var2.length; ++var4) {
                Array.set(var3, var4, parseArr(var0, var2[var4]));
            }

            return var3;
        } else {
            return null;
        }
    }

    private static Object parseMap(Type var0, String var1) throws Exception {
        if (var1 != null && !var1.isEmpty()) {
            ParameterizedType var2 = (ParameterizedType) var0;
            Type[] var3 = var2.getActualTypeArguments();
            Class[] var4 = new Class[]{(Class) var3[0], (Class) var3[1]};
            Object var5 = HashMap.class.newInstance();
            String[] var6 = var1.split(";");
            String[] var7 = var6;
            int var8 = var6.length;

            for (int var9 = 0; var9 < var8; ++var9) {
                String var10 = var7[var9];
                String[] var11 = var10.split("\\:");
                HashMap.class.getMethod("put", Object.class, Object.class).invoke(var5, getValue(var4[0], var11[0]), getValue(var4[1], var11[1]));
            }

            return var5;
        } else {
            return null;
        }
    }
}

