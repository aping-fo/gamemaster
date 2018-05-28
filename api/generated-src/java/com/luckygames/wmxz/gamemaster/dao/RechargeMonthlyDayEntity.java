package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="recharge_monthly_day")
public class RechargeMonthlyDayEntity extends BaseEntity {
    private Long rechargeMonthlyId;

    private Integer rechargeDay;

    private BigDecimal amount;

    public Long getRechargeMonthlyId() {
        return rechargeMonthlyId;
    }

    public void setRechargeMonthlyId(Long rechargeMonthlyId) {
        this.rechargeMonthlyId = rechargeMonthlyId;
    }

    public Integer getRechargeDay() {
        return rechargeDay;
    }

    public void setRechargeDay(Integer rechargeDay) {
        this.rechargeDay = rechargeDay;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}