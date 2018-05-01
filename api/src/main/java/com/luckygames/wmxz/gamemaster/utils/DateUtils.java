package com.luckygames.wmxz.gamemaster.utils;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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

    public static Date Now() {
        return Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static String TodayString() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    }

    public static String YesterdayString() {
        return LocalDate.now().plusDays(-1).format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    }

    public static String TomorrowString() {
        return LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    }

    public static int DayFromDate(String s) {
        if (StringUtils.isBlank(s)) {
            return 0;
        }
        return LocalDate.parse(s, DateTimeFormatter.ofPattern(DATE_FORMAT)).getDayOfMonth();
    }

    public static int MonthFromDate(String s) {
        if (StringUtils.isBlank(s)) {
            return 0;
        }
        return LocalDate.parse(s, DateTimeFormatter.ofPattern(DATE_FORMAT)).getMonthValue();
    }

    public static int YearFromDate(String s) {
        if (StringUtils.isBlank(s)) {
            return 0;
        }
        return LocalDate.parse(s, DateTimeFormatter.ofPattern(DATE_FORMAT)).getYear();
    }

    public static Date AddDays(Date date, int days) {
        return org.apache.commons.lang3.time.DateUtils.addDays(date, days);
    }
}
