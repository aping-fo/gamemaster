package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeMonthly;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeMonthlySearchQuery;
import com.luckygames.wmxz.gamemaster.service.PlayerOrderService;
import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import com.luckygames.wmxz.gamemaster.service.RechargeMonthlyDayService;
import com.luckygames.wmxz.gamemaster.service.RechargeMonthlyService;
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
}
