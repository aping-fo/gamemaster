package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="logon_statistics")
public class LogonStatisticsEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer logonCount;

    private Integer logonNumber;

    private BigDecimal avgLogonNumber;

    private Integer oldPlayerCount;

    private Integer oldPlayerOnlineTime;

    private BigDecimal oldPlayerAvgOnlineTime;

    private BigDecimal oldPlayerArpu;

    private Integer activePlayerCount;

    private Integer loyalPlayerCount;

    private Integer totalRegistration;

    private Integer oldPlayerEquipment;

    private String packageName;

    private Integer packageId;

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

    public Integer getLogonCount() {
        return logonCount;
    }

    public void setLogonCount(Integer logonCount) {
        this.logonCount = logonCount;
    }

    public Integer getLogonNumber() {
        return logonNumber;
    }

    public void setLogonNumber(Integer logonNumber) {
        this.logonNumber = logonNumber;
    }

    public BigDecimal getAvgLogonNumber() {
        return avgLogonNumber;
    }

    public void setAvgLogonNumber(BigDecimal avgLogonNumber) {
        this.avgLogonNumber = avgLogonNumber;
    }

    public Integer getOldPlayerCount() {
        return oldPlayerCount;
    }

    public void setOldPlayerCount(Integer oldPlayerCount) {
        this.oldPlayerCount = oldPlayerCount;
    }

    public Integer getOldPlayerOnlineTime() {
        return oldPlayerOnlineTime;
    }

    public void setOldPlayerOnlineTime(Integer oldPlayerOnlineTime) {
        this.oldPlayerOnlineTime = oldPlayerOnlineTime;
    }

    public BigDecimal getOldPlayerAvgOnlineTime() {
        return oldPlayerAvgOnlineTime;
    }

    public void setOldPlayerAvgOnlineTime(BigDecimal oldPlayerAvgOnlineTime) {
        this.oldPlayerAvgOnlineTime = oldPlayerAvgOnlineTime;
    }

    public BigDecimal getOldPlayerArpu() {
        return oldPlayerArpu;
    }

    public void setOldPlayerArpu(BigDecimal oldPlayerArpu) {
        this.oldPlayerArpu = oldPlayerArpu;
    }

    public Integer getActivePlayerCount() {
        return activePlayerCount;
    }

    public void setActivePlayerCount(Integer activePlayerCount) {
        this.activePlayerCount = activePlayerCount;
    }

    public Integer getLoyalPlayerCount() {
        return loyalPlayerCount;
    }

    public void setLoyalPlayerCount(Integer loyalPlayerCount) {
        this.loyalPlayerCount = loyalPlayerCount;
    }

    public Integer getTotalRegistration() {
        return totalRegistration;
    }

    public void setTotalRegistration(Integer totalRegistration) {
        this.totalRegistration = totalRegistration;
    }

    public Integer getOldPlayerEquipment() {
        return oldPlayerEquipment;
    }

    public void setOldPlayerEquipment(Integer oldPlayerEquipment) {
        this.oldPlayerEquipment = oldPlayerEquipment;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }
}