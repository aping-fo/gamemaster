package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PlayerActionLogMapper extends PlayerActionLogEntityMapper<PlayerActionLogEntity> {
    @SelectProvider(type = PlayerActionLogSqlProvider.class, method = "queryEquipmentCountReport")
    List<PlayerActionLog> queryEquipmentCountReport(CommonSearchQuery query);
}