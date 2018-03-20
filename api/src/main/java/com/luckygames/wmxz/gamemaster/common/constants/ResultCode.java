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

    USER_WRONG_PASSWORD(1100, "用户密码错误"), SESSION_EXPIRED(1101, "会话过期");


    private final int code;
    private final String message;

    private ResultCode(int code, String message) {
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
