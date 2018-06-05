package com.luckygames.wmxz.gamemaster.service;
import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PropFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.PropFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface PropFlowService extends BaseService<PropFlowEntity> {
    Page<PropFlow> searchPage(PropFlowSearchQuery query);
}
