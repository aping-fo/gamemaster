package com.luckygames.wmxz.gamemaster.model.view.request;

public class NewUserSearchQuery extends CommonSearchQuery {
    private Long serverId;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }
}
