package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeSimulationEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeSimulationEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RechargeSimulationSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeSimulation;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSimulationSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

public interface RechargeSimulationMapper extends RechargeSimulationEntityMapper<RechargeSimulationEntity> {
    @SelectProvider(type = RechargeSimulationSqlProvider.class, method = "searchPage")
    Page<RechargeSimulation> searchPage(RechargeSimulationSearchQuery query);

    @Select("select * from recharge_simulation where id = #{id}")
    RechargeSimulation selectById(@Param("id") Long id);
}
