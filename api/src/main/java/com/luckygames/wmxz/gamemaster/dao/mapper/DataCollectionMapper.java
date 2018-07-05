package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntity;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.Date;
import java.util.List;

public interface DataCollectionMapper extends DataCollectionEntityMapper<DataCollectionEntity> {
    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryDataCollectionReportFromOrderSingleDate")
    List<DataCollection> queryDataCollectionReportFromOrderSingleDate(Date singleDate);

    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryDataCollectionReport")
    List<DataCollection> queryRechargeDailyReport(DataCollectionSearchQuery query);

    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryChannelDataReport")
    List<DataCollection> queryChannelDataReport(ChannelDataSearchQuery query);

    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryChannelDailyReport")
    List<DataCollection> queryChannelDailyReport(ChannelDataSearchQuery query,Integer type);
}
