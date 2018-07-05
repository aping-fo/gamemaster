package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeFailedOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeFailedOrderSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RechargeFailedOrderMapper extends RechargeFailedOrderEntityMapper<RechargeFailedOrderEntity> {
    @SelectProvider(type = RechargeFailedOrderSqlProvider.class, method = "searchPage")
    List<RechargeFailedOrder> searchPage(RechargeFailedOrderSearchQuery query);
}
