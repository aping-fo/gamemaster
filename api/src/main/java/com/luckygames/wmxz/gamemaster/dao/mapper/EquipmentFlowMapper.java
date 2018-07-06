package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.EquipmentFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.EquipmentFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.EquipmentFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.EquipmentFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.EquipmentFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface EquipmentFlowMapper extends EquipmentFlowEntityMapper<EquipmentFlowEntity> {
    @SelectProvider(type = EquipmentFlowSqlProvider.class, method = "searchPage")
    List<EquipmentFlow> searchPage(EquipmentFlowSearchQuery query);
}
