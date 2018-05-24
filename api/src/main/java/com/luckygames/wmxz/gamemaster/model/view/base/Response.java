package com.luckygames.wmxz.gamemaster.model.view.base;

import com.github.pagehelper.Page;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class Response extends ModelAndView {
    public Response() {
    }

    public Response(String viewName) {
        super(viewName);
    }

    public Response(String viewName, Map<String, ?> model) {
        super(viewName, model);
    }

    public Response(String viewName, HttpStatus status) {
        super(viewName, status);
    }

    public Response(String viewName, Map<String, ?> model, HttpStatus status) {
        super(viewName, model, status);
    }

    public Response(String viewName, String modelName, Object modelObject) {
        super(viewName, modelName, modelObject);
        if (modelObject != null && modelObject instanceof Page) {
            Page m = (Page) modelObject;
            Pager pager = new Pager(m.getPageNum(), m.getPageSize(), m.getTotal());
            this.addObject("Pager", pager);
        }
    }

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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
