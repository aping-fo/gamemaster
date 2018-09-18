package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="server")
public class ServerEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Integer serverState;

    private Integer showNumber;

    private Integer label;

    private String ip;

    private Integer port;

    private String payAddress;

    private String openTime;

    private String closeTime;

    private String remarks;

    private Integer whiteListEnable;

    private String maintenanceTips;

    private Integer gmPort;

    private String whiteList;

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

    public Integer getServerState() {
        return serverState;
    }

    public void setServerState(Integer serverState) {
        this.serverState = serverState;
    }

    public Integer getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(Integer showNumber) {
        this.showNumber = showNumber;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPayAddress() {
        return payAddress;
    }

    public void setPayAddress(String payAddress) {
        this.payAddress = payAddress == null ? null : payAddress.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getWhiteListEnable() {
        return whiteListEnable;
    }

    public void setWhiteListEnable(Integer whiteListEnable) {
        this.whiteListEnable = whiteListEnable;
    }

    public String getMaintenanceTips() {
        return maintenanceTips;
    }

    public void setMaintenanceTips(String maintenanceTips) {
        this.maintenanceTips = maintenanceTips == null ? null : maintenanceTips.trim();
    }

    public Integer getGmPort() {
        return gmPort;
    }

    public void setGmPort(Integer gmPort) {
        this.gmPort = gmPort;
    }

    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList == null ? null : whiteList.trim();
    }
}