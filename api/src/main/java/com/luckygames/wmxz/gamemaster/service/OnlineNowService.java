package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.OnlineNow;
import com.luckygames.wmxz.gamemaster.model.view.request.OnlineNowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface OnlineNowService extends BaseService<OnlineNowEntity> {
    Page<OnlineNow> searchPage(OnlineNowSearchQuery OnlineNowSearchRequest);

    void generateOnlineNowReportToday();

    OnlineNow findOne(Long charId);

    List<OnlineNow> findByOneDate(Date date);

    void generateOnlineNowReportByDay(String date);
}
