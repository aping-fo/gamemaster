package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTV;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTVDay;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface PayLTVDayService extends BaseService<PayLTVDayEntity> {
    void generatePayLTVDayReportByLTV(PayLTV payLTV, LTVDaysType days);

    void generatePayLTVDayReportToday();

    void generatePayLTVDayReportYesterday();

    void generatePayLTVDayReportByDate(String date);

    void generatePayLTVDayReportByDate(Date date);

    List<PayLTVDay> queryPayLTVDays(LTVSearchQuery query);
}
