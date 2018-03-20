package com.luckygames.wmxz.gamemaster.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class DateUtils {
    public static final String DATEFORMAT = "yyyy-MM-dd";

    public static String DateToString(Date date) {
        return DateFormatUtils.format(date, DATEFORMAT);
    }
}
