package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PackageSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PayRetentionRateSearchQuery;
import com.luckygames.wmxz.gamemaster.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/paid")
public class PaidController extends BaseController {
    @Autowired
    private PayLTVService payLTVService;
    @Autowired
    private PayRetentionRateService payRetentionRateService;
    @Autowired
    private NewUserService newUserService;
    @Autowired
    private ChannelBagService channelBagService;
    @Autowired
    private ChannelService channelService;

    //ltv统计
    @RequestMapping(value = "/ltv", method = {RequestMethod.GET, RequestMethod.POST})
    public Response ltv(LTVSearchQuery query) {
        Page<PayLTV> payLTVPage = payLTVService.searchSummaryPage(query);
        return new Response("paid/ltv")
                .request(query)
                .data("payLTVList", payLTVPage)
                .data("days", LTVDaysType.values());

    }

    //付费留存率
    @RequestMapping(value = "/payRetentionRate", method = {RequestMethod.GET, RequestMethod.POST})
    public Response payRetentionRate(PayRetentionRateSearchQuery query) {
        Page<PayRetentionRate> payRetentionRatePage = payRetentionRateService.searchPage(query);
        List<ChannelBag> channelBagList;
        if (query.getChannelId() != null) {
            channelBagList = channelBagService.searchPageByChannelId(query.getChannelId());
        } else {
            channelBagList = channelBagService.searchPage(new PackageSearchQuery());
        }
        List<Channel> channelList = channelService.searchList();
        return new Response("paid/stay")
                .request(query)
                .data("list", payRetentionRatePage)
                .data("channelBagList", channelBagList)
                .data("channelList", channelList);
    }

    //新增用户数据
    @RequestMapping(value = "/newuser", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryNewuser(NewUserSearchQuery query) {
        Page<NewUser> newUserPage = newUserService.searchPage(query);
        List<ChannelBag> channelBagList;
        if (query.getChannelId() != null) {
            channelBagList = channelBagService.searchPageByChannelId(query.getChannelId());
        } else {
            channelBagList = channelBagService.searchPage(new PackageSearchQuery());
        }
        List<Channel> channelList = channelService.searchList();
        return new Response("paid/newuser")
                .request(query)
                .data("list", newUserPage)
                .data("channelBagList", channelBagList)
                .data("channelList", channelList);
    }
}
