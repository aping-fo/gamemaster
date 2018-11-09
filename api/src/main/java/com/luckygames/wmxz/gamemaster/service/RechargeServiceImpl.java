package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RechargeEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.RechargeMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Recharge;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("RechargeService")
public class RechargeServiceImpl extends BaseNewServiceImpl<RechargeEntity> implements RechargeService {
    @Autowired
    private RechargeMapper rechargeMapper;

    @Override
    public Mapper<RechargeEntity> getMapper() {
        return rechargeMapper;
    }

    @Override
    public Page<Recharge> searchPage(RechargeSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rechargeMapper.searchPage(query));
    }

    @Override
    public List<Recharge> searchList() {
        return rechargeMapper.searchList();
    }
}
