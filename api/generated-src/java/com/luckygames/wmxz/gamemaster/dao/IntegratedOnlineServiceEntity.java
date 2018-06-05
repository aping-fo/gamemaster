package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="integrated_online_service")
public class IntegratedOnlineServiceEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer totalCreationAngle;

    private Integer maxRoleCount;

    private Integer avgRoleCount;

    private Integer minRoleCount;

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

    public Integer getTotalCreationAngle() {
        return totalCreationAngle;
    }

    public void setTotalCreationAngle(Integer totalCreationAngle) {
        this.totalCreationAngle = totalCreationAngle;
    }

    public Integer getMaxRoleCount() {
        return maxRoleCount;
    }

    public void setMaxRoleCount(Integer maxRoleCount) {
        this.maxRoleCount = maxRoleCount;
    }

    public Integer getAvgRoleCount() {
        return avgRoleCount;
    }

    public void setAvgRoleCount(Integer avgRoleCount) {
        this.avgRoleCount = avgRoleCount;
    }

    public Integer getMinRoleCount() {
        return minRoleCount;
    }

    public void setMinRoleCount(Integer minRoleCount) {
        this.minRoleCount = minRoleCount;
    }
}