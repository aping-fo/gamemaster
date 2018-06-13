package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.GiftpackageSyncMapper;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageSync;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

@Service("GiftpackageSyncService")
public class GiftpackageSyncServiceImpl extends BaseServiceImpl<GiftpackageSyncEntity> implements GiftpackageSyncService {
    @Autowired
    private GiftpackageSyncMapper GiftpackageSyncMapper;

    @Override
    public Mapper<GiftpackageSyncEntity> getMapper() {
        return GiftpackageSyncMapper;
    }

    @Override
    public void addGiftpackage(GiftpackageSyncSearchQuery giftpackageSyncSearchQuery) {
        GiftpackageSync giftpackageSync = new GiftpackageSync();
        giftpackageSync.setCardType(giftpackageSyncSearchQuery.getName());
        giftpackageSync.setCardCount(giftpackageSyncSearchQuery.getCount());
        giftpackageSync.setMinTermValidity(DateUtils.StringToDate(giftpackageSyncSearchQuery.getMinTermValidity()));
        giftpackageSync.setMaxTermValidity(DateUtils.StringToDate(giftpackageSyncSearchQuery.getMaxTermValidity()));
        giftpackageSync.setGenerateTime(new Date());
        giftpackageSync.setChannelId(giftpackageSyncSearchQuery.getChannelId());
        giftpackageSync.setServerId(giftpackageSyncSearchQuery.getServerId());
        create(giftpackageSync);
    }

    @Override
    public Page<GiftpackageSync> searchPage(GiftpackageSyncSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> GiftpackageSyncMapper.queryGiftpackageSyncReport(query));
    }

}
