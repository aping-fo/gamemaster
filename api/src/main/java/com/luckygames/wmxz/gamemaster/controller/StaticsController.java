package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.entity.LogonStatistics;
import com.luckygames.wmxz.gamemaster.model.entity.StaticsSummary;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.LogonStatisticsService;
import com.luckygames.wmxz.gamemaster.service.ReportService;
import com.luckygames.wmxz.gamemaster.service.StaticsSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statics")
public class StaticsController extends BaseController {
    @Autowired
    private StaticsSummaryService staticsSummaryService;
    @Autowired
    private ReportService reportService;
    @Autowired
    private LogonStatisticsService logonStatisticsService;

    @RequestMapping("summary")
    public Response Summary(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }

        Page<StaticsSummary> staticsSummaryPage = staticsSummaryService.queryStaticsSummary(query);

        return new Response("statics/summary")
                .request(query)
                .data("staticsSummaryList", staticsSummaryPage);
    }

    //登录统计
    @RequestMapping("signin")
    public Response signinStatics(CommonSearchQuery query) {
        Page<LogonStatistics> logonStatisticsPage = logonStatisticsService.searchPage(query);
        return new Response("statics/signin")
                .request(query)
                .data("logonStatisticsList", logonStatisticsPage);
    }
}
