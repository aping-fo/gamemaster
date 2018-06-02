package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.PageQuery;

import java.util.List;

/**
 * Created by lucky on 2018/3/28.
 */
public class CommonSearchQuery extends PageQuery {
    private List<Long> serverIds;
    private List<Long> channelIds;
    private String startDate;
    private String endDate;

    public List<Long> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<Long> serverIds) {
        this.serverIds = serverIds;
    }

    public List<Long> getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(List<Long> channelIds) {
        this.channelIds = channelIds;
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
