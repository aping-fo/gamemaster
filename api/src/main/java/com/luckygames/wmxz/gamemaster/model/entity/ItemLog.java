package com.luckygames.wmxz.gamemaster.model.entity;


import com.luckygames.wmxz.gamemaster.dao.ItemLogEntity;

public class ItemLog extends ItemLogEntity {
    private String serverName;
    private Integer lev;
    private Integer prevValue;
    private Integer nextValue;
    private String reason;
    private String goodsName;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getPrevValue() {
        return prevValue;
    }

    public void setPrevValue(Integer prevValue) {
        this.prevValue = prevValue;
    }

    public Integer getNextValue() {
        return nextValue;
    }

    public void setNextValue(Integer nextValue) {
        this.nextValue = nextValue;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
