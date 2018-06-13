package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.AngleNumberAnalysisEntity;
import com.luckygames.wmxz.gamemaster.model.entity.AngleNumberAnalysis;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface AngleNumberAnalysisService extends BaseService<AngleNumberAnalysisEntity> {
    Page<AngleNumberAnalysis> searchPage(CommonSearchQuery query);
}
