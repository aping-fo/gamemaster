package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.RechargeFailedOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeFailedOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeFailedOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("rechargeFailedOrderService")
public class RechargeFailedOrderServiceImpl extends BaseServiceImpl<RechargeFailedOrderEntity> implements RechargeFailedOrderService {
    @Autowired
    private RechargeFailedOrderMapper rechargeFailedOrderMapper;

    @Override
    public Mapper<RechargeFailedOrderEntity> getMapper() {
        return rechargeFailedOrderMapper;
    }

    @Override
    public Page<RechargeFailedOrder> searchPage(RechargeFailedOrderSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rechargeFailedOrderMapper.searchPage(query));
    }

    @Override
    public void delete(int id) {
        rechargeFailedOrderMapper.deleteByPrimaryKey(id);
    }

}
