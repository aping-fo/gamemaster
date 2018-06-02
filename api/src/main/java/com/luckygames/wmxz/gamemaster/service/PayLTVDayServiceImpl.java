package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntity;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntityExample;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDayExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PayLTVDayMapper;
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

@Service("payLTVDayService")
public class PayLTVDayServiceImpl extends BaseServiceImpl<PayLTVDayEntity> implements PayLTVDayService {
    @Autowired
    private PayLTVDayMapper payLTVDayMapper;
    @Autowired
    private PayLTVService payLTVService;

    @Override
    public Mapper<PayLTVDayEntity> getMapper() {
        return payLTVDayMapper;
    }

    @Override
    public void generatePayLTVDayReportByLTV(PayLTV payLTV, LTVDaysType days) {
        if (payLTV == null) {
            return;
        }
        PayLTVDay payLTVDay = findOne(payLTV.getId(), days);
        if (payLTVDay == null) {
            payLTVDay = new PayLTVDay();
        }

        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("channelId", payLTV.getChannelId());
        queryMap.put("serverId", payLTV.getServerId());
        queryMap.put("charCount", payLTV.getCharCount());
        queryMap.put("payLtvId", payLTV.getId());
        queryMap.put("reportDate", payLTV.getReportDate());
        queryMap.put("days", days);
        PayLTVDay result = payLTVDayMapper.queryPayLTVDaySingleDate(queryMap);
        if (result != null) {
            BeanUtils.copyProperties(result, payLTVDay);
        }

        save(payLTVDay);
    }

    private PayLTVDay findOne(Long payLTVId, LTVDaysType days) {
        PayLTVDayExample example = new PayLTVDayExample();
        PayLTVDayEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andPayLtvIdEqualTo(payLTVId)
                .andDaysEqualTo(days);
        PayLTVDayEntity payLTVDayEntity = payLTVDayMapper.selectOneByExample(example);
        return BeanUtils.copyProperties(payLTVDayEntity, PayLTVDay.class);
    }

    @Override
    public void generatePayLTVDayReportToday() {
        generatePayLTVDayReportByDate(DateUtils.TodayString());
    }

    @Override
    public void generatePayLTVDayReportYesterday() {
        generatePayLTVDayReportByDate(DateUtils.YesterdayString());
    }

    @Override
    public void generatePayLTVDayReportByDate(String date) {
        for (LTVDaysType ltvDaysType : LTVDaysType.values()) {
            String reportDate = DateUtils.DateToString(DateUtils.AddDays(DateUtils.StringToDate(date), -1 * ltvDaysType.code()));
            List<PayLTV> payLTVList = payLTVService.findByDate(reportDate);
            if (payLTVList == null || payLTVList.isEmpty()) {
                continue;
            }
            payLTVList.forEach(r -> {
                generatePayLTVDayReportByLTV(r, ltvDaysType);
            });
        }
    }

    @Override
    public void generatePayLTVDayReportByDate(Date date) {
        generatePayLTVDayReportByDate(DateUtils.DateToString(date));
    }

    @Override
    public List<PayLTVDay> queryPayLTVDays(LTVSearchQuery query) {
        return payLTVDayMapper.queryPayLTVDays(query);
    }
}
