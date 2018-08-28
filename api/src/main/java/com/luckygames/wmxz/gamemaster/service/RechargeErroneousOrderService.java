package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeErroneousOrderEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeErroneousOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeErroneousOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface RechargeErroneousOrderService extends BaseService<RechargeErroneousOrderEntity> {
    Page<RechargeErroneousOrder> searchPage(RechargeErroneousOrderSearchQuery query);
}
