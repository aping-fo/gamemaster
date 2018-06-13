package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageSync;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface GiftpackageSyncMapper extends GiftpackageSyncEntityMapper<GiftpackageSyncEntity> {

    @SelectProvider(type = GiftpackageSyncSqlProvider.class, method = "queryGiftpackageSyncReportFromOrderSingleDate")
    List<GiftpackageSync> queryGiftpackageSyncReportFromOrderSingleDate(String singleDate);

    @SelectProvider(type = GiftpackageSyncSqlProvider.class, method = "queryGiftpackageSyncReport")
    List<GiftpackageSync> queryGiftpackageSyncReport(GiftpackageSyncSearchQuery query);
}
