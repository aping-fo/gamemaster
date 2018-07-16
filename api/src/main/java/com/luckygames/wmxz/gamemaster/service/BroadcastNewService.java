package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.BroadcastNewEntity;
import com.luckygames.wmxz.gamemaster.model.entity.BroadcastNew;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastNewSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface BroadcastNewService extends BaseService<BroadcastNewEntity> {
    Page<BroadcastNew> searchPage(BroadcastNewSearchQuery query);

    void deleteById(Long id);

    BroadcastNew searchById(Long id);
}
