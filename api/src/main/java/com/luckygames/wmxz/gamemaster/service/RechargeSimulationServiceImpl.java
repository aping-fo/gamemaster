package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;

import com.luckygames.wmxz.gamemaster.dao.RechargeSimulationEntity;

import com.luckygames.wmxz.gamemaster.model.entity.RechargeSimulation;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSimulationSearchQuery;

import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by lucky on 2018/3/28.
 */
@Service("rechargeSimulation")
public class RechargeSimulationServiceImpl extends BaseServiceImpl<RechargeSimulationEntity> implements RechargeSimulationService {

    @Autowired
    private com.luckygames.wmxz.gamemaster.dao.mapper.RechargeSimulationMapper RechargeSimulationMapper;

    @Override
    public Mapper<RechargeSimulationEntity> getMapper() {
        return RechargeSimulationMapper;
    }

    @Override
    public Page<RechargeSimulation> searchPage(RechargeSimulationSearchQuery query) {
        return RechargeSimulationMapper.searchPage(query);
    }

    @Override
    public void addRechargeSimulation(RechargeSimulationSearchQuery query) {
        RechargeSimulation rechargeAdd = new RechargeSimulation();
        rechargeAdd.setUserName(query.getUserName());
        rechargeAdd.setPlayerId(query.getPlayerId());
        rechargeAdd.setChargeType(query.getType());
        rechargeAdd.setChargeAmount(query.getAmount());
        rechargeAdd.setServerName(query.getServerName());
        rechargeAdd.setServerId(query.getServerId());
        create(rechargeAdd);
    }
    @Override
    public void delRechargeSimulation(Long id) {
        {
            RechargeSimulationMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public RechargeSimulation searchById(Long id) {
        return RechargeSimulationMapper.selectById(id);
    }

}
