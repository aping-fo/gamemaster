package com.luckygames.wmxz.gamemaster.model.view.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PageRequest {
    private int pageNum = 1;
    private int pageSize = 50;
    private String orderField;
    private String orderDirection = "ASC";

    public PageRequest() {

    }

    public PageRequest(int pageNum, int pageSize, String orderField, String orderDirection) {
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

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
