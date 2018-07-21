package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class ChannelSearchQuery extends KeywordSearchQuery {
    private Long channelId;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public ChannelSearchQuery() {
    }

    public ChannelSearchQuery(KeywordSearchQuery request) {
        BeanUtils.copyProperties(request, this);
    }
}
