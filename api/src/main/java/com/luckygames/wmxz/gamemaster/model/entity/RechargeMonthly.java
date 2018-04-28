package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntity;

import java.math.BigDecimal;
import java.util.List;

public class RechargeMonthly extends RechargeMonthlyEntity {
    private List<RechargeMonthlyDay> rechargeMonthlyDayList;
    private List<BigDecimal> amountMonthly;

    public List<BigDecimal> getAmountMonthly() {
        return amountMonthly;
    }

    public void setAmountMonthly(List<BigDecimal> amountMonthly) {
        this.amountMonthly = amountMonthly;
    }

    public List<RechargeMonthlyDay> getRechargeMonthlyDayList() {
        return rechargeMonthlyDayList;
    }

    public void setRechargeMonthlyDayList(List<RechargeMonthlyDay> rechargeMonthlyDayList) {
        this.rechargeMonthlyDayList = rechargeMonthlyDayList;
    }
}
