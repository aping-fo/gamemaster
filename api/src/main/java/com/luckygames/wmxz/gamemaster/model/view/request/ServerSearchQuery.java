package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class ServerSearchQuery extends KeywordSearchQuery {
    private Integer serverId;
    private String serverName;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ServerSearchQuery(KeywordSearchQuery request) {
        BeanUtils.copyProperties(request, this);
    }

    public ServerSearchQuery() {
    }
}
