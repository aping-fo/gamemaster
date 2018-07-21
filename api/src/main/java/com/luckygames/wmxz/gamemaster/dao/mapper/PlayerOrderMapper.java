package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderSqlProvider;
import com.luckygames.wmxz.gamemaster.dao.RechargeStaticsSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeStatics;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.math.BigDecimal;
import java.util.List;

public interface PlayerOrderMapper extends PlayerOrderEntityMapper<PlayerOrderEntity> {
    @SelectProvider(type = RechargeStaticsSqlProvider.class, method = "queryServerRechargeTotalReportFromOrder")
    List<RechargeStatics> queryServerRechargeStaticsReportFromOrder();

    @SelectProvider(type = PlayerOrderSqlProvider.class, method = "queryPlayerOrder")
    List<PlayerOrder> queryPlayerOrder(PlayerOrderSearchQuery query);

    @SelectProvider(type = PlayerOrderSqlProvider.class, method = "update")
    void update(String orderCode);

    @Select("select sum(amount) rechargeAmount from player_order where server_id = #{serverId}")
    BigDecimal sumRechargeAmount(Long serverId);

    @Select("select count(char_id) rechargeCount from (select char_id from player_order where server_id = #{serverId} group by char_id ) a")
    Integer countRechargeCount(Long serverId);
}