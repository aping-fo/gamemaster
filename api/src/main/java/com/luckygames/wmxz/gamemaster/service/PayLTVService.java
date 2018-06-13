package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PayLTVEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTV;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface PayLTVService extends BaseService<PayLTVEntity> {
    void generatePayLTVDailyReportYesterday();

    void generatePayLTVDailyReportToday();

    void generatePayLTVDailyReportByDay(Date date);

    void generatePayLTVDailyReportByDay(String date);

    PayLTV findOne(Long channelId, Long serverId, String reportDate);

    List<PayLTV> findByDate(String reportDate);

    Page<PayLTV> searchSummaryPage(LTVSearchQuery query);
}
