package com.luckygames.wmxz.gamemaster.model.view.base;

import java.lang.reflect.Field;

/**
 * Created by lucky on 2018/3/29.
 */
public class GMQuery {
    public String encodeReqParams() {
        StringBuilder sb = new StringBuilder("?");
        Field[] fields = this.getClass().getDeclaredFields();
        try {
            for (Field f : fields) {
                boolean flag = f.isAccessible();
                f.setAccessible(true);
                sb.append(f.getName()).append("=").append(f.get(this)).append("&");
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (Exception e) {
            //ignore
        }
        return sb.toString();
    }
}
