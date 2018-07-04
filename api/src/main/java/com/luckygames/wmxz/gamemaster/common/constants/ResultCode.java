package com.luckygames.wmxz.gamemaster.common.constants;

public enum ResultCode {
    // Use standard HTTP status code
    OK(200, "OK"),
    CREATED(201, "Created"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    CONFLICT(409, "Conflict"),
    INTERNAL_SERVER_ERROR(500, " Internal Server Error"),
    UPDATE_ERROR(1000, "请求无法处理，原因可能是：1）资源不存在，2）状态已改变。建议重新加载后重试。"),

    USER_WRONG_PASSWORD(1100, "用户密码错误"),
    SESSION_EXPIRED(1101, "会话过期"),

    CHARACTER_NOT_FOUND(2000, "玩家角色不存在"),
    CHARACTER_ID_INVALID(2001, "角色ID错误"),
    CHARACTER_FORBIDDEN_FAILD(2002, "封禁角色失败"),
    CHARACTER_NAME_INVALID(2003, "角色名称错误"),
    CHARACTER_LEVEL_INVALID(2004, "角色等级错误"),

    SERVER_NOT_FOUND(3000, "区服不存在"),
    SERVER_ID_INVALID(3001, "区服ID错误"),

    SEND_MAIL_FAILED(4001, "发送邮件异常"),
    CONTENT_INVALID(4002, "广播/公告内存错误"),
    SEND_BROADCAST_FAILED(4003, "发送广播/公告异常");


    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
