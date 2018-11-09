package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Recharge;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

import java.util.List;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface RechargeService extends BaseNewService<RechargeEntity> {
    Page<Recharge> searchPage(RechargeSearchQuery query);

    List<Recharge> searchList();
}
