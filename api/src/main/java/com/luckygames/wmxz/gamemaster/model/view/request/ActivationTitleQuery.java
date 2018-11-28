package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

public class ActivationTitleQuery extends GMQuery {
   private int playerId;
   private int type;
   private int value;

    public ActivationTitleQuery(Long serverId, int playerId, int type, int value) {
        super(serverId);
        this.playerId = playerId;
        this.type = type;
        this.value = value;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
