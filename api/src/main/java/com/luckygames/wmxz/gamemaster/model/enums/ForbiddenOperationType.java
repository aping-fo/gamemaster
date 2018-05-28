package com.luckygames.wmxz.gamemaster.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum ForbiddenOperationType implements EnumType {
    // * 封禁类型，0：封禁，1：解封
    UNKNOWN(-1, "未知", "Unknown"),
    FORBIDDEN(0, "封禁", "Forbidden"),
    ALLOWED(1, "解封", "Allowed"),;

    private final int code;
    private final String text;
    private final String textEn;

    private ForbiddenOperationType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static ForbiddenOperationType codeOf(int code) {
        for (ForbiddenOperationType value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid ForbiddenOperationType code: " + code);
    }

    public static ForbiddenOperationType textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (ForbiddenOperationType ForbiddenOperationType : values()) {
                if (ForbiddenOperationType.text.equals(text)) {
                    return ForbiddenOperationType;
                }
                if (ForbiddenOperationType.textEn.equals(text)) {
                    return ForbiddenOperationType;
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
