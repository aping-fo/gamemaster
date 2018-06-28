package com.luckygames.wmxz.gamemaster.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnline;
import com.luckygames.wmxz.gamemaster.model.entity.OnlineNow;
import com.luckygames.wmxz.gamemaster.model.entity.ServerOnlineLog;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.IntegratedOnlineService;
import com.luckygames.wmxz.gamemaster.service.IntegratedOnlineServiceService;
import com.luckygames.wmxz.gamemaster.service.OnlineNowService;
import com.luckygames.wmxz.gamemaster.service.ServerOnlineLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/online")
public class OnlineController extends BaseController {
    @Autowired
    private OnlineNowService onlineNowService;
    @Autowired
    private IntegratedOnlineService integratedOnlineService;
    @Autowired
    private IntegratedOnlineServiceService integratedOnlineServiceService;
    @Autowired
    private ServerOnlineLogService serverOnlineLogService;

    //综合在线
    @RequestMapping(value = "/statics", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryServer(CommonSearchQuery query) {
        return new Response("online/statics")
                .request(query);
    }

    // 综合在线数据
    @RequestMapping(value = "/statics_data", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONArray queryServer2(IntegratedOnlineSearchQuery query) {
        List<IntegratedOnline> integratedOnlinePage = integratedOnlineService.searchPage(query);
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(integratedOnlinePage));
        return jsonArray;
    }

    //当前在线
    @RequestMapping(value = "/now", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryOrderErroneousOrder(OnlineNowSearchQuery onlineNowSearchQuery) {
//        onlineNowService.generateOnlineNowReportToday();

        Page<OnlineNow> onlineNowPage = onlineNowService.searchPage(onlineNowSearchQuery);

        return new Response("online/now")
                .request(onlineNowSearchQuery)
                .data("onlineNowList", onlineNowPage);
    }

    //区服综合在线
    @RequestMapping(value = "/server", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryServerNow(IntegratedOnlineServiceSearchQuery query) {
        Page<com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnlineService> integratedOnlineServicePage = integratedOnlineServiceService.searchPage(query);

        return new Response("online/server")
                .request(query)
                .data("integratedOnlineServiceList", integratedOnlineServicePage);
    }

    //实时在线
    @RequestMapping(value = "/real", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryReal(ServerOnlineLogQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        if (query.getPageSize() == null) {
            query.setPageSize(24);
        }
        Page<ServerOnlineLog> serverOnlineLogs = serverOnlineLogService.searchPage(query);

        return new Response("online/real")
                .request(query)
                .data("serverOnlineLogs", serverOnlineLogs);

    }
}
