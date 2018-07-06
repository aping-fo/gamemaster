package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RankingsFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RankingsFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.RankingsFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface RankingsFlowService extends BaseService<RankingsFlowEntity> {
    Page<RankingsFlow> searchPage(RankingsFlowSearchQuery query);
}
