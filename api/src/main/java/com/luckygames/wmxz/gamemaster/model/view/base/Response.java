package com.luckygames.wmxz.gamemaster.model.view.base;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class Response extends ModelAndView {
    private Integer statusCode = 200;
    private String message = "操作成功";

    public Response() {
        copyCodeMessage();
    }

    public Response(String viewName) {
        super(viewName);
        copyCodeMessage();
    }

    public Response(ResultCode resultCode) {
        this.statusCode = resultCode.getCode();
        this.message = resultCode.getMessage();
        copyCodeMessage();
    }

    public Response(int code, String message) {
        this.statusCode = code;
        this.message = message;
        copyCodeMessage();
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void copyCodeMessage() {
        data("message", String.format("%s(%d)", message, statusCode));
        data("statusCode", statusCode == 200 ? statusCode : 300);
    }

//-------------------------------------------------------------

    public Response view(String viewName) {
        this.setViewName(viewName);
        return this;
    }

    public Response data(String name, Object value) {
        if (name == null || "".equals(name.trim()) || value == null) {
            return this;
        }
        this.addObject(name, value);
        if (value instanceof Page) {
            Page m = (Page) value;
            Pager pager = new Pager(m.getPageNum(), m.getPageSize(), m.getTotal());
            this.addObject("Pager", pager);
        }
        return this;
    }

    public Response request(Object request) {
        this.addObject("request", request);
        return this;
    }

    public Response pager(Pager pager) {
        this.addObject("Pager", pager);
        return this;
    }

    public Response result(ResultCode resultCode) {
        this.statusCode = resultCode.getCode();
        this.message = resultCode.getMessage();
        copyCodeMessage();
        return this;
    }

    public Response result(int code, String message) {
        this.statusCode = code;
        this.message = message;
        copyCodeMessage();
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public Response json() {
        this.setView(new MappingJackson2JsonView());
        return this;
    }
}
