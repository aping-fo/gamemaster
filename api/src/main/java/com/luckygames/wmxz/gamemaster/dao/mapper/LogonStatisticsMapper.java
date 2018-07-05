package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.LogonStatisticsEntity;
import com.luckygames.wmxz.gamemaster.dao.LogonStatisticsEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.LogonStatisticsSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.LogonStatistics;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.SigninSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface LogonStatisticsMapper extends LogonStatisticsEntityMapper<LogonStatisticsEntity> {

    @SelectProvider(type = LogonStatisticsSqlProvider.class, method = "searchPage")
    List<LogonStatistics> searchPage(SigninSearchQuery query);
}
