package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class ServerSearchQuery extends KeywordSearchQuery {
    public ServerSearchQuery(KeywordSearchQuery request) {
        BeanUtils.copyProperties(request, this);
    }

    public ServerSearchQuery() {
    }
}
