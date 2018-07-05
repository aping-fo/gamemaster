package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="new_user")
public class NewUserEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer firstChargeCount;

    private Integer newUserCount;

    private Integer newPaySum;

    private BigDecimal newPayRate;

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

    public Integer getFirstChargeCount() {
        return firstChargeCount;
    }

    public void setFirstChargeCount(Integer firstChargeCount) {
        this.firstChargeCount = firstChargeCount;
    }

    public Integer getNewUserCount() {
        return newUserCount;
    }

    public void setNewUserCount(Integer newUserCount) {
        this.newUserCount = newUserCount;
    }

    public Integer getNewPaySum() {
        return newPaySum;
    }

    public void setNewPaySum(Integer newPaySum) {
        this.newPaySum = newPaySum;
    }

    public BigDecimal getNewPayRate() {
        return newPayRate;
    }

    public void setNewPayRate(BigDecimal newPayRate) {
        this.newPayRate = newPayRate;
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