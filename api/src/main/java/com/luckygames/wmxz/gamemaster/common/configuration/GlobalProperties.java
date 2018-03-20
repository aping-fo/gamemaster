package com.luckygames.wmxz.gamemaster.common.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "global")
public class GlobalProperties {
    private String host;
    private String imageCleanCron;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getImageCleanCron() {
        return imageCleanCron;
    }

    public void setImageCleanCron(String imageCleanCron) {
        this.imageCleanCron = imageCleanCron;
    }
}
