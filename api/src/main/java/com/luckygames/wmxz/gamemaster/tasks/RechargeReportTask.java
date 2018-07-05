package com.luckygames.wmxz.gamemaster.tasks;

import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import com.luckygames.wmxz.gamemaster.service.RechargeFailedOrderService;
import com.luckygames.wmxz.gamemaster.service.RechargeMonthlyService;
import com.luckygames.wmxz.gamemaster.tasks.base.BaseTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RechargeReportTask extends BaseTask {
    @Autowired
    private RechargeDailyService rechargeDailyService;
    @Autowired
    private RechargeMonthlyService rechargeMonthlyService;

    @Scheduled(cron = "#{@reportProperties.rechargeDaily.todayCron}")
    public void generateRechargeDailyReportToday() {
        try {
            rechargeDailyService.generateRechargeDailyReportToday();
            rechargeMonthlyService.generateRechargeMonthlyReportToday();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }

    @Scheduled(cron = "#{@reportProperties.rechargeDaily.yesterdayCron}")
    public void generateRechargeDailyReportYesterDay() {
        try {
            rechargeDailyService.generateRechargeDailyReportYesterDay();
            rechargeMonthlyService.generateRechargeMonthlyReportYesterday();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }
}
