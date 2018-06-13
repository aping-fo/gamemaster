package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PayLTVEntity;
import com.luckygames.wmxz.gamemaster.dao.PayLTVEntityExample;
import com.luckygames.wmxz.gamemaster.dao.PayLTVExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PayLTVMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTV;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTVDay;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("payLTVService")
public class PayLTVServiceImpl extends BaseServiceImpl<PayLTVEntity> implements PayLTVService {
    @Autowired
    private PayLTVMapper payLTVMapper;
    @Autowired
    private PayLTVDayService payLTVDayService;

    @Override
    public Mapper<PayLTVEntity> getMapper() {
        return payLTVMapper;
    }

    @Override
    public void generatePayLTVDailyReportYesterday() {
        generatePayLTVDailyReportByDay(DateUtils.YesterdayString());
    }

    @Override
    public void generatePayLTVDailyReportToday() {
        generatePayLTVDailyReportByDay(DateUtils.TodayString());
    }

    @Override
    public void generatePayLTVDailyReportByDay(String date) {
        List<PayLTV> payLTVList = payLTVMapper.queryPayLTVReportSingleDate(date);
        if (payLTVList == null || payLTVList.isEmpty()) {
            return;
        }
        savePayLTVDailyReport(payLTVList);
    }

    @Override
    public void generatePayLTVDailyReportByDay(Date date) {
        generatePayLTVDailyReportByDay(DateUtils.DateToString(date));

    }

    private void savePayLTVDailyReport(List<PayLTV> list) {
        list.forEach(r -> {
            PayLTV payLTV = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (payLTV == null) {
                payLTV = new PayLTV();
                payLTV.setStatus(Status.NORMAL);
            }
            BeanUtils.copyProperties(r, payLTV);
            save(payLTV);
        });
    }

    public PayLTV findOne(Long channelId, Long serverId, String reportDate) {
        PayLTVExample example = new PayLTVExample();
        PayLTVEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(reportDate);
        PayLTVEntity payLTV = payLTVMapper.selectOneByExample(example);
        return BeanUtils.copyProperties(payLTV, PayLTV.class);
    }

    @Override
    public List<PayLTV> findByDate(String reportDate) {
        PayLTVExample example = new PayLTVExample();
        PayLTVEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andReportDateEqualTo(reportDate);
        List<PayLTVEntity> payLTVEntityList = payLTVMapper.selectByExample(example);
        return BeanUtils.copyListProperties(payLTVEntityList, PayLTV.class);
    }

    @Override
    public Page<PayLTV> searchSummaryPage(LTVSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<PayLTV> payLTVPage = PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> payLTVMapper.queryPayLTVReport(query));
        if (payLTVPage == null) {
            return null;
        }
        List<PayLTV> payLTVList = payLTVPage.getResult();
        payLTVList.forEach(r -> {
            LTVSearchQuery ltvSearchQuery = BeanUtils.copyProperties(query, LTVSearchQuery.class);
            ltvSearchQuery.setReportDate(r.getReportDate());
            List<PayLTVDay> list = payLTVDayService.queryPayLTVDays(ltvSearchQuery);
            Map<LTVDaysType, PayLTVDay> ltvDayMap = newLTVDaysMap();
            if (list != null && !list.isEmpty()) {
                list.forEach(day -> {
                    ltvDayMap.put(day.getDays(), day);
                });
            }
            r.setDaysMap(ltvDayMap);
        });

        return payLTVPage;

    }

    private Map<LTVDaysType, PayLTVDay> newLTVDaysMap() {
        Map<LTVDaysType, PayLTVDay> ltvDayMap = new HashMap<>();
        for (LTVDaysType ltvDaysType : LTVDaysType.values()) {
            ltvDayMap.put(ltvDaysType, null);
        }
        return ltvDayMap;
    }

}
