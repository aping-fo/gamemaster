package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerActionLogSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PlayerActionLogMapper extends PlayerActionLogEntityMapper<PlayerActionLogEntity> {
    @SelectProvider(type = PlayerActionLogSqlProvider.class, method = "queryEquipmentCountReport")
    List<PlayerActionLog> queryEquipmentCountReport(CommonSearchQuery query);

    @SelectProvider(type = PlayerActionLogSqlProvider.class, method = "searchLeaveLoss")
    Page<PlayerActionLog> searchLeaveLoss(PlayerActionLogSearchQuery query);

    @SelectProvider(type = PlayerActionLogSqlProvider.class, method = "searchLeaveDistribution")
    Page<PlayerActionLog> searchLeaveDistribution(PlayerActionLogSearchQuery query);

    @SelectProvider(type = PlayerActionLogSqlProvider.class, method = "searchLeProduceExpend")
    Page<PlayerActionLog> searchLeProduceExpend(PlayerActionLogSearchQuery query);
}