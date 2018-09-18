package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.GoodsRecoveryEntity;
import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;
import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface GoodsRecoveryService extends BaseService<GoodsRecoveryEntity> {
    Page<GoodsRecovery> searchPage(GoodsRecoverySearchQuery query);
    void addGoodsRecovery(GoodsRecoverySearchQuery query);
    HashMap<Long,String> goodsMap();
}
