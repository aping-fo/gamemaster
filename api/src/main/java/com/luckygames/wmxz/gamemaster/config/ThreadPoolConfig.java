package com.luckygames.wmxz.gamemaster.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @作者 周聪
 * @时间 2018/10/19 16:06
 */
@Component//数据初始化
@Order(value = 2)
public class ThreadPoolConfig {
    private static final ExecutorService executor = new ThreadPoolExecutor(2, 4, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(120000), new ThreadPoolExecutor.DiscardPolicy());
    public static ExecutorService getExecutorService(){
        return executor;
    }
}
