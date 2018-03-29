package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchQuery;

import java.util.List;

public interface ChannelService {
    List<Channel> searchList(ChannelSearchQuery request);

    Page<Channel> searchPage(ChannelSearchQuery request);
}
