package com.luckygames.wmxz.gamemaster.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum MailType implements EnumType {
    // * 封禁类型，1：禁止登录，2：禁止聊天
    UNKNOWN(0, "未知", "Unknown"),
    SERVER(1, "全服群发", "Server Mail"),
    LEVEL(2, "等级范围群发", "Level Range Mail"),
    CHAR(3, "角色群发", "Character Mail"),;

    private final int code;
    private final String text;
    private final String textEn;

    private MailType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static MailType codeOf(int code) {
        for (MailType value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid MailType code: " + code);
    }

    public static MailType textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (MailType ForbiddenType : values()) {
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
