package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageAddSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ChannelService;
import com.luckygames.wmxz.gamemaster.service.GiftpackageAddService;
import com.luckygames.wmxz.gamemaster.service.GiftpackageSyncService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.plugin.com.Utils;

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

    //礼包管理
    @RequestMapping(value = "/giftpackage", method = {RequestMethod.GET, RequestMethod.POST})
    public Response giftPackage() {
        return new Response("game/giftpackage");
    }

    //添加礼包
    @RequestMapping(value = "/giftpackage_add", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addGiftPackage(GiftpackageAddSearchQuery giftpackageAddSearchQuery) {
        if(StringUtils.isNotBlank(giftpackageAddSearchQuery.getName())){
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
        if(giftpackageSyncSearchQuery.getCount()!=null){
            giftpackageSyncService.addGiftpackage(giftpackageSyncSearchQuery);
        }

        if (giftpackageSyncSearchQuery.getPageNum() == null) {
            giftpackageSyncSearchQuery.setPageNum(1);
        }

        List<GiftpackageAdd> giftpackageAddList = giftpackageAddService.searchType();
        ServerSearchQuery serverSearchQuery=new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery=new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        Page<GiftpackageSync> giftPackagePage = giftpackageSyncService.searchPage(giftpackageSyncSearchQuery);

        return new Response("game/giftpackage_sync")
                .request(giftpackageSyncSearchQuery)
                .data("typeList", giftpackageAddList)
                .data("serverList", serverList)
                .data("channelList", channelList)
                .data("giftPackageList", giftPackagePage);
    }
}
