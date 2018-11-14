package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class ServerSearchQuery extends CommonSearchQuery {
    private Integer serverId;
    private String serverName;
    private String keyword;
    private Integer open;
    private String serverGroup;
    private Long fromServer;
    private Long toServer;

    public Long getFromServer() {
        return fromServer;
    }

    public void setFromServer(Long fromServer) {
        this.fromServer = fromServer;
    }

    public Long getToServer() {
        return toServer;
    }

    public void setToServer(Long toServer) {
        this.toServer = toServer;
    }

    public String getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(String serverGroup) {
        this.serverGroup = serverGroup;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

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
