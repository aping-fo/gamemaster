package com.luckygames.wmxz.gamemaster.tasks;

import com.luckygames.wmxz.gamemaster.service.PlayerActionDailyService;
import com.luckygames.wmxz.gamemaster.service.PlayerActionLogService;
import com.luckygames.wmxz.gamemaster.tasks.base.BaseTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PlayerActionReportTask extends BaseTask {

    @Autowired
    private PlayerActionLogService playerActionLogService;
    @Autowired
    private PlayerActionDailyService playerActionDailyService;

    @Scheduled(cron = "#{@reportProperties.playerAction.todayCron}")
    public void generateRechargeDailyReportToday() {
        try {
            playerActionDailyService.generatePlayerActionDailyReportToday();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }
}
