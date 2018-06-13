package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderSqlProvider;
import com.luckygames.wmxz.gamemaster.dao.RechargeStaticsSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeStatics;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PlayerOrderMapper extends PlayerOrderEntityMapper<PlayerOrderEntity> {
    @SelectProvider(type = RechargeStaticsSqlProvider.class, method = "queryServerRechargeTotalReportFromOrder")
    List<RechargeStatics> queryServerRechargeStaticsReportFromOrder();

    @SelectProvider(type = PlayerOrderSqlProvider.class, method = "queryPlayerOrder")
    List<PlayerOrder> queryPlayerOrder(PlayerOrderSearchQuery query);
}