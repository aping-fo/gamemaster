package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeStatics;
import com.luckygames.wmxz.gamemaster.model.view.base.PageQuery;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchQuery;
import com.luckygames.wmxz.gamemaster.service.PlayerOrderService;
import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import com.luckygames.wmxz.gamemaster.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/recharge")
public class RechargeController extends BaseController {

    @Autowired
    private RechargeDailyService rechargeDailyService;
    @Autowired
    private PlayerOrderService playerOrderService;
    @Autowired
    private RechargeService rechargeService;

    @RequestMapping(value = "/daily", method = {RequestMethod.GET, RequestMethod.POST})
    public Response dailyRecharge(RechargeDailySearchQuery rechargeDailySearchRequest) {
        if (rechargeDailySearchRequest.getPageNum() == null) {
            rechargeDailySearchRequest.setPageNum(1);
        }
        Page<RechargeDaily> rechargeDailies = rechargeDailyService.searchPage(rechargeDailySearchRequest);

        Response r = new Response("recharge/daily")
                .request(rechargeDailySearchRequest)
                .data("rechargeDailyList", rechargeDailies);
        return r;
    }

    @RequestMapping(value = "/order", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderList(PlayerOrderSearchQuery playerOrderSearchQuery) {
        if (playerOrderSearchQuery.getPageNum() == null) {
            playerOrderSearchQuery.setPageNum(1);
        }
        Page<PlayerOrder> orderDailies = playerOrderService.searchPage(playerOrderSearchQuery);

        Response r = new Response("recharge/order")
                .request(playerOrderSearchQuery)
                .data("orderList", orderDailies);
        return r;
    }

    @RequestMapping(value = "/statics", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderStatics(CommonSearchQuery pageQueryRequest) {
        if (pageQueryRequest.getPageNum() == null) {
            pageQueryRequest.setPageNum(1);
        }
        Page<RechargeStatics> orderStatics = rechargeService.queryServerRechargeTotal(pageQueryRequest);

        Response r = new Response("recharge/statics")
                .request(pageQueryRequest)
                .data("statics", orderStatics);
        return r;
    }
}
