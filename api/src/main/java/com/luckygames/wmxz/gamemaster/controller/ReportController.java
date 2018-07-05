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

    //数据汇总
    @RequestMapping(value = "/summary", method = {RequestMethod.GET, RequestMethod.POST})
    public Response summaryReport(DataCollectionSearchQuery dataCollectionSearchRequest) {
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
        Page<DataCollection> channelDataList = reportService.searchChannelDataPage(query);
        Response r = new Response("report/channel")
                .request(query)
                .data("list", channelDataList);
        return r;
    }


    //渠道每日导入数据
    @RequestMapping(value = "/channel_daily_import", method = {RequestMethod.GET, RequestMethod.POST})
    public Response channelDailyImportReport(ChannelDataSearchQuery query) {
        Page<DataCollection> channelDailyList = reportService.searchChannelDailyPage(query,1);
        Response r = new Response("report/channelDailyImport")
                .request(query)
                .data("list", channelDailyList);
        return r;
    }

    //渠道每日收入数据
    @RequestMapping(value = "/channel_daily_income", method = {RequestMethod.GET, RequestMethod.POST})
    public Response channelDailyIncomeReport(ChannelDataSearchQuery query) {
        Page<DataCollection> channelDailyList = reportService.searchChannelDailyPage(query,2);
        Response r = new Response("report/channelDailyIncome")
                .request(query)
                .data("list", channelDailyList);
        return r;
    }
}
