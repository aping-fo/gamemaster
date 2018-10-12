package com.luckygames.wmxz.gamemaster.model.entity;


import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntity;

public class DiamondsLog extends DiamondLogsEntity {
    private String serverName;
    private Integer lev;
    private Integer prevValue;
    private Integer nextValue;
    private Integer diamond;
    private Integer count;
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
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
