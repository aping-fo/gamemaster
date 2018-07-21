package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class ServerSearchQuery extends KeywordSearchQuery {
    private Integer serverId;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public ServerSearchQuery(KeywordSearchQuery request) {
        BeanUtils.copyProperties(request, this);
    }

    public ServerSearchQuery() {
    }
}
