package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface PlayerActionDailyService extends BaseService<PlayerActionDailyEntity> {
    void generatePlayerActionDailyReportToday();

    void generatePlayerActionDailyReportYesterday();

    void generatePlayerActionDailyReportByDay(Date date);

    void generatePlayerActionDailyReportByDay(String date);

    PlayerActionDaily findOne(Long channelId, Long serverId, String reportDate);

    Page<PlayerActionDaily> searchRegisterPage(CommonSearchQuery commonSearchQuery);
    Page<PlayerActionDaily> searchCharacterPage(CommonSearchQuery commonSearchQuery);

    Page<PlayerActionDaily> searchCharacterAnalysisPage(CommonSearchQuery commonSearchQuery);
}
