package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntity;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PayRetentionRateMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PayRetentionRate;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PayRetentionRateSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("PayRetentionRateService")
public class PayRetentionRateServiceImpl extends BaseServiceImpl<PayRetentionRateEntity> implements PayRetentionRateService {
    @Autowired
    private PayRetentionRateMapper PayRetentionRateMapper;

    @Override
    public Mapper<PayRetentionRateEntity> getMapper() {
        return PayRetentionRateMapper;
    }

    @Override
    public Page<PayRetentionRate> searchPage(PayRetentionRateSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> PayRetentionRateMapper.searchPage(query));
    }

    private void savePayRetentionRateReport(List<PayRetentionRate> list) {
        list.forEach(r -> {
            PayRetentionRate PayRetentionRate = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (PayRetentionRate == null) {
                PayRetentionRate = new PayRetentionRate();
            }
            BeanUtils.copyProperties(r, PayRetentionRate);
            save(PayRetentionRate);
        });
    }

    @Override
    public PayRetentionRate findOne(Long channelId, Long serverId, Date date) {
        PayRetentionRateExample example = new PayRetentionRateExample();
        PayRetentionRateExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(date);
        List<PayRetentionRateEntity> PayRetentionRateList = PayRetentionRateMapper.selectByExample(example);
        if (PayRetentionRateList == null || PayRetentionRateList.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(PayRetentionRateList.get(0), PayRetentionRate.class);
    }

    @Override
    public void generatePayRetentionRateReportToday() {
        generatePayRetentionRateReportByDay(DateUtils.TodayString());
    }


    @Override
    public void generatePayRetentionRateReportByDay(String date) {
        List<PayRetentionRate> list = PayRetentionRateMapper.searchAndSave(date);
        if (list == null || list.isEmpty()) {
            return;
        }
        savePayRetentionRateReport(list);
    }
}
