package com.luckygames.wmxz.gamemaster.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum ForbiddenType implements EnumType {
    // * 封禁类型，1：禁止登录，2：禁止聊天
    UNKNOWN(0, "未知", "Unknown"),
    LOGIN(1, "禁止登录", "Login Forbidden"),
    CHAT(2, "禁止聊天", "Chat Forbidden"),;

    private final int code;
    private final String text;
    private final String textEn;

    private ForbiddenType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static ForbiddenType codeOf(int code) {
        for (ForbiddenType value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid ForbiddenType code: " + code);
    }

    public static ForbiddenType textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (ForbiddenType ForbiddenType : values()) {
                if (ForbiddenType.text.equals(text)) {
                    return ForbiddenType;
                }
                if (ForbiddenType.textEn.equals(text)) {
                    return ForbiddenType;
                }
            }
        }
        return UNKNOWN;
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

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getTextEn() {
        return textEn;
    }
}
