package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import javax.persistence.Table;

@Table(name="new_user")
public class NewUserEntity extends BaseNewEntity {
    private Long serverId;

    private Integer newUserCount;

    private Integer chargeUserCount;

    private Integer loginUserCount;

    private Integer income;

    private Double arpu;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Integer getNewUserCount() {
        return newUserCount;
    }

    public void setNewUserCount(Integer newUserCount) {
        this.newUserCount = newUserCount;
    }

    public Integer getChargeUserCount() {
        return chargeUserCount;
    }

    public void setChargeUserCount(Integer chargeUserCount) {
        this.chargeUserCount = chargeUserCount;
    }

    public Integer getLoginUserCount() {
        return loginUserCount;
    }

    public void setLoginUserCount(Integer loginUserCount) {
        this.loginUserCount = loginUserCount;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Double getArpu() {
        return arpu;
    }

    public void setArpu(Double arpu) {
        this.arpu = arpu;
    }
}