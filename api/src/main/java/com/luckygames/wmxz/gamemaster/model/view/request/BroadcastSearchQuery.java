package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.BroadcastStatus;
import com.luckygames.wmxz.gamemaster.model.enums.BroadcastType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class BroadcastSearchQuery extends CommonSearchQuery {
    private BroadcastType broadcastType;
    private BroadcastStatus broadcastStatus;
    private Long id;
    private Long serverId;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
