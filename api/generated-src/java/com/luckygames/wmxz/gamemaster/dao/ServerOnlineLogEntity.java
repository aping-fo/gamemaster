package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="server_online_log")
public class ServerOnlineLogEntity extends BaseEntity {
    private Long serverId;

    private String reportDate;

    private Integer reportHour;

    private Integer onlineCount;

    private Integer maxOnlineCount;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public Integer getReportHour() {
        return reportHour;
    }

    public void setReportHour(Integer reportHour) {
        this.reportHour = reportHour;
    }

    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public Integer getMaxOnlineCount() {
        return maxOnlineCount;
    }

    public void setMaxOnlineCount(Integer maxOnlineCount) {
        this.maxOnlineCount = maxOnlineCount;
    }
}