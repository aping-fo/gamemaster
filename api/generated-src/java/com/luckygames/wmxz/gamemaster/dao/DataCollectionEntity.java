package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="comprehensive_report_data_collection")
public class DataCollectionEntity extends BaseEntity {
    private String reportDate;

    private Long registerNumber;

    private Long roleNumber;

    private Long loginNumber;

    private Long activeNumber;

    private Long oldPlayerNumber;

    private Long payNumber;

    private Long rechargeAmount;

    private BigDecimal payRate;

    private BigDecimal payArpu;

    private Long newPayNumber;

    private BigDecimal newPayRate;

    private Long newRechargeAmount;

    private BigDecimal newPayArpu;

    private Long oldPayNumber;

    private Long oldRechargeAmount;

    private BigDecimal oldPayRate;

    private BigDecimal oldPayArpu;

    private BigDecimal nextDayAvg;

    private BigDecimal threeDayAvg;

    private BigDecimal sevenDayAvg;

    private Long channelId;

    private Long serverId;

    private String channelName;

    private String serverName;

    private String packageName;

    private Integer packageId;

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public Long getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(Long registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Long getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(Long roleNumber) {
        this.roleNumber = roleNumber;
    }

    public Long getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(Long loginNumber) {
        this.loginNumber = loginNumber;
    }

    public Long getActiveNumber() {
        return activeNumber;
    }

    public void setActiveNumber(Long activeNumber) {
        this.activeNumber = activeNumber;
    }

    public Long getOldPlayerNumber() {
        return oldPlayerNumber;
    }

    public void setOldPlayerNumber(Long oldPlayerNumber) {
        this.oldPlayerNumber = oldPlayerNumber;
    }

    public Long getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(Long payNumber) {
        this.payNumber = payNumber;
    }

    public Long getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Long rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getPayRate() {
        return payRate;
    }

    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    public BigDecimal getPayArpu() {
        return payArpu;
    }

    public void setPayArpu(BigDecimal payArpu) {
        this.payArpu = payArpu;
    }

    public Long getNewPayNumber() {
        return newPayNumber;
    }

    public void setNewPayNumber(Long newPayNumber) {
        this.newPayNumber = newPayNumber;
    }

    public BigDecimal getNewPayRate() {
        return newPayRate;
    }

    public void setNewPayRate(BigDecimal newPayRate) {
        this.newPayRate = newPayRate;
    }

    public Long getNewRechargeAmount() {
        return newRechargeAmount;
    }

    public void setNewRechargeAmount(Long newRechargeAmount) {
        this.newRechargeAmount = newRechargeAmount;
    }

    public BigDecimal getNewPayArpu() {
        return newPayArpu;
    }

    public void setNewPayArpu(BigDecimal newPayArpu) {
        this.newPayArpu = newPayArpu;
    }

    public Long getOldPayNumber() {
        return oldPayNumber;
    }

    public void setOldPayNumber(Long oldPayNumber) {
        this.oldPayNumber = oldPayNumber;
    }

    public Long getOldRechargeAmount() {
        return oldRechargeAmount;
    }

    public void setOldRechargeAmount(Long oldRechargeAmount) {
        this.oldRechargeAmount = oldRechargeAmount;
    }

    public BigDecimal getOldPayRate() {
        return oldPayRate;
    }

    public void setOldPayRate(BigDecimal oldPayRate) {
        this.oldPayRate = oldPayRate;
    }

    public BigDecimal getOldPayArpu() {
        return oldPayArpu;
    }

    public void setOldPayArpu(BigDecimal oldPayArpu) {
        this.oldPayArpu = oldPayArpu;
    }

    public BigDecimal getNextDayAvg() {
        return nextDayAvg;
    }

    public void setNextDayAvg(BigDecimal nextDayAvg) {
        this.nextDayAvg = nextDayAvg;
    }

    public BigDecimal getThreeDayAvg() {
        return threeDayAvg;
    }

    public void setThreeDayAvg(BigDecimal threeDayAvg) {
        this.threeDayAvg = threeDayAvg;
    }

    public BigDecimal getSevenDayAvg() {
        return sevenDayAvg;
    }

    public void setSevenDayAvg(BigDecimal sevenDayAvg) {
        this.sevenDayAvg = sevenDayAvg;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
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