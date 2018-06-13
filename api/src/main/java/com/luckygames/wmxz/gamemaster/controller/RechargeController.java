package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
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
    private RechargeMonthlyService rechargeMonthlyService;
    @Autowired
    private RechargeMonthlyDayService rechargeMonthlyDayService;
    @Autowired
    private RechargeFailedOrderService rechargeFailedOrderService;
    @Autowired
    private RechargeErroneousOrderService rechargeErroneousOrderService;


    @RequestMapping(value = "/daily", method = {RequestMethod.GET, RequestMethod.POST})
    public Response dailyRecharge(RechargeDailySearchQuery rechargeDailySearchRequest) {
        if (rechargeDailySearchRequest.getPageNum() == null) {
            rechargeDailySearchRequest.setPageNum(1);
        }
        Page<RechargeDaily> rechargeDailies = rechargeDailyService.searchPage(rechargeDailySearchRequest);

        return new Response("recharge/daily")
                .request(rechargeDailySearchRequest)
                .data("rechargeDailyList", rechargeDailies);
    }

    @RequestMapping(value = "/order", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderList(PlayerOrderSearchQuery playerOrderSearchQuery) {
        if (playerOrderSearchQuery.getPageNum() == null) {
            playerOrderSearchQuery.setPageNum(1);
        }
        Page<PlayerOrder> orderDailies = playerOrderService.searchPage(playerOrderSearchQuery);

        return new Response("recharge/order")
                .request(playerOrderSearchQuery)
                .data("orderList", orderDailies);
    }

    @RequestMapping(value = "/statics", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderStatics(RechargeMonthlySearchQuery rechargeMonthlySearchQuery) {
        if (rechargeMonthlySearchQuery.getPageNum() == null) {
            rechargeMonthlySearchQuery.setPageNum(1);
        }
        if (StringUtils.isBlank(rechargeMonthlySearchQuery.getStartDate())) {
            rechargeMonthlySearchQuery.setStartDate(DateUtils.TodayString());
        } else if (rechargeMonthlySearchQuery.getStartDate().length() < 10) {
            rechargeMonthlySearchQuery.setStartDate(rechargeMonthlySearchQuery.getStartDate() + "-01");
        }
        Page<RechargeMonthly> rechargeMonthlyPage = rechargeMonthlyService.searchPage(rechargeMonthlySearchQuery);

        return new Response("recharge/statics")
                .request(rechargeMonthlySearchQuery)
                .data("rechargeMonthlyList", rechargeMonthlyPage);
    }

    //失败订单
    @RequestMapping(value = "/failedOrder", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderfailedOrder(RechargeFailedOrderSearchQuery rechargeFailedOrderSearchQuery) {
//        rechargeFailedOrderService.generateRechargeFailedOrderReportToday();
        Page<RechargeFailedOrder> rechargeFailedOrderPage = rechargeFailedOrderService.searchPage(rechargeFailedOrderSearchQuery);
        return new Response("recharge/failedOrder")
                .request(rechargeFailedOrderSearchQuery)
                .data("rechargeFailedOrderList", rechargeFailedOrderPage);
    }

    //错误订单
    @RequestMapping(value = "/erroneousOrder", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderErroneousOrder(RechargeErroneousOrderSearchQuery rechargeErroneousOrderSearchQuery) {
//        rechargeErroneousOrderService.generateRechargeErroneousOrderReportToday();
        Page<RechargeErroneousOrder> rechargeErroneousOrderPage = rechargeErroneousOrderService.searchPage(rechargeErroneousOrderSearchQuery);

        return new Response("recharge/erroneousOrder")
                .request(rechargeErroneousOrderSearchQuery)
                .data("rechargeErroneousOrderList", rechargeErroneousOrderPage);
    }
}
