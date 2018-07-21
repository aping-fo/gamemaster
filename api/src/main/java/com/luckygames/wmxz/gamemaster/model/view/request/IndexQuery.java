package com.luckygames.wmxz.gamemaster.model.view.request;

public class IndexQuery extends CommonSearchQuery {
    private Long serverId;
    private Long channelId;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }
}