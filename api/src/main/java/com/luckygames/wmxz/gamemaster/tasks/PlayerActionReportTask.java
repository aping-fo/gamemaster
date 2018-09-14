//package com.luckygames.wmxz.gamemaster.tasks;
//
//import com.luckygames.wmxz.gamemaster.service.CharacterDailyService;
//import com.luckygames.wmxz.gamemaster.service.PlayerActionDailyService;
//import com.luckygames.wmxz.gamemaster.service.PlayerActionLogService;
//import com.luckygames.wmxz.gamemaster.tasks.base.BaseTask;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PlayerActionReportTask extends BaseTask {
//
//    @Autowired
//    private PlayerActionLogService playerActionLogService;
//    @Autowired
//    private PlayerActionDailyService playerActionDailyService;
//    @Autowired
//    private CharacterDailyService characterDailyService;
//
////    @Scheduled(cron = "#{@reportProperties.playerAction.todayCron}")
////    public void generatePlayerActionDailyReportToday() {
////        try {
////            playerActionDailyService.generatePlayerActionDailyReportToday();
////            characterDailyService.generateCharacterDailyReportToday();
////        } catch (Exception e) {
////            e.printStackTrace();
////            logger.error("Task failed :{}", e.getMessage());
////        }
////    }
////
////    @Scheduled(cron = "#{@reportProperties.playerAction.yesterdayCron}")
////    public void generatePlayerActionDailyReportYesterday() {
////        try {
////            playerActionDailyService.generatePlayerActionDailyReportYesterday();
////            characterDailyService.generateCharacterDailyReportYesterday();
////        } catch (Exception e) {
////            e.printStackTrace();
////            logger.error("Task failed :{}", e.getMessage());
////        }
////    }
//}
