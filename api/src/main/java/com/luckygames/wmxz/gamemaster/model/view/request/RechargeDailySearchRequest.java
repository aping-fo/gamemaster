package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.PageRequest;

public class RechargeDailySearchRequest extends PageRequest {
    private Long serverId;
    private Long channelId;
    private String startDate;
    private String endDate;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
