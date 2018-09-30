package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.ExcelExportUtil;
import com.luckygames.wmxz.gamemaster.utils.ExportUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/statics")
public class StaticsController extends BaseController {
    @Autowired
    private StaticsSummaryService staticsSummaryService;
    @Autowired
    private PlayerActionLogService playerActionLogService;
    @Autowired
    private AccountLogService accountLogService;
    @Autowired
    private ServerService serverService;

    //登录统计
    @RequestMapping("signin")
    public Response signinStatics(AccountLogSearchQuery query) {
        Page<AccountLog> accountLogs = accountLogService.searchPage(query);
        List<Server> serverList = serverService.searchList();
        return new Response("statics/signin")
                .request(query)
                .data("list", accountLogs)
                .data("serverList", serverList);
    }

    //数据汇总
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

    //等级流失
    @RequestMapping("leave")
    public Response leave(PlayerActionLogSearchQuery query) {
        Page<PlayerActionLog> playerActionLogs = playerActionLogService.searchLeaveLoss(query);
        return new Response("statics/leave")
                .request(query)
                .data("list", playerActionLogs);
    }

    //等级分布
    @RequestMapping("leave_distribution")
    public Response leaveDistribution(PlayerActionLogSearchQuery query) {
        Page<PlayerActionLog> playerActionLogs = playerActionLogService.searchLeaveDistribution(query);
        return new Response("statics/leave_distribution")
                .request(query)
                .data("list", playerActionLogs);
    }

    //等级分布导出
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(String filename, String[] title, String serverIds, String channelIds, Long platform, String date, Long level, Integer pageNum, HttpServletRequest request) {
        //条件处理
        PlayerActionLogSearchQuery query = new PlayerActionLogSearchQuery();
        if (serverIds != null) {
            List<Long> serverIdList = new ArrayList<>();
            String[] serverIdArray = StringUtils.split(serverIds, ",");
            for (int i = 0; i < serverIdArray.length; i++) {
                serverIdList.add(Long.valueOf(serverIdArray[i]));
            }
            query.setServerIds(serverIdList);
        }
        if (channelIds != null) {
            List<Long> channelIdList = new ArrayList<>();
            String[] channelIdArray = StringUtils.split(channelIds, ",");
            for (int i = 0; i < channelIdArray.length; i++) {
                channelIdList.add(Long.valueOf(channelIdArray[i]));
            }
            query.setChannelIds(channelIdList);
        }
        query.setPlatform(platform);
        query.setDate(date);
        query.setLevel(level);
        query.setPageNum(pageNum);
        Page<PlayerActionLog> playerActionLogs = playerActionLogService.searchLeaveDistribution(query);

        //下载
        ExcelExportUtil eu = new ExcelExportUtil();
        File file = new File(filename);
        eu.export(file, playerActionLogs, title, PlayerActionLog.class);
        HttpHeaders headers = new HttpHeaders();
        byte[] body = new byte[0];
        body = ExportUtil.exportExcel(filename, request, file, headers, body);
        return new ResponseEntity<>(body, headers, HttpStatus.OK);
    }

    //产出消耗
    @RequestMapping("produce_expend")
    public Response leaveProduceExpend(PlayerActionLogSearchQuery query) {
        Page<PlayerActionLog> playerActionLogs = playerActionLogService.searchLeProduceExpend(query);
        return new Response("statics/produce_expend")
                .request(query)
                .data("list", playerActionLogs);
    }

    //单服数据
    @RequestMapping("server")
    public Response serverdata(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<StaticsSummary> staticsSummaryPage = staticsSummaryService.queryStaticsSummary(query);

        return new Response("statics/server_statics")
                .request(query)
                .data("staticsSummaryList", staticsSummaryPage);
    }
}
