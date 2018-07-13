package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Table;

@Table(name="pay_retention_rate")
public class PayRetentionRateEntity extends BaseEntity {
    private Date reportDate;

    private Integer userCount;

    private BigDecimal oneDay;

    private BigDecimal twoDay;

    private BigDecimal threeDay;

    private BigDecimal fourDay;

    private BigDecimal fiveDay;

    private BigDecimal sixDay;

    private BigDecimal sevenDay;

    private BigDecimal twoWeeks;

    private BigDecimal oneMonth;

    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer packageId;

    private String packageName;

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public BigDecimal getOneDay() {
        return oneDay;
    }

    public void setOneDay(BigDecimal oneDay) {
        this.oneDay = oneDay;
    }

    public BigDecimal getTwoDay() {
        return twoDay;
    }

    public void setTwoDay(BigDecimal twoDay) {
        this.twoDay = twoDay;
    }

    public BigDecimal getThreeDay() {
        return threeDay;
    }

    public void setThreeDay(BigDecimal threeDay) {
        this.threeDay = threeDay;
    }

    public BigDecimal getFourDay() {
        return fourDay;
    }

    public void setFourDay(BigDecimal fourDay) {
        this.fourDay = fourDay;
    }

    public BigDecimal getFiveDay() {
        return fiveDay;
    }

    public void setFiveDay(BigDecimal fiveDay) {
        this.fiveDay = fiveDay;
    }

    public BigDecimal getSixDay() {
        return sixDay;
    }

    public void setSixDay(BigDecimal sixDay) {
        this.sixDay = sixDay;
    }

    public BigDecimal getSevenDay() {
        return sevenDay;
    }

    public void setSevenDay(BigDecimal sevenDay) {
        this.sevenDay = sevenDay;
    }

    public BigDecimal getTwoWeeks() {
        return twoWeeks;
    }

    public void setTwoWeeks(BigDecimal twoWeeks) {
        this.twoWeeks = twoWeeks;
    }

    public BigDecimal getOneMonth() {
        return oneMonth;
    }

    public void setOneMonth(BigDecimal oneMonth) {
        this.oneMonth = oneMonth;
    }

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

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }
}