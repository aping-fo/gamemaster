package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Broadcast;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface BroadcastService extends BaseNewService<BroadcastEntity> {
    Page<Broadcast> searchPage(BroadcastSearchQuery query);

    void deleteById(Long id);

    Broadcast searchById(Long id);
}
