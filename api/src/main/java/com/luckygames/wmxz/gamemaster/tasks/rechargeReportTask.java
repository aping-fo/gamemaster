package com.luckygames.wmxz.gamemaster.tasks;

import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import com.luckygames.wmxz.gamemaster.service.ReportService;
import com.luckygames.wmxz.gamemaster.tasks.base.BaseTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class rechargeReportTask extends BaseTask {
    @Autowired
    private RechargeDailyService rechargeDailyService;
    @Autowired
    private ReportService reportService;

    @Scheduled(cron = "#{@reportProperties.rechargeDaily.todayCron}")
    public void generateRechargeDailyReportToday() {
        try {
            rechargeDailyService.generateRechargeDailyReportToday();
            reportService.generateDataCollectionReportToday();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }

    @Scheduled(cron = "#{@reportProperties.rechargeDaily.yesterdayCron}")
    public void generateRechargeDailyReportYesterDay() {
        try {
            rechargeDailyService.generateRechargeDailyReportYesterDay();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }
}
