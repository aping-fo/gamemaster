package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageSync;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface GiftpackageSyncService extends BaseNewService<GiftpackageSyncEntity> {
    void addGiftpackage(GiftpackageSyncSearchQuery giftpackageSyncSearchRequest);

    Page<GiftpackageSync> searchPage(GiftpackageSyncSearchQuery GiftpackageSyncSearchRequest);

    void delete(int id);

    GiftpackageSync searchById(Integer id);
}
