package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.GoodsRecoveryEntity;
import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;
import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface GoodsRecoveryService extends BaseNewService<GoodsRecoveryEntity> {
    Page<GoodsRecovery> searchPage(GoodsRecoverySearchQuery query);
}
