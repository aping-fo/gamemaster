package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.BroadcastStatus;
import com.luckygames.wmxz.gamemaster.model.enums.BroadcastType;

public class BroadcastSearchQuery extends CommonSearchQuery {
    private BroadcastType broadcastType;
    private BroadcastStatus broadcastStatus;

    public BroadcastType getBroadcastType() {
        return broadcastType;
    }

    public void setBroadcastType(BroadcastType broadcastType) {
        this.broadcastType = broadcastType;
    }

    public BroadcastStatus getBroadcastStatus() {
        return broadcastStatus;
    }

    public void setBroadcastStatus(BroadcastStatus broadcastStatus) {
        this.broadcastStatus = broadcastStatus;
    }
}
