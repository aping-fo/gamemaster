package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageSync;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface GiftpackageSyncMapper extends GiftpackageSyncEntityMapper<GiftpackageSyncEntity> {

    @SelectProvider(type = GiftpackageSyncSqlProvider.class, method = "searchPage")
    List<GiftpackageSync> searchPage(GiftpackageSyncSearchQuery query);

    @SelectProvider(type = GiftpackageSyncSqlProvider.class, method = "selectById")
    GiftpackageSync selectById(Integer id);

    @Select("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA. TABLES WHERE TABLE_NAME = 'giftpackage_sync'")
    int searchLast();
}
