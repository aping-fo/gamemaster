package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import com.luckygames.wmxz.gamemaster.utils.GameDataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @作者 周聪
 * @时间 2018/9/13 19:48
 */
@Component//数据初始化
@Order(value = 1)
public class InitController implements ApplicationRunner {
    @Autowired
    private ServerService serverService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        //初始化配置表
//        GameDataUtils.loadConfigData();
//
//        //初始化物品表
//        Collection<Object> goodsList = GameDataUtils.getConfigs(GoodsConfig.class);
//        AllDialogController.goodsList = goodsList.stream().sorted(Comparator.comparing((Object o) -> {
//            GoodsConfig goodsConfig = (GoodsConfig) o;
//            return goodsConfig.id;
//        })).collect(Collectors.toList());

        //初始化服务器列表
        ServerSearchQuery query = new ServerSearchQuery();
        AdminController.serverList = serverService.searchPage(query);
    }
}
