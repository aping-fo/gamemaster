package com.luckygames.wmxz.gamemaster.model.view.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PageRequest {
    private Integer pageNum;
    private Integer pageSize = 50;
    private String orderField;
    private String orderDirection = "ASC";

    public PageRequest() {

    }

    public PageRequest(Integer pageNum, Integer pageSize, String orderField, String orderDirection) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderField = orderField;
        this.orderDirection = orderDirection;
    }

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
