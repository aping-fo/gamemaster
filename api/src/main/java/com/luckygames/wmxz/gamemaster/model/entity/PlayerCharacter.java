package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntity;

import java.math.BigDecimal;

public class PlayerCharacter extends PlayerCharacterEntity {
    private Long channelId;
    private String channelName;
    private String username;
    private String mobile;
    private String idCard;
    private Integer loginTimes;
    private Integer loginDays;

    private Integer onlineTime;

    private BigDecimal rechargeAmount;

    public Integer getLoginDays() {
        return loginDays;
    }

    public void setLoginDays(Integer loginDays) {
        this.loginDays = loginDays;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Integer getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Integer onlineTime) {
        this.onlineTime = onlineTime;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

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
        this.channelName = channelName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
