package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.LogonStatisticsEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.LogonStatisticsMapper;
import com.luckygames.wmxz.gamemaster.model.entity.LogonStatistics;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.SigninSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("LogonStatisticsService")
public class LogonStatisticsServiceImpl extends BaseServiceImpl<LogonStatisticsEntity> implements LogonStatisticsService {
    @Autowired
    private LogonStatisticsMapper LogonStatisticsMapper;

    @Override
    public Mapper<LogonStatisticsEntity> getMapper() {
        return LogonStatisticsMapper;
    }

    @Override
    public Page<LogonStatistics> searchPage(SigninSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> LogonStatisticsMapper.searchPage(query));
    }
}
