package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController extends BaseController {
    @Autowired
    private GiftpackageSyncService giftpackageSyncService;
    @Autowired
    private GiftpackageAddService giftpackageAddService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private ActivityService activityService;

    //礼包管理
    @RequestMapping(value = "/giftpackage", method = {RequestMethod.GET, RequestMethod.POST})
    public Response giftPackage() {
        return new Response("game/giftpackage");
    }

    //添加礼包
    @RequestMapping(value = "/giftpackage_add", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addGiftPackage(GiftpackageAddSearchQuery giftpackageAddSearchQuery) {
        if (StringUtils.isNotBlank(giftpackageAddSearchQuery.getName())) {
            giftpackageAddService.addGiftpackage(giftpackageAddSearchQuery);
        }
        return new Response("game/giftpackage_add");
    }

    //添加礼包是否绑定
    @RequestMapping(value = "/giftpackage_add_isBinding", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addGiftPackageIsBinding() {

        return new Response("game/giftpackage_add_isBinding");
//                .data("typeList", giftpackageAddList);
    }

    //同步礼包
    @RequestMapping(value = "/giftpackage_sync", method = {RequestMethod.GET, RequestMethod.POST})
    public Response syncGiftPackage(GiftpackageSyncSearchQuery giftpackageSyncSearchQuery) {
        if (giftpackageSyncSearchQuery.getCount() != null) {
            giftpackageSyncService.addGiftpackage(giftpackageSyncSearchQuery);
        }

        if (giftpackageSyncSearchQuery.getPageNum() == null) {
            giftpackageSyncSearchQuery.setPageNum(1);
        }

        List<GiftpackageAdd> giftpackageAddList = giftpackageAddService.searchType();
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        Page<GiftpackageSync> giftPackagePage = giftpackageSyncService.searchPage(giftpackageSyncSearchQuery);

        return new Response("game/giftpackage_sync")
                .request(giftpackageSyncSearchQuery)
                .data("typeList", giftpackageAddList)
                .data("serverList", serverList)
                .data("channelList", channelList)
                .data("giftPackageList", giftPackagePage);
    }

    //活动
    @RequestMapping(value = "/event", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activity() {
        return new Response("activity/activity");
    }

    //奥林匹克活动列表
    @RequestMapping(value = "/olympics_activity_list", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityList(ActivitySearchQuery query) {
        if (query.getId() != null) {
            activityService.update(query);
        }
        Page<Activity> activityPage = activityService.searchPage(query);
        return new Response("activity/olympics_activity_list")
                .request(query)
                .data("activityList", activityPage);
    }

    //奥林匹克活动设置
    @RequestMapping(value = "/olympics_activity_setting", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activitySetting(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        return new Response("activity/olympics_activity_setting");
    }

    //奥林匹克单服活动
    @RequestMapping(value = "/olympics_single_activity", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activitySingleActivity(CommonSearchQuery query) {
        return new Response("activity/olympics_single_activity")
                .request(query);
    }

    //奥林匹克活动审核
    @RequestMapping(value = "/olympics_activity_audit", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityAudit(ActivitySearchQuery query) {
        query.setActivityStatus(0);
        Page<Activity> activityPage = activityService.searchPage(query);
        return new Response("activity/olympics_activity_audit")
                .request(query)
                .data("activityList", activityPage);
    }
}
