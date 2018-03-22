package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.PageRequest;

public class KeywordSearchRequest extends PageRequest {
    private String keyword;

    public KeywordSearchRequest() {

    }

    public KeywordSearchRequest(String keyword) {
        this.keyword = keyword;
    }

    public KeywordSearchRequest(Integer pageNum, Integer pageSize, String orderField, String orderDirection, String keyword) {
        super(pageNum, pageSize, orderField, orderDirection);
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

}
