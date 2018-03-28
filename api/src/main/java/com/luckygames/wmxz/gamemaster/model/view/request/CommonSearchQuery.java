package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.PageQuery;

import java.util.List;

/**
 * Created by lucky on 2018/3/28.
 */
public class CommonSearchQuery extends PageQuery {
    private List<Long> serverId;
    private List<Long> channelId;
    private String startDate;
    private String endDate;

    public List<Long> getServerId() {
        return serverId;
    }

    public void setServerId(List<Long> serverId) {
        this.serverId = serverId;
    }

    public List<Long> getChannelId() {
        return channelId;
    }

    public void setChannelId(List<Long> channelId) {
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
