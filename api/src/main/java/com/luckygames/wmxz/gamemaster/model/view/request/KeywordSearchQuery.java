package com.luckygames.wmxz.gamemaster.model.view.request;

public class KeywordSearchQuery extends CommonSearchQuery {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public KeywordSearchQuery(String keyword) {
        this.keyword = keyword;
    }

    public KeywordSearchQuery() {
    }

}
