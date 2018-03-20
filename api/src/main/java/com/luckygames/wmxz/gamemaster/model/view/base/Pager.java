package com.luckygames.wmxz.gamemaster.model.view.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Pager {
    private int pageNum;
    private int pageSize;
    private int totalPages;
    private long totalElements;
    private int currentElements;

    public Pager(int pageNum, int pageSize, long totalElements) {
        if (pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize <= 0) {
            pageSize = 50;
        }
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalElements = totalElements;

        this.totalPages = (int) totalElements / pageSize + 1;
        this.currentElements = (int) ((pageNum == totalPages) ? totalElements % pageSize : pageSize);
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public int getCurrentElements() {
        return currentElements;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
