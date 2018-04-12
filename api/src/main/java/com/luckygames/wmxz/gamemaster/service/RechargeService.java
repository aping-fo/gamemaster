package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeStatics;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;

/**
 * Created by lucky on 2018/3/28.
 */
public interface RechargeService {
    Page<RechargeStatics> queryServerRechargeTotal(CommonSearchQuery query);

}
