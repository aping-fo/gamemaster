package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.OtherFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.OtherFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.OtherFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface OtherFlowService extends BaseService<OtherFlowEntity> {
    Page<OtherFlow> searchPage(OtherFlowSearchQuery query);
}
