package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenOperationType;
import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenType;
import java.util.Date;
import javax.persistence.Table;

@Table(name="forbidden_log")
public class ForbiddenLogEntity extends BaseEntity {
    private Long serverId;

    private Long playerId;

    private Long charId;

    private String ipAddress;

    private ForbiddenType forbiddenType;

    private Date expireTime;

    private String reason;

    private ForbiddenOperationType operateType;

    private Date operateTime;

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

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public ForbiddenType getForbiddenType() {
        return forbiddenType;
    }

    public void setForbiddenType(ForbiddenType forbiddenType) {
        this.forbiddenType = forbiddenType;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public ForbiddenOperationType getOperateType() {
        return operateType;
    }

    public void setOperateType(ForbiddenOperationType operateType) {
        this.operateType = operateType;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}