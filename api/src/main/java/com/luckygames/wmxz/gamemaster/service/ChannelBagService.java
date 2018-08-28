package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.ChannelBagEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ChannelBag;
import com.luckygames.wmxz.gamemaster.model.view.request.PackageSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.List;

public interface ChannelBagService extends BaseService<ChannelBagEntity> {
    List<ChannelBag> searchPageByChannelId(Long channelId);

    List<ChannelBag> searchPage(PackageSearchQuery query);
}
