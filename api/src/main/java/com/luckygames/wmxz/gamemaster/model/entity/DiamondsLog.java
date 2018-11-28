package com.luckygames.wmxz.gamemaster.model.entity;


import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntity;

public class DiamondsLog extends DiamondLogsEntity {
    private String serverName;
    private Integer diamond;
    private Integer count;
    private String reason;
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

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

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
