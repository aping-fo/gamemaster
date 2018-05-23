package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.StaticsSummaryEntity;
import com.luckygames.wmxz.gamemaster.model.entity.StaticsSummary;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface StaticsSummaryService extends BaseService<StaticsSummaryEntity> {

    Page<StaticsSummary> queryStaticsSummary(CommonSearchQuery query);

    void generateStaticsSummaryReportToday();

    void generateStaticsSummaryReportYesterday();

    void generateStaticsSummaryReportByDay(Date from);

    void generateStaticsSummaryReportByDay(String from);

    StaticsSummary findOne(Long channelId, Long serverId, String reportDate);
}
