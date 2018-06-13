package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/report")
public class ReportController extends BaseController {
    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/summary", method = {RequestMethod.GET, RequestMethod.POST})
    public Response summaryReport(DataCollectionSearchQuery dataCollectionSearchRequest) {
//        reportService.generateDataCollectionReportToday();
        if (dataCollectionSearchRequest.getPageNum() == null) {
            dataCollectionSearchRequest.setPageNum(1);
        }
        Page<DataCollection> dataCollections = reportService.searchPage(dataCollectionSearchRequest);

        Response r = new Response("report/summary")
                .request(dataCollectionSearchRequest)
                .data("dataCollectionList", dataCollections);
        return r;
    }

    //渠道数据
    @RequestMapping(value = "/channel", method = {RequestMethod.GET, RequestMethod.POST})
    public Response channelReport(ChannelDataSearchQuery query) {
//        reportService.generateDataCollectionReportToday();
        Page<DataCollection> channelDataList = reportService.searchChannelDataPage(query);
        Response r = new Response("report/channel")
                .request(query)
                .data("channelDataList", channelDataList);
        return r;
    }


    //渠道每日数据
    @RequestMapping(value = "/channel_daily", method = {RequestMethod.GET, RequestMethod.POST})
    public Response channelDailyReport(ChannelDataSearchQuery query) {
//        reportService.generateDataCollectionReportToday();
        Page<DataCollection> channelDailyList = reportService.searchChannelDailyPage(query);
        Response r = new Response("report/channelDaily")
                .request(query)
                .data("channelDailyList", channelDailyList);
        return r;
    }
}
