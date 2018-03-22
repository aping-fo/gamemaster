package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;

public class RechargeDaily extends BaseEntity {
    private Long channelId;

    private Long serverId;

    private String reportDate;

    private Integer rechargeSum;

    private BigDecimal rechargeAmount;

    private Integer appendSum;

    private BigDecimal appendAmount;

    private Integer goldSum;

    private Integer goldAppend;

    private BigDecimal arpuSum;

    private BigDecimal arpuAppend;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public Integer getRechargeSum() {
        return rechargeSum;
    }

    public void setRechargeSum(Integer rechargeSum) {
        this.rechargeSum = rechargeSum;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getAppendSum() {
        return appendSum;
    }

    public void setAppendSum(Integer appendSum) {
        this.appendSum = appendSum;
    }

    public BigDecimal getAppendAmount() {
        return appendAmount;
    }

    public void setAppendAmount(BigDecimal appendAmount) {
        this.appendAmount = appendAmount;
    }

    public Integer getGoldSum() {
        return goldSum;
    }

    public void setGoldSum(Integer goldSum) {
        this.goldSum = goldSum;
    }

    public Integer getGoldAppend() {
        return goldAppend;
    }

    public void setGoldAppend(Integer goldAppend) {
        this.goldAppend = goldAppend;
    }

    public BigDecimal getArpuSum() {
        return arpuSum;
    }

    public void setArpuSum(BigDecimal arpuSum) {
        this.arpuSum = arpuSum;
    }

    public BigDecimal getArpuAppend() {
        return arpuAppend;
    }

    public void setArpuAppend(BigDecimal arpuAppend) {
        this.arpuAppend = arpuAppend;
    }
}