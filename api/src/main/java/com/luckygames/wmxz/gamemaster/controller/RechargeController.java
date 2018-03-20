package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.dao.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchRequest;
import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/recharge")
public class RechargeController extends BaseController {

    @Autowired
    private RechargeDailyService rechargeDailyService;

    @RequestMapping(value = "/daily", method = {RequestMethod.GET, RequestMethod.POST})
    public Response dailyRecharge(RechargeDailySearchRequest rechargeDailySearchRequest) {
        Page<RechargeDaily> rechargeDailies = rechargeDailyService.search(rechargeDailySearchRequest);

        Response r = new Response("recharge/daily")
                .data("rechargeDailies", rechargeDailies)
                .data("request", rechargeDailySearchRequest);
        System.out.println(r);
        return r;
    }
}
