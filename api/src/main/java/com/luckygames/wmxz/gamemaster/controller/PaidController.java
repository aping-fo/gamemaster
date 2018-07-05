package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.NewUser;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTV;
import com.luckygames.wmxz.gamemaster.model.entity.PayRetentionRate;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import com.luckygames.wmxz.gamemaster.service.NewUserService;
import com.luckygames.wmxz.gamemaster.service.PayLTVService;
import com.luckygames.wmxz.gamemaster.service.PayRetentionRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/paid")
public class PaidController extends BaseController {
    @Autowired
    private PayLTVService payLTVService;
    @Autowired
    private PayRetentionRateService payRetentionRateService;
    @Autowired
    private NewUserService newUserService;

    @RequestMapping(value = "/ltv", method = {RequestMethod.GET, RequestMethod.POST})
    public Response ltv(LTVSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<PayLTV> payLTVPage = payLTVService.searchSummaryPage(query);
        return new Response("paid/ltv")
                .request(query)
                .data("payLTVList", payLTVPage)
                .data("days", LTVDaysType.values());

    }

    //付费留存率
    @RequestMapping(value = "/payRetentionRate", method = {RequestMethod.GET, RequestMethod.POST})
    public Response payRetentionRate(CommonSearchQuery query) {
        Page<PayRetentionRate> payRetentionRatePage = payRetentionRateService.searchPage(query);
        return new Response("paid/stay")
                .request(query)
                .data("list", payRetentionRatePage);
    }

    //新增用户数据
    @RequestMapping(value = "/newuser", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryNewuser(NewUserSearchQuery query) {
        Page<NewUser> newUserPage = newUserService.searchPage(query);
        return new Response("paid/newuser")
                .request(query)
                .data("list", newUserPage);
    }
}
