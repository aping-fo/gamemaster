package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.RechargeDailyMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("rechargeDailyService")
public class RechargeDailyServiceImpl extends BaseServiceImpl<RechargeDailyEntity> implements RechargeDailyService {
    @Autowired
    private RechargeDailyMapper rechargeDailyMapper;

    @Override
    public Mapper<RechargeDailyEntity> getMapper() {
        return rechargeDailyMapper;
    }

    @Override
    public Page<RechargeDaily> searchPage(RechargeDailySearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rechargeDailyMapper.queryRechargeDailyReport(query));
    }

    @Override
    public List<RechargeDaily> searchList(RechargeDailySearchQuery query) {
        return BeanUtils.copyListProperties(rechargeDailyMapper.queryRechargeDailyReport(query), RechargeDaily.class);
    }

    @Override
    public RechargeDaily findOne(Long channelId, Long serverId, Date date) {
        return findOne(channelId, serverId, DateUtils.DateToString(date));
    }

    @Override
    public RechargeDaily findOne(Long channelId, Long serverId, String date) {
        RechargeDailyExample example = new RechargeDailyExample();
        RechargeDailyExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(date);
        List<RechargeDailyEntity> rechargeDailyList = rechargeDailyMapper.selectByExample(example);
        if (rechargeDailyList == null || rechargeDailyList.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(rechargeDailyList.get(0), RechargeDaily.class);
    }

    private void saveRechargeDailyReport(List<RechargeDaily> list) {
        list.forEach(r -> {
            RechargeDaily rechargeDaily = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (rechargeDaily == null) {
                rechargeDaily = new RechargeDaily();
            }
            BeanUtils.copyProperties(r, rechargeDaily);
            save(rechargeDaily);
        });
    }

    @Override
    public List<RechargeDaily> findByOneDate(String date) {
        List<RechargeDailyEntity> rechargeDailyEntities = this.rechargeDailyMapper.select(new RechargeDailyEntity() {{
            setStatus(Status.NORMAL);
            setReportDate(date);
        }});
        return BeanUtils.copyListProperties(rechargeDailyEntities, RechargeDaily.class);
    }

    @Override
    public void generateRechargeDailyReportToday() {
        generateRechargeDailyReportByDay(DateUtils.TodayString());
    }

    @Override
    public void generateRechargeDailyReportYesterDay() {
        generateRechargeDailyReportByDay(DateUtils.YesterdayString());
    }

    @Override
    public void generateRechargeDailyReportByDay(Date date) {
        generateRechargeDailyReportByDay(DateUtils.DateToString(date));
    }

    @Override
    public void generateRechargeDailyReportByDay(String date) {
        List<RechargeDaily> list = rechargeDailyMapper.queryRechargeDailyReportFromOrderSingleDate(date);
        if (list == null || list.isEmpty()) {
            return;
        }
        saveRechargeDailyReport(list);
    }

}
