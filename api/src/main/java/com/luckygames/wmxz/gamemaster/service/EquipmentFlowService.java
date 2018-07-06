package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.EquipmentFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.EquipmentFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.EquipmentFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface EquipmentFlowService extends BaseService<EquipmentFlowEntity> {
    Page<EquipmentFlow> searchPage(EquipmentFlowSearchQuery query);
}
