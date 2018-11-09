package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ChannelMapper;
import com.luckygames.wmxz.gamemaster.dao.mapper.GiftpackageSyncMapper;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageSync;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("GiftpackageSyncService")
public class GiftpackageSyncServiceImpl extends BaseNewServiceImpl<GiftpackageSyncEntity> implements GiftpackageSyncService {
    @Autowired
    private GiftpackageSyncMapper GiftpackageSyncMapper;
    @Autowired
    private ServerMapper serverMapper;
    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public Mapper<GiftpackageSyncEntity> getMapper() {
        return GiftpackageSyncMapper;
    }

    @Override
    public void addGiftpackage(GiftpackageSyncSearchQuery giftpackageSyncSearchQuery) {
//        GiftpackageSync giftpackageSync = new GiftpackageSync();
//        giftpackageSync.setCardType(giftpackageSyncSearchQuery.getName());
//        giftpackageSync.setCardCount(giftpackageSyncSearchQuery.getCount());
//        giftpackageSync.setMinTermValidity(DateUtils.StringToDate(giftpackageSyncSearchQuery.getMinTermValidity()));
//        giftpackageSync.setMaxTermValidity(DateUtils.StringToDate(giftpackageSyncSearchQuery.getMaxTermValidity()));
//        giftpackageSync.setGenerateTime(new Date());
//        giftpackageSync.setChannelId(giftpackageSyncSearchQuery.getChannelId());
//        giftpackageSync.setServerId(giftpackageSyncSearchQuery.getServerId());
//        ServerEntity serverEntity = serverMapper.selectByPrimaryKey(giftpackageSyncSearchQuery.getServerId());
//        giftpackageSync.setServerName(serverEntity.getServerName());
//        ChannelEntity channelEntity = channelMapper.selectByPrimaryKey(giftpackageSyncSearchQuery.getChannelId());
//        giftpackageSync.setChannelName(channelEntity.getChannelName());
//        giftpackageSync.setCardFile(System.currentTimeMillis()+".xls");
//        giftpackageSync.setActivityId(1);
//        giftpackageSync.setIsExclusiveGiftbag(0);
//        giftpackageSync.setIsActivation(0);
//        giftpackageSync.setGenerateType(giftpackageSyncSearchQuery.getGenerateType());
//        create(giftpackageSync);
    }

    @Override
    public Page<GiftpackageSync> searchPage(GiftpackageSyncSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> GiftpackageSyncMapper.searchPage(query));
    }

    @Override
    public void delete(int id) {
        GiftpackageSyncMapper.deleteByPrimaryKey(id);
    }

    @Override
    public GiftpackageSync searchById(Integer id) {
        return GiftpackageSyncMapper.selectById(id);
    }

    @Override
    public int searchLast() {
        return GiftpackageSyncMapper.searchLast();
    }

}
