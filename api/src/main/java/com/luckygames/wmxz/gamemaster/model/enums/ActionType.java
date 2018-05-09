package com.luckygames.wmxz.gamemaster.model.enums;


public enum ActionType implements EnumType {
    //动作类型：1激活、2注册、3创建角色、4登录、5离线，更多待补充
    UNKNOWN(0, "未知", "Unknown"),
    ACTIVATE(1, "激活", "Activate"),
    NEW_PLAYER(2, "注册", "Register a new player"),
    NEW_CHAR(3, "创角", "Register a new character"),
    ONLINE(4, "登录", "Online"),
    OFFLINE(5, "离线", "Offline"),;
    private final int code;
    private final String text;
    private final String textEn;

    private ActionType(int code, String text, String textEn) {
        this.code = code;
        this.text = text;
        this.textEn = textEn;
    }

    public static ActionType nameOf(String name) {
        try {
            return ActionType.valueOf(name);
        } catch (Exception e) {
        }

        return null;
    }

    public static ActionType codeOf(int code) {
        if (code < 0) {
            return ActionType.UNKNOWN;
        }

        for (ActionType value : values()) {
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
