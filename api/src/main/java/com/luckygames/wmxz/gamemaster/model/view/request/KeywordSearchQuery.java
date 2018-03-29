package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.PageQuery;

public class KeywordSearchQuery extends PageQuery {
    private String keyword;

    public KeywordSearchQuery() {

    }

    public KeywordSearchQuery(String keyword) {
        this.keyword = keyword;
    }

    public KeywordSearchQuery(Integer pageNum, Integer pageSize, String orderField, String orderDirection, String keyword) {
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
