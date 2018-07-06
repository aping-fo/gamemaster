package com.luckygames.wmxz.gamemaster.model.view.request;

public class ServerOnlineLogQuery extends CommonSearchQuery {
    private Integer searchType = 0;

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }
}
