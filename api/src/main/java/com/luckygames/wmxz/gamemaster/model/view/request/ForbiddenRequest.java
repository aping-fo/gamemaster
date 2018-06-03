package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenOperationType;
import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenType;

import java.util.List;

public class ForbiddenRequest {
    private Long serverId;
    private ForbiddenType forbiddenType;
    private ForbiddenOperationType forbiddenOperationType;
    private Integer hour;
    private String reason;
    private List<Long> charIds;

    public ForbiddenOperationType getForbiddenOperationType() {
        return forbiddenOperationType;
    }

    public void setForbiddenOperationType(ForbiddenOperationType forbiddenOperationType) {
        this.forbiddenOperationType = forbiddenOperationType;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public ForbiddenType getForbiddenType() {
        return forbiddenType;
    }

    public void setForbiddenType(ForbiddenType forbiddenType) {
        this.forbiddenType = forbiddenType;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Long> getCharIds() {
        return charIds;
    }

    public void setCharIds(List<Long> charIds) {
        this.charIds = charIds;
    }
}
