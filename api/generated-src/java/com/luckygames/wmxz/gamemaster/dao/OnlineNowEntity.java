package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="online_now")
public class OnlineNowEntity extends BaseEntity {
    private Long charId;

    private String charName;

    private String userName;

    private Date lastLoginTime;

    private Integer maxOnlineLength;

    private Integer mapId;

    private String playerIp;

    private Integer online;

    private Integer serverId;

    private String serverName;

    private Integer channelId;

    private String channelName;

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName == null ? null : charName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getMaxOnlineLength() {
        return maxOnlineLength;
    }

    public void setMaxOnlineLength(Integer maxOnlineLength) {
        this.maxOnlineLength = maxOnlineLength;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getPlayerIp() {
        return playerIp;
    }

    public void setPlayerIp(String playerIp) {
        this.playerIp = playerIp == null ? null : playerIp.trim();
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }
}