package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntity;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageAdd;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageAddSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface GiftpackageAddService extends BaseService<GiftpackageAddEntity> {
    void addGiftpackage(GiftpackageAddSearchQuery giftpackageAddSearchQuery);
    List<GiftpackageAdd> searchType();
}
