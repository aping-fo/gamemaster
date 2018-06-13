package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyDayEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeMonthlyDay;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.List;

public interface RechargeMonthlyDayService extends BaseService<RechargeMonthlyDayEntity> {
    RechargeMonthlyDay findOne(Long rechargeMonthlyId, int day);

    List<RechargeMonthlyDay> findByRechargeMonthlyId(Long rechargeMonthlyId);
}
