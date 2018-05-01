package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionDaily;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface PlayerActionDailyService extends BaseService<PlayerActionDailyEntity> {
    void generatePlayerActionDailyReportToday();

    void generatePlayerActionDailyReportYesterday();

    void generatePlayerActionDailyReportByDay(Date date);

    void generatePlayerActionDailyReportByDay(String date);

    PlayerActionDaily findOne(Long channelId, Long serverId, String reportDate);

}
