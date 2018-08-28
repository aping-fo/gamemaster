package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeFailedOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeFailedOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface RechargeFailedOrderService extends BaseService<RechargeFailedOrderEntity> {
    Page<RechargeFailedOrder> searchPage(RechargeFailedOrderSearchQuery query);

    void delete(int id);
}
