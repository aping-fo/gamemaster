package com.luckygames.wmxz.gamemaster.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum BroadcastType implements EnumType {
    // * 封禁类型，1：禁止登录，2：禁止聊天
    UNKNOWN(0, "未知", "Unknown"),
    BROADCAST(1, "广播", "Broadcast"),
    AFFICHE(2, "公告", "Affiche"),;

    private final int code;
    private final String text;
    private final String textEn;

    private BroadcastType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static BroadcastType codeOf(int code) {
        for (BroadcastType value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid BroadcastType code: " + code);
    }

    public static BroadcastType textOf(String text) {
        if (StringUtils.isNotBlank(text)) {
            for (BroadcastType broadcastType : values()) {
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
