package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.Channel;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchRequest;

import java.util.List;

public interface ChannelService {
    List<Channel> searchList(ChannelSearchRequest request);

    Page<Channel> searchPage(ChannelSearchRequest request);
}
