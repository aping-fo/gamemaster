package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChannelEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface ChannelService extends BaseService<ChannelEntity> {
    List<Channel> searchList(ChannelSearchQuery request);

    Page<Channel> searchPage(ChannelSearchQuery request);

    Channel getByChannelId(Long channelId);

    long countChannles();

    Channel fixOpenDate(Long channelId, Date registerDate);
}
