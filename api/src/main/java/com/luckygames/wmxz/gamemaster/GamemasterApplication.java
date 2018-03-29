package com.luckygames.wmxz.gamemaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableScheduling
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.luckygames.wmxz.gamemaster.dao.mapper")
@SpringBootApplication
public class GamemasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamemasterApplication.class, args);
    }
}
