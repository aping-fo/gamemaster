package com.luckygames.wmxz.gamemaster.model.view.request;

import java.util.Date;

public class CharacterTransferSearchQuery extends CommonSearchQuery {
    private Long playerId;

    private Long currentId;

    private Long toId;

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

    public Long getCurrentId() {
        return currentId;
    }

    public void setCurrentId(Long currentId) {
        this.currentId = currentId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }
}
