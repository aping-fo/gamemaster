package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeMonthly;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeMonthlySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface RechargeMonthlyService extends BaseService<RechargeMonthlyEntity> {
    void generateRechargeMonthlyReportToday();

    void generateRechargeMonthlyReportYesterday();

    RechargeMonthly findOne(Long channelId, Long serverId, int year, int month);

    Page<RechargeMonthly> searchPage(RechargeMonthlySearchQuery query);

    void generateRechargeMonthlyReportByDay(String date);
}
