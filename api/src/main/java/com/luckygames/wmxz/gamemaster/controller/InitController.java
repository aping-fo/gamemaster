package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.XmlUtil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @作者 周聪
 * @时间 2018/9/13 19:48
 */
@Component//数据初始化
@Order(value = 1)
public class InitController extends BaseController implements ApplicationRunner {
    @Autowired
    private ServerService serverService;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private ActivationCodeService activationCodeService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("初始化参数...");

        //初始化物品表
        initGoodsConfig();

        //初始化服务器列表
        ServerSearchQuery query = new ServerSearchQuery();
        AdminController.serverList = serverService.searchPage(query);

        //初始化公告
        AdminController.notice = noticeService.searchLast();

        //初始化礼包序号
        ActivationCode activationCode = activationCodeService.searchLast();
        int value = 0;
        if (activationCode != null) {
            value = Integer.valueOf(activationCode.getName().substring(5, 8));
        }
        OperatingToolsController.Activation_Code_batch = value;

        System.out.println("加载完毕...");
    }

    //初始化物品表
    private void initGoodsConfig() {
        List<Object> objects = XmlUtil2.xml2map("GoodsConfig.xml", GoodsConfig.class);
        List<GoodsConfig> goodsList = new ArrayList<>();
        objects.forEach(o -> {
            GoodsConfig goodsConfig = (GoodsConfig) o;
            goodsList.add(goodsConfig);
        });
        AllDialogController.goodsList = goodsList;

        AllDialogController.goodsList = AllDialogController.goodsList.stream().sorted(Comparator.comparing((Object o) -> {
            GoodsConfig goodsConfig = (GoodsConfig) o;
            return goodsConfig.id;
        })).collect(Collectors.toList());
    }
}
