package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.GoodsRecoveryEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.GoodsRecoveryMapper;
import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;
import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("goodsRecoveryService")
public class GoodsRecoveryServiceImpl extends BaseNewServiceImpl<GoodsRecoveryEntity> implements GoodsRecoveryService {
    @Autowired
    private GoodsRecoveryMapper goodsRecoveryMapper;

    @Override
    public Mapper<GoodsRecoveryEntity> getMapper() {
        return goodsRecoveryMapper;
    }

    @Override
    public Page<GoodsRecovery> searchPage(GoodsRecoverySearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> goodsRecoveryMapper.searchPage(query));
    }
}
