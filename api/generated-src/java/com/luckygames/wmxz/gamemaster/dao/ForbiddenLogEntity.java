package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="forbidden_log")
public class ForbiddenLogEntity extends BaseNewEntity {
    private Long serverId;

    private Long playerId;

    private Long charId;

    private String ipAddress;

    private Integer forbiddenType;

    private Date expireTime;

    private String reason;

    private Integer operateType;

    private Date operateTime;

    private String playerName;

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

    public Integer getForbiddenType() {
        return forbiddenType;
    }

    public void setForbiddenType(Integer forbiddenType) {
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

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName == null ? null : playerName.trim();
    }
}