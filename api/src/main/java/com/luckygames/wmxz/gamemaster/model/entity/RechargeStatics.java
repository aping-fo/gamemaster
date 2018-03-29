package com.luckygames.wmxz.gamemaster.model.entity;

import java.math.BigDecimal;

public class RechargeStatics {
    private Integer channelId;
    private Integer serverId;
    private BigDecimal rechargeAmount;
    private BigDecimal goldSum;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getGoldSum() {
        return goldSum;
    }

    public void setGoldSum(BigDecimal goldSum) {
        this.goldSum = goldSum;
    }
}
