package com.luckygames.wmxz.gamemaster.model.enums;


public enum Status implements EnumType {
    DELETED(-1, "已删除", "Deleted"),
    UNKNOWN(0, "未知", "Unknown"),
    NORMAL(1, "正常(有效)", "Normal"),
    INVALID(2, "无效", "Invalid"),;
    private final int code;
    private final String text;
    private final String textEn;

    private Status(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static Status nameOf(String name) {
        try {
            return Status.valueOf(name);
        } catch (Exception e) {
        }

        return null;
    }

    public static Status codeOf(int code) {
        if (code < 0) {
            return Status.DELETED;
        }

        for (Status value : values()) {
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
