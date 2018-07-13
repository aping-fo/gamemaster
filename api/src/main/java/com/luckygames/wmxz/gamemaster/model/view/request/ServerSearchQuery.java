package com.luckygames.wmxz.gamemaster.model.view.request;

public class ServerSearchQuery extends KeywordSearchQuery {
    private Integer serverId;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public ServerSearchQuery(KeywordSearchQuery request) {

        this.setKeyword(request.getKeyword());
        this.setPageNum(request.getPageNum());
        this.setPageSize(request.getPageSize());
        this.setOrderField(request.getOrderField());
        this.setOrderDirection(request.getOrderDirection());
    }

    public ServerSearchQuery() {
    }

    public ServerSearchQuery(String keyword) {
        super(keyword);
    }

    public ServerSearchQuery(Integer pageNum, Integer pageSize, String orderField, String orderDirection, String keyword) {
        super(pageNum, pageSize, orderField, orderDirection, keyword);
    }
}
