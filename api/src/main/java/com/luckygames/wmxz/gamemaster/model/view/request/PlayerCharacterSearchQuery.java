package com.luckygames.wmxz.gamemaster.model.view.request;

public class PlayerCharacterSearchQuery extends CommonSearchQuery {
    private Integer searchKey;
    private String keyword;

    public Integer getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(Integer searchKey) {
        this.searchKey = searchKey;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
