package com.luckygames.wmxz.gamemaster.dao;

public class DiamondLogsEntityWithBLOBs extends DiamondLogsEntity {
    private String costInfo;

    private String getInfo;

    public String getCostInfo() {
        return costInfo;
    }

    public void setCostInfo(String costInfo) {
        this.costInfo = costInfo == null ? null : costInfo.trim();
    }

    public String getGetInfo() {
        return getInfo;
    }

    public void setGetInfo(String getInfo) {
        this.getInfo = getInfo == null ? null : getInfo.trim();
    }
}