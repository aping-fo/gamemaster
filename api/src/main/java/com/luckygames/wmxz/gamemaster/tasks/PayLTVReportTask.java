package com.luckygames.wmxz.gamemaster.tasks;

import com.luckygames.wmxz.gamemaster.service.PayLTVDayService;
import com.luckygames.wmxz.gamemaster.service.PayLTVService;
import com.luckygames.wmxz.gamemaster.tasks.base.BaseTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PayLTVReportTask extends BaseTask {

    @Autowired
    private PayLTVService payLTVService;
    @Autowired
    private PayLTVDayService payLTVDayService;

    @Scheduled(cron = "#{@reportProperties.payLtv.todayCron}")
    public void generatePayLTVDailyReportToday() {
        try {
            payLTVService.generatePayLTVDailyReportToday();
            payLTVDayService.generatePayLTVDayReportToday();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }

    @Scheduled(cron = "#{@reportProperties.payLtv.yesterdayCron}")
    public void generatePayLTVDailyReportYesterday() {
        try {
            payLTVService.generatePayLTVDailyReportYesterday();
            payLTVDayService.generatePayLTVDayReportYesterday();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Task failed :{}", e.getMessage());
        }
    }
}
