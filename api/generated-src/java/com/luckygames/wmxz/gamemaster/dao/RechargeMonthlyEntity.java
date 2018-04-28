package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Table;

@Table(name="recharge_monthly")
public class RechargeMonthlyEntity extends BaseEntity {
    private Long channelId;

    private String channelName;

    private Long serverId;

    private String serverName;

    private Date openDate;

    private BigDecimal rechargeAmount;

    private Integer rechargeYear;

    private Integer rechargeMonth;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getRechargeYear() {
        return rechargeYear;
    }

    public void setRechargeYear(Integer rechargeYear) {
        this.rechargeYear = rechargeYear;
    }

    public Integer getRechargeMonth() {
        return rechargeMonth;
    }

    public void setRechargeMonth(Integer rechargeMonth) {
        this.rechargeMonth = rechargeMonth;
    }
}