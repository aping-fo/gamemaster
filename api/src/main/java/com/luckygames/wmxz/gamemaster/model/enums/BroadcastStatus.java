package com.luckygames.wmxz.gamemaster.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum BroadcastStatus implements EnumType {
    // * 封禁类型，1：禁止登录，2：禁止聊天
    UNKNOWN(0, "未知", "Unknown"),
    ENABLED(1, "有效", "Enabled"),
    DISABLED(2, "关闭", "Disabled"),;

    private final int code;
    private final String text;
    private final String textEn;

    private BroadcastStatus(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static BroadcastStatus codeOf(int code) {
        for (BroadcastStatus value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid BroadcastStatus code: " + code);
    }

    public static BroadcastStatus textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (BroadcastStatus broadcastType : values()) {
                if (broadcastType.text.equals(text)) {
                    return broadcastType;
                }
                if (broadcastType.textEn.equals(text)) {
                    return broadcastType;
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
