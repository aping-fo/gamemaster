package com.luckygames.wmxz.gamemaster.model.enums;


public enum OrderFailureReason implements EnumType {
    UNKNOWN(0, "未知", "Unknown"),
    SERVER(1, "服务器不正确", "Server"),
    ACCOUNT(2, "账号或角色不存在", "Account");

    private final int code;
    private final String text;
    private final String textEn;

    private OrderFailureReason(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static OrderFailureReason nameOf(String name) {
        try {
            return OrderFailureReason.valueOf(name);
        } catch (Exception e) {
        }

        return null;
    }

    public static OrderFailureReason codeOf(int code) {
        if (code < 0) {
            return OrderFailureReason.UNKNOWN;
        }

        for (OrderFailureReason value : values()) {
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
