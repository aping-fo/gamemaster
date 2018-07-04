package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Broadcast;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface BroadcastService extends BaseService<BroadcastEntity> {
    Page<Broadcast> searchPage(BroadcastSearchQuery query);
}
