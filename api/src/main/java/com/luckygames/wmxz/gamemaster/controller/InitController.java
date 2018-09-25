package com.luckygames.wmxz.gamemaster.controller;

import com.alibaba.fastjson.JSONObject;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ActivationCodeService;
import com.luckygames.wmxz.gamemaster.service.GiftpackageSyncService;
import com.luckygames.wmxz.gamemaster.service.NoticeService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import com.luckygames.wmxz.gamemaster.utils.GameDataUtils;
import com.luckygames.wmxz.gamemaster.utils.XmlUtil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
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
        OperatingToolsController.Activation_Code_batch = Integer.valueOf(activationCodeService.searchLast().getName().substring(5, 8));

        System.out.println("加载完毕...");
    }

    //初始化物品表
    private void initGoodsConfig() throws IllegalAccessException, InvocationTargetException {
        Map<Integer, Map<String, String>> goodsConfig1 = XmlUtil2.toMap();
        for (Map<String, String> map : goodsConfig1.values()) {
            GoodsConfig goodsConfig = new GoodsConfig();
            for (Map.Entry<String, String> map2 : map.entrySet()) {
                Method[] methods = GoodsConfig.class.getMethods();
                for (Method method : methods) {
                    String name = method.getName();
                    if (!name.startsWith("set")) {
                        continue;
                    }
                    name = name.substring(3, name.length());
                    name = name.substring(0, 1).toLowerCase() + name.substring(1, name.length());
                    if (!map2.getKey().equals(name) || map2.getValue().trim().equals("")) {
                        continue;
                    }
                    if (method.getParameterTypes()[0] == Long.class) {
                        method.invoke(goodsConfig, Long.parseLong(map2.getValue()));
                    } else if (method.getParameterTypes()[0] == float.class) {
                        method.invoke(goodsConfig, Float.parseFloat(map2.getValue()));
                    } else if (method.getParameterTypes()[0] == String.class) {
                        method.invoke(goodsConfig, map2.getValue());
                    } else if (method.getParameterTypes()[0].getName().equals("int")) {
                        method.invoke(goodsConfig, Integer.parseInt(map2.getValue()));
                    } else if (method.getParameterTypes()[0].getName().equals("[I")) {
                        continue;
//                        String value = map2.getValue();
//                        if(!value.contains(",")){
//                            method.invoke(goodsConfig, Integer.parseInt(value.substring(1, value.length() - 1)));
//                            continue;
//                        }
//
//                        String[] values = value.substring(1, value.length() - 1).split(",");
//                        int[] valuesTemp = new int[values.length];
//                        for (int i = 0; i < values.length; i++) {
//                            valuesTemp[i] = Integer.parseInt(values[i]);
//                        }
//                        method.invoke(goodsConfig, valuesTemp);
                    } else if (method.getParameterTypes()[0].getName().equals("[[I")) {
                        continue;
//                        String value = map2.getValue();
//                        String[] values = value.substring(2, value.length() - 2).split("[],\\[]");
//                        int[][] vaulueTmep = new int[1][2];
//                        vaulueTmep[0][0] = Integer.parseInt(values[0]);
//                        vaulueTmep[0][1] = Integer.parseInt(values[1]);
//                        method.invoke(goodsConfig, vaulueTmep);
                    } else {
                        logger.error("未知的参数类型" + method.getParameterTypes()[0]);
                        continue;
                    }
                }
            }
            AllDialogController.goodsList.add(goodsConfig);
        }
        AllDialogController.goodsList = AllDialogController.goodsList.stream().sorted(Comparator.comparing((Object o) -> {
            GoodsConfig goodsConfig = (GoodsConfig) o;
            return goodsConfig.id;
        })).collect(Collectors.toList());
    }
}
