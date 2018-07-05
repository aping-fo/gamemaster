package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LogonStatisticsEntity;
import com.luckygames.wmxz.gamemaster.model.entity.LogonStatistics;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.SigninSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface LogonStatisticsService extends BaseService<LogonStatisticsEntity> {
    Page<LogonStatistics> searchPage(SigninSearchQuery query);
}
