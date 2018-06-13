package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.StaticsSummaryEntity;
import com.luckygames.wmxz.gamemaster.dao.StaticsSummaryEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.StaticsSummarySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.StaticsSummary;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface StaticsSummaryMapper extends StaticsSummaryEntityMapper<StaticsSummaryEntity> {
    @SelectProvider(type = StaticsSummarySqlProvider.class, method = "queryStaticsSummary")
    List<StaticsSummary> queryStaticsSummary(CommonSearchQuery query);

    @SelectProvider(type = StaticsSummarySqlProvider.class, method = "queryStaticsSummaryReportSingleDate")
    List<StaticsSummary> queryStaticsSummaryReportSingleDate(String from);
}