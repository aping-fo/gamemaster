package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntity;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface DataCollectionMapper extends DataCollectionEntityMapper<DataCollectionEntity> {
    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryDataCollectionReportFromOrderSingleDate")
    List<DataCollection> queryDataCollectionReportFromOrderSingleDate(Date singleDate);

    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryDataCollectionReport")
    List<DataCollection> queryRechargeDailyReport(DataCollectionSearchQuery query);

    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryChannelDataReport")
    List<DataCollection> queryChannelDataReport(ChannelDataSearchQuery query);

    @SelectProvider(type = DataCollectionSqlProvider.class, method = "queryChannelDailyReport")
    List<DataCollection> queryChannelDailyReport(ChannelDataSearchQuery query,Integer type);

    @Select("call channel_daily_import2(#{startDate},#{endDate},${type})")
    List<LinkedHashMap> queryChannelDailyReport2(@Param("startDate") String startDate, @Param("endDate")String endDate,@Param("type")Integer type);
}
