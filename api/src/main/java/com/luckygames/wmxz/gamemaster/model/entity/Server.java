package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.ServerEntity;

import java.math.BigDecimal;

public class Server extends ServerEntity {
    private Integer openDays;
    private Integer charCount;
    private Integer onlineCount;
    private Integer activeCount;
    private BigDecimal rechargeAmount;
    private Integer rechargeCount;
    private BigDecimal arpu;

    public Integer getOpenDays() {
        return openDays;
    }

    public void setOpenDays(Integer openDays) {
        this.openDays = openDays;
    }

    public Integer getCharCount() {
        return charCount;
    }

    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }

    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public Integer getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getRechargeCount() {
        return rechargeCount;
    }

    public void setRechargeCount(Integer rechargeCount) {
        this.rechargeCount = rechargeCount;
    }

    public BigDecimal getArpu() {
        return arpu;
    }

    public void setArpu(BigDecimal arpu) {
        this.arpu = arpu;
    }
}
