package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;

import com.luckygames.wmxz.gamemaster.dao.GoodsRecoveryEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.GoodsRecoveryMapper;

import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;

import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service("goodsRecoveryService")
public class GoodsRecoveryServiceImpl extends BaseServiceImpl<GoodsRecoveryEntity> implements GoodsRecoveryService {
    HashMap<Long,String> m_goodsMap =
            new HashMap<Long,String>() {
                {
                    put( 101L,"元宝");
                    put( 102L,"宝石");
                }
            };
    @Autowired
    private GoodsRecoveryMapper goodsRecoveryMapper;

    @Override
    public Mapper<GoodsRecoveryEntity> getMapper() {
        return goodsRecoveryMapper;
    }
    @Override
    public Page<GoodsRecovery> searchPage(GoodsRecoverySearchQuery query) {
        return goodsRecoveryMapper.searchPage(query);
    }
    @Override
    public void addGoodsRecovery(GoodsRecoverySearchQuery query) {
        GoodsRecovery recoveryAdd = new GoodsRecovery();
        recoveryAdd.setPlayerId(query.getPlayerId());
        recoveryAdd.setOperator(query.getOperator());
        recoveryAdd.setPlayerName(query.getPlayerName());
        recoveryAdd.setServerId(query.getServerId());
        recoveryAdd.setGoodsId(query.getGoodsId());
        recoveryAdd.setGoodsName(goodsMap().get(query.getGoodsId()));
        recoveryAdd.setReason(query.getReason());
        recoveryAdd.setState(query.getState());
        recoveryAdd.setGoodsNum(query.getGoodsNum());
        create(recoveryAdd);
    }
    @Override
    public HashMap<Long,String> goodsMap()
    {
        return m_goodsMap;
    }

}
