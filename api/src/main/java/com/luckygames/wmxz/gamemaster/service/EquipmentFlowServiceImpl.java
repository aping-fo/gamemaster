package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.EquipmentFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.EquipmentFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.EquipmentFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.EquipmentFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("EquipmentFlowService")
public class EquipmentFlowServiceImpl extends BaseServiceImpl<EquipmentFlowEntity> implements EquipmentFlowService {
    @Autowired
    private EquipmentFlowMapper EquipmentFlowMapper;

    @Override
    public Mapper<EquipmentFlowEntity> getMapper() {
        return EquipmentFlowMapper;
    }

    @Override
    public Page<EquipmentFlow> searchPage(EquipmentFlowSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> EquipmentFlowMapper.searchPage(query));
    }
}
