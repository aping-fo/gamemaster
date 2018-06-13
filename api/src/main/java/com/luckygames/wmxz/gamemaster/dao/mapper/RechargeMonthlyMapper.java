package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeMonthly;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeMonthlySearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RechargeMonthlyMapper extends RechargeMonthlyEntityMapper<RechargeMonthlyEntity> {
    @SelectProvider(type = RechargeMonthlySqlProvider.class, method = "queryRechargeMonthlyReport")
    List<RechargeMonthly> queryRechargeMonthlyReport(RechargeMonthlySearchQuery query);
}
