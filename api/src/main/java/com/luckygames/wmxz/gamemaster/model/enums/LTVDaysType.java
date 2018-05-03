package com.luckygames.wmxz.gamemaster.model.enums;


public enum LTVDaysType implements EnumType {
    UNKNOWN(0, "未知", "Unknown"),
    ONE(1, "1天", "1 day"),
    TWO(2, "2天", "2 days"),
    THREE(3, "3天", "3 days"),
    FOUR(4, "4天", "4 days"),
    FIVE(5, "5天", "5 days"),
    SIX(6, "6天", "6 days"),
    SEVEN(7, "7天", "7 days"),
    FOURTEEN(14, "14天", "14 days"),
    TWENTYONE(21, "21天", "21 days"),
    THIRTY(30, "30天", "30 days"),
    SIXTY(60, "60天", "60 days"),
    NINETY(90, "90天", "90 days"),;
    private final int code;
    private final String text;
    private final String textEn;

    private LTVDaysType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static LTVDaysType nameOf(String name) {
        try {
            return LTVDaysType.valueOf(name);
        } catch (Exception e) {
        }

        return null;
    }

    public static LTVDaysType codeOf(int code) {
        if (code < 0) {
            return LTVDaysType.UNKNOWN;
        }

        for (LTVDaysType value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid code: " + code);
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String text() {
        return text;
    }

    @Override
    public String textEn() {
        return this.textEn;
    }
}
