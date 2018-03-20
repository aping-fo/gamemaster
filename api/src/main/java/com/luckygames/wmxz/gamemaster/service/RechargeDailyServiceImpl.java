package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RechargeDaily;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyExample;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyMapper;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rechargeDailyService")
public class RechargeDailyServiceImpl implements RechargeDailyService {
    @Autowired
    private RechargeDailyMapper rechargeDailyMapper;

    @Override
    public Page<RechargeDaily> search(RechargeDailySearchRequest request) {
        RechargeDailyExample example = new RechargeDailyExample();
        RechargeDailyExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);
        if (request.getChannelId() != null && request.getChannelId() != 0) {
            criteria.andChannelIdEqualTo(request.getChannelId());
        }
        if (request.getServerId() != null && request.getServerId() != 0) {
            criteria.andServerIdEqualTo(request.getServerId());
        }
        if (StringUtils.isNotBlank(request.getStartDate())) {
            criteria.andReportDateGreaterThanOrEqualTo(request.getStartDate());
        }
        if (StringUtils.isNotBlank(request.getEndDate())) {
            criteria.andReportDateLessThanOrEqualTo(request.getStartDate());
        }

        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> rechargeDailyMapper.selectByExample(example));
    }
}
