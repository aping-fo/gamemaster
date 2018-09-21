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

}
