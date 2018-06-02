package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RechargeDailyMapper extends RechargeDailyEntityMapper<RechargeDailyEntity> {

    @SelectProvider(type = RechargeDailySqlProvider.class, method = "queryRechargeDailyReportFromOrderSingleDate")
    List<RechargeDaily> queryRechargeDailyReportFromOrderSingleDate(String singleDate);

    @SelectProvider(type = RechargeDailySqlProvider.class, method = "queryRechargeDailyReport")
    List<RechargeDaily> queryRechargeDailyReport(RechargeDailySearchQuery query);
}
