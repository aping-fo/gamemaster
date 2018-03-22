package com.luckygames.wmxz.gamemaster.model.view.request;

public class ChannelSearchRequest extends KeywordSearchRequest {
    public ChannelSearchRequest(KeywordSearchRequest request) {
        this.setKeyword(request.getKeyword());
        this.setPageNum(request.getPageNum());
        this.setPageSize(request.getPageSize());
        this.setOrderField(request.getOrderField());
        this.setOrderDirection(request.getOrderDirection());
    }

    public ChannelSearchRequest() {
    }

    public ChannelSearchRequest(String keyword) {
        super(keyword);
    }

    public ChannelSearchRequest(Integer pageNum, Integer pageSize, String orderField, String orderDirection, String keyword) {
        super(pageNum, pageSize, orderField, orderDirection, keyword);
    }
}
