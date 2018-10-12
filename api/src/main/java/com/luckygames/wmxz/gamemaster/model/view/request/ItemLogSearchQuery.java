package com.luckygames.wmxz.gamemaster.model.view.request;

public class ItemLogSearchQuery extends CommonSearchQuery {
    private Long playerId;
    private Long serverId;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}
