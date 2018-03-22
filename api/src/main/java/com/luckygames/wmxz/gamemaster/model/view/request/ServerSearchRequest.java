package com.luckygames.wmxz.gamemaster.model.view.request;

public class ServerSearchRequest extends KeywordSearchRequest {
    public ServerSearchRequest(KeywordSearchRequest request) {

        this.setKeyword(request.getKeyword());
        this.setPageNum(request.getPageNum());
        this.setPageSize(request.getPageSize());
        this.setOrderField(request.getOrderField());
        this.setOrderDirection(request.getOrderDirection());
    }

    public ServerSearchRequest() {
    }

    public ServerSearchRequest(String keyword) {
        super(keyword);
    }

    public ServerSearchRequest(Integer pageNum, Integer pageSize, String orderField, String orderDirection, String keyword) {
        super(pageNum, pageSize, orderField, orderDirection, keyword);
    }
}
