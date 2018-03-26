package generator.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BeanUtils {
    private static PropertyDescriptor getPropertyDescriptor(PropertyDescriptor[] pds, PropertyDescriptor ref,
                                                            boolean isStrict) {
        if (ref.getDisplayName().equals("class")) {
            return null;
        }

        for (PropertyDescriptor pd : pds) {
            if (isStrict) {
                if (pd.equals(ref)) {
                    return pd;
                }
            } else {
                if (ref.getPropertyType().equals(pd.getPropertyType()) && pd.getName().equals(ref.getName())) {
                    return pd;
                }
            }
        }
        return null;
    }


    public static void copyProperties(Object fromObj, Object toObj) throws BeanCopyException {
        copyProperties(fromObj, toObj, false);
    }

    public static void copyProperties(Object fromObj, Object toObj, boolean ignoreNull) throws BeanCopyException {
        if (fromObj == null || toObj == null) {
            return;
        }

        Class<? extends Object> fromClass = fromObj.getClass();
        Class<? extends Object> toClass = toObj.getClass();
        boolean isStrict = (fromClass == toClass);

        try {
            BeanInfo fromBean = Introspector.getBeanInfo(fromClass);
            BeanInfo toBean = Introspector.getBeanInfo(toClass);

            final PropertyDescriptor[] toPds = toBean.getPropertyDescriptors();
            final PropertyDescriptor[] fromPds = fromBean.getPropertyDescriptors();

            for (PropertyDescriptor toPd : toPds) {
                PropertyDescriptor fromPd = getPropertyDescriptor(fromPds, toPd, isStrict);
                if (fromPd != null && fromPd.getDisplayName().equals(toPd.getDisplayName())) {
                    Method writeMethod = toPd.getWriteMethod();
                    Method readMethod = fromPd.getReadMethod();
                    if (writeMethod != null && readMethod != null) {
                        Object param = readMethod.invoke(fromObj, (Object[]) null);
                        if (ignoreNull && param == null) {
                            continue;
                        }
                        writeMethod.invoke(toObj, param);
                    }
                }
            }
        } catch (Exception e) {
            throw new BeanCopyException(e);
        }
    }

    public static <T> T copyProperties(Object from, Class<T> toClass) throws BeanCopyException {
        if (from == null) {
            return null;
        }

        T to;
        try {
            to = toClass.newInstance();
            copyProperties(from, to);
        } catch (InstantiationException e) {
            throw new BeanCopyException(e);
        } catch (IllegalAccessException e) {
            throw new BeanCopyException(e);
        }
        return to;
    }

    public static <T> List<T> copyListProperties(Collection<? extends Object> fromList, Class<T> toClass) throws BeanCopyException {
        if (fromList == null) {
            return null;
        }

        List<T> result = new ArrayList<T>(fromList.size());
        for (Object from : fromList) {
            T to = copyProperties(from, toClass);
            result.add(to);
        }
        return result;
    }
}
