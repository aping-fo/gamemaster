package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="statics_summary")
public class StaticsSummaryEntity extends BaseEntity {
    private Long channelId;

    private Long serverId;

    private String reportDate;

    private Integer playerCount;

    private Integer charCount;

    private Integer loginCount;

    private Integer onlineCount;

    private Integer activeCharCount;

    private BigDecimal rechargeSum;

    private Integer rechargeCount;

    private BigDecimal arpu;

    private Integer newRechargeCount;

    private BigDecimal newRechargeRate;

    private BigDecimal stay2d;

    private BigDecimal stay3d;

    private BigDecimal stay7d;

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

    public Integer getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(Integer playerCount) {
        this.playerCount = playerCount;
    }

    public Integer getCharCount() {
        return charCount;
    }

    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public Integer getActiveCharCount() {
        return activeCharCount;
    }

    public void setActiveCharCount(Integer activeCharCount) {
        this.activeCharCount = activeCharCount;
    }

    public BigDecimal getRechargeSum() {
        return rechargeSum;
    }

    public void setRechargeSum(BigDecimal rechargeSum) {
        this.rechargeSum = rechargeSum;
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

    public Integer getNewRechargeCount() {
        return newRechargeCount;
    }

    public void setNewRechargeCount(Integer newRechargeCount) {
        this.newRechargeCount = newRechargeCount;
    }

    public BigDecimal getNewRechargeRate() {
        return newRechargeRate;
    }

    public void setNewRechargeRate(BigDecimal newRechargeRate) {
        this.newRechargeRate = newRechargeRate;
    }

    public BigDecimal getStay2d() {
        return stay2d;
    }

    public void setStay2d(BigDecimal stay2d) {
        this.stay2d = stay2d;
    }

    public BigDecimal getStay3d() {
        return stay3d;
    }

    public void setStay3d(BigDecimal stay3d) {
        this.stay3d = stay3d;
    }

    public BigDecimal getStay7d() {
        return stay7d;
    }

    public void setStay7d(BigDecimal stay7d) {
        this.stay7d = stay7d;
    }
}