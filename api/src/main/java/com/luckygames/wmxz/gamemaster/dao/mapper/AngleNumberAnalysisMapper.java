package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.AngleNumberAnalysisEntity;
import com.luckygames.wmxz.gamemaster.dao.AngleNumberAnalysisEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.AngleNumberAnalysisSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.AngleNumberAnalysis;
import com.luckygames.wmxz.gamemaster.model.view.request.AngleNumberAnalysisSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface AngleNumberAnalysisMapper extends AngleNumberAnalysisEntityMapper<AngleNumberAnalysisEntity> {

    @SelectProvider(type = AngleNumberAnalysisSqlProvider.class, method = "searchPage")
    List<AngleNumberAnalysis> searchPage(CommonSearchQuery query);
}
