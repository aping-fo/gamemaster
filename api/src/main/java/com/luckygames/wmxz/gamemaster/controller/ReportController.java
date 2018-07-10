package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.view.base.Pager;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();//获取当前日期

        cal.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String startDate = sdf.format(cal.getTime());

        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        String endDate = sdf.format(cal.getTime());

        if(query.getStartDate()!=null&&!query.getStartDate().trim().equals("")){
            startDate=query.getStartDate();
        }
        if(query.getEndDate()!=null&&!query.getEndDate().trim().equals("")){
            endDate=query.getEndDate();
        }

        List<LinkedHashMap> listMap = reportService.queryChannelDailyReport2(startDate,endDate,1);

        //补全渠道数据为0的情况
        cal = Calendar.getInstance();
        completion(sdf, cal, startDate, endDate, listMap);

        Pager pager=new Pager(query.getPageNum(),query.getPageSize(),listMap.size());
        Response r = new Response("report/channelDailyImport")
                .request(query)
                .data("listMap", listMap)
                .data("listMapTitle", listMap.get(0))
                .data("Pager", pager);
        return r;
    }

    //渠道每日收入数据
    @RequestMapping(value = "/channel_daily_income", method = {RequestMethod.GET, RequestMethod.POST})
    public Response channelDailyIncomeReport(ChannelDataSearchQuery query) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();//获取当前日期

        cal.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String startDate = sdf.format(cal.getTime());

        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        String endDate = sdf.format(cal.getTime());

        if(query.getStartDate()!=null&&!query.getStartDate().trim().equals("")){
            startDate=query.getStartDate();
        }
        if(query.getEndDate()!=null&&!query.getEndDate().trim().equals("")){
            endDate=query.getEndDate();
        }
        List<LinkedHashMap> listMap = reportService.queryChannelDailyReport2(startDate,endDate,2);

        //补全渠道数据为0的情况
        cal = Calendar.getInstance();
        completion(sdf, cal, startDate, endDate, listMap);

        Pager pager=new Pager(query.getPageNum(),query.getPageSize(),listMap.size());
        Response r = new Response("report/channelDailyIncome")
                .request(query)
                .data("listMap", listMap)
                .data("listMapTitle", listMap.get(0))
                .data("Pager", pager);
        return r;
    }

    //补全渠道数据
    private void completion(SimpleDateFormat sdf, Calendar cal, String startDate, String endDate, List<LinkedHashMap> listMap) {
        try {
            cal.setTime(sdf.parse(startDate));
            long time1 = cal.getTimeInMillis();
            cal.setTime(sdf.parse(endDate));
            long time2 = cal.getTimeInMillis();
            long between_days=(time2-time1)/(1000*3600*24);
            int length = Integer.parseInt(String.valueOf(between_days))+3;
            for(int i=0;i<listMap.size();i++){
                int size=listMap.get(i).size();
                if(size!=length){
                    for(int j=0;j<length-size;j++){
                        listMap.get(i).put(j,0);
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
