package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerActionLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface PlayerActionLogService extends BaseService<PlayerActionLogEntity> {
    Date getCharaterLastLogout(Long charId);

    Page<PlayerActionLog> searchEquipmentCountPage(CommonSearchQuery query);

    Page<PlayerActionLog> searchLeaveLoss(PlayerActionLogSearchQuery query);

    Page<PlayerActionLog> searchLeaveDistribution(PlayerActionLogSearchQuery query);

    Page<PlayerActionLog> searchLeProduceExpend(PlayerActionLogSearchQuery query);
}
