package com.luckygames.wmxz.gamemaster.common.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "report")
public class ReportProperties {
    private CronSetting cityAccount;
    private CronSetting update;

    public CronSetting getCityAccount() {
        return cityAccount;
    }

    public void setCityAccount(CronSetting cityAccount) {
        this.cityAccount = cityAccount;
    }

    public CronSetting getUpdate() {
        return update;
    }

    public void setUpdate(CronSetting update) {
        this.update = update;
    }

    public static class CronSetting {
        private String todayCron;
        private String yesterdayCron;
        private String lastWeekCron;
        private String lastMonthCron;

        public String getYesterdayCron() {
            return yesterdayCron;
        }

        public void setYesterdayCron(String yesterdayCron) {
            this.yesterdayCron = yesterdayCron;
        }

        public String getTodayCron() {
            return todayCron;
        }

        public void setTodayCron(String todayCron) {
            this.todayCron = todayCron;
        }

        public String getLastWeekCron() {
            return lastWeekCron;
        }

        public void setLastWeekCron(String lastWeekCron) {
            this.lastWeekCron = lastWeekCron;
        }

        public String getLastMonthCron() {
            return lastMonthCron;
        }

        public void setLastMonthCron(String lastMonthCron) {
            this.lastMonthCron = lastMonthCron;
        }
    }
}
