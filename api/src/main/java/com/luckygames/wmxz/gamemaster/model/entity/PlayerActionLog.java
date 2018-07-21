package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;

public class PlayerActionLog extends PlayerActionLogEntity {
    private String date;
    private Integer level;
    private Long userNumber;
    private Double userRate;
    private Long activeNumber;
    private Double activeRate;
    private Long payNumber;
    private Double payRate;

    @Override
    public Integer getLevel() {
        return level;
    }

    @Override
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Long userNumber) {
        this.userNumber = userNumber;
    }

    public Double getUserRate() {
        return userRate;
    }

    public void setUserRate(Double userRate) {
        this.userRate = userRate;
    }

    public Long getActiveNumber() {
        return activeNumber;
    }

    public void setActiveNumber(Long activeNumber) {
        this.activeNumber = activeNumber;
    }

    public Double getActiveRate() {
        return activeRate;
    }

    public void setActiveRate(Double activeRate) {
        this.activeRate = activeRate;
    }

    public Long getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(Long payNumber) {
        this.payNumber = payNumber;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
