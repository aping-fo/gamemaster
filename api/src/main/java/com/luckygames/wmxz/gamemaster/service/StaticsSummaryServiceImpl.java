package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.StaticsSummaryEntity;
import com.luckygames.wmxz.gamemaster.dao.StaticsSummaryEntityExample;
import com.luckygames.wmxz.gamemaster.dao.StaticsSummaryExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.StaticsSummaryMapper;
import com.luckygames.wmxz.gamemaster.model.entity.StaticsSummary;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("staticsSummaryService")
public class StaticsSummaryServiceImpl extends BaseServiceImpl<StaticsSummaryEntity> implements StaticsSummaryService {
    @Autowired
    private StaticsSummaryMapper staticsSummaryMapper;

    @Override
    public Mapper<StaticsSummaryEntity> getMapper() {
        return staticsSummaryMapper;
    }

    @Override
    public Page<StaticsSummary> queryStaticsSummary(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<StaticsSummary> staticsSummaryPage = PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> staticsSummaryMapper.queryStaticsSummary(query));
        return staticsSummaryPage;
    }

    @Override
    public void generateStaticsSummaryReportToday() {
        generateStaticsSummaryReportByDay(DateUtils.TodayString());
    }

    @Override
    public void generateStaticsSummaryReportYesterday() {
        generateStaticsSummaryReportByDay(DateUtils.YesterdayString());
    }

    @Override
    public void generateStaticsSummaryReportByDay(Date from) {
        generateStaticsSummaryReportByDay(DateUtils.DateToString(from));
    }

    @Override
    public void generateStaticsSummaryReportByDay(String from) {
        List<StaticsSummary> staticsSummaryList = this.staticsSummaryMapper.queryStaticsSummaryReportSingleDate(from);
        if (CollectionUtils.isEmpty(staticsSummaryList)) {
            return;
        }
        saveStaticSummaryReport(staticsSummaryList);
    }

    private void saveStaticSummaryReport(List<StaticsSummary> staticsSummaryList) {
        staticsSummaryList.forEach(r -> {
            StaticsSummary staticsSummary = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (staticsSummary == null) {
                staticsSummary = new StaticsSummary();
            }
            BeanUtils.copyProperties(r, staticsSummary);
            save(staticsSummary);
        });
    }

    @Override
    public StaticsSummary findOne(Long channelId, Long serverId, String reportDate) {
        StaticsSummaryExample example = new StaticsSummaryExample();
        StaticsSummaryEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(reportDate);
        List<StaticsSummaryEntity> list = staticsSummaryMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return BeanUtils.copyProperties(list.get(0), StaticsSummary.class);
    }
}
