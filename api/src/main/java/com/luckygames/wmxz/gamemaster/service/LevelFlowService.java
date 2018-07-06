package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LevelFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.LevelFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.LevelFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface LevelFlowService extends BaseService<LevelFlowEntity> {
    Page<LevelFlow> searchPage(LevelFlowSearchQuery query);
}
