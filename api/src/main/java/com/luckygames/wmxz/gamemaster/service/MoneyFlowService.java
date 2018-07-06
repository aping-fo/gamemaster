package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MoneyFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.MoneyFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.MoneyFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface MoneyFlowService extends BaseService<MoneyFlowEntity> {
    Page<MoneyFlow> searchPage(MoneyFlowSearchQuery query);
}
