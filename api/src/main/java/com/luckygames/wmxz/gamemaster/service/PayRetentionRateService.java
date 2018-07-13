package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PayRetentionRate;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PayRetentionRateSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface PayRetentionRateService extends BaseService<PayRetentionRateEntity> {
    Page<PayRetentionRate> searchPage(PayRetentionRateSearchQuery PayRetentionRateSearchRequest);

    void generatePayRetentionRateReportToday();

    PayRetentionRate findOne(Long channelId, Long serverId, Date date);

    void generatePayRetentionRateReportByDay(String date);
}
