package com.luckygames.wmxz.gamemaster.utils;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.util.Date;

public class DateUtils {
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_COMPACT = "yyyyMMdd";
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIMEFORMAT_COMPACT = "yyyyMMddHHmmss";

    public static String DateToString(Date date) {
        return DateFormatUtils.format(date, DATE_FORMAT);
    }

    public static String DateToStringCompact(Date date) {
        return DateFormatUtils.format(date, DATE_FORMAT_COMPACT);
    }

    public static String DateTimeToString(Date date) {
        return DateFormatUtils.format(date, DATETIME_FORMAT);
    }

    public static String DateTimeToStringCompact(Date date) {
        return DateFormatUtils.format(date, DATETIMEFORMAT_COMPACT);
    }

    public static Date StringToDate(String s) {
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(s, DATE_FORMAT);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date StringToDateTime(String s) {
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(s, DATETIME_FORMAT);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date RandomDateTime(Date from, Date to) {
        return new Date(RandomUtils.nextLong(from.getTime(), to.getTime()));
    }
}
