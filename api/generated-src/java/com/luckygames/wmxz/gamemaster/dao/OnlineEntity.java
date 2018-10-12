package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import javax.persistence.Table;

@Table(name="online")
public class OnlineEntity extends BaseNewEntity {
    private String maxRoleCount;

    private String avgRoleCount;

    private String minRoleCount;

    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    public String getMaxRoleCount() {
        return maxRoleCount;
    }

    public void setMaxRoleCount(String maxRoleCount) {
        this.maxRoleCount = maxRoleCount == null ? null : maxRoleCount.trim();
    }

    public String getAvgRoleCount() {
        return avgRoleCount;
    }

    public void setAvgRoleCount(String avgRoleCount) {
        this.avgRoleCount = avgRoleCount == null ? null : avgRoleCount.trim();
    }

    public String getMinRoleCount() {
        return minRoleCount;
    }

    public void setMinRoleCount(String minRoleCount) {
        this.minRoleCount = minRoleCount == null ? null : minRoleCount.trim();
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }
}