package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class ChannelSearchQuery extends KeywordSearchQuery {
    public ChannelSearchQuery() {
    }

    public ChannelSearchQuery(KeywordSearchQuery request) {
        BeanUtils.copyProperties(request, this);
    }
}
