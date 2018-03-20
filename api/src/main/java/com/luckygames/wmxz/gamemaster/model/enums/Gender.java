package com.luckygames.wmxz.gamemaster.model.enums;


import org.apache.commons.lang3.StringUtils;

/**
 * 性别
 */
public enum Gender implements EnumType {
    UNKNOWN(0, "未知", "Unknown"),
    MALE(1, "男", "Male"),
    FEMALE(2, "女", "Female"),;

    private final int code;
    private final String text;
    private final String textEn;

    private Gender(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static Gender codeOf(int code) {
        for (Gender value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid Gender code: " + code);
    }

    public static Gender textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (Gender gender : values()) {
                if (gender.text.equals(text)) {
                    return gender;
                }
                if (gender.textEn.equals(text)) {
                    return gender;
                }
            }
        }
        return UNKNOWN;
    }

    public int code() {
        return code;
    }

    public String text() {
        return text;
    }

    @Override
    public String textEn() {
        return this.textEn;
    }
}
