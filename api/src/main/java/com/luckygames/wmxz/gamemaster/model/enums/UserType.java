package com.luckygames.wmxz.gamemaster.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum UserType implements EnumType {
    USER(0, "User", "User"),
    ADMIN(1, "Admin", "Admin"),
    UNKNOWN(-1, "Unknown", "Unknown"),;

    private final int code;
    private final String text;
    private final String textEn;

    private UserType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static UserType codeOf(int code) {
        for (UserType value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid UserType code: " + code);
    }

    public static UserType textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (UserType userType : values()) {
                if (userType.text.equals(text)) {
                    return userType;
                }
                if (userType.textEn.equals(text)) {
                    return userType;
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
