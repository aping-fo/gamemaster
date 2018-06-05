package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="base_information")
public class BaseInformationEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer charId;

    private String account;

    private String charName;

    private Integer level;

    private Integer slaughter;

    private Integer killingNumber;

    private Integer vipLevel;

    private Integer accountAuthority;

    private String sex;

    private Integer combatPower;

    private String gangs;

    private Integer exp;

    private Integer rechargeTreasure;

    private Integer rechargeNumber;

    private Date firstChargeTime;

    private Date lastChargeTime;

    private Integer nonRechargeDays;

    private Integer surplusTreasure;

    private Integer consumesTreasure;

    private Integer surplusBindingTreasure;

    private Integer consumesBindingTreasure;

    private Integer surplusMoney;

    private Integer consumesMoney;

    private Integer surplusBindingMoney;

    private Integer consumesBindingMoney;

    private Date loginTime;

    private String loginIp;

    private String networkEnvironment;

    private String mac;

    private String model;

    private String systemVersion;

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

    public Integer getCharId() {
        return charId;
    }

    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName == null ? null : charName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSlaughter() {
        return slaughter;
    }

    public void setSlaughter(Integer slaughter) {
        this.slaughter = slaughter;
    }

    public Integer getKillingNumber() {
        return killingNumber;
    }

    public void setKillingNumber(Integer killingNumber) {
        this.killingNumber = killingNumber;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getAccountAuthority() {
        return accountAuthority;
    }

    public void setAccountAuthority(Integer accountAuthority) {
        this.accountAuthority = accountAuthority;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getCombatPower() {
        return combatPower;
    }

    public void setCombatPower(Integer combatPower) {
        this.combatPower = combatPower;
    }

    public String getGangs() {
        return gangs;
    }

    public void setGangs(String gangs) {
        this.gangs = gangs == null ? null : gangs.trim();
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getRechargeTreasure() {
        return rechargeTreasure;
    }

    public void setRechargeTreasure(Integer rechargeTreasure) {
        this.rechargeTreasure = rechargeTreasure;
    }

    public Integer getRechargeNumber() {
        return rechargeNumber;
    }

    public void setRechargeNumber(Integer rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }

    public Date getFirstChargeTime() {
        return firstChargeTime;
    }

    public void setFirstChargeTime(Date firstChargeTime) {
        this.firstChargeTime = firstChargeTime;
    }

    public Date getLastChargeTime() {
        return lastChargeTime;
    }

    public void setLastChargeTime(Date lastChargeTime) {
        this.lastChargeTime = lastChargeTime;
    }

    public Integer getNonRechargeDays() {
        return nonRechargeDays;
    }

    public void setNonRechargeDays(Integer nonRechargeDays) {
        this.nonRechargeDays = nonRechargeDays;
    }

    public Integer getSurplusTreasure() {
        return surplusTreasure;
    }

    public void setSurplusTreasure(Integer surplusTreasure) {
        this.surplusTreasure = surplusTreasure;
    }

    public Integer getConsumesTreasure() {
        return consumesTreasure;
    }

    public void setConsumesTreasure(Integer consumesTreasure) {
        this.consumesTreasure = consumesTreasure;
    }

    public Integer getSurplusBindingTreasure() {
        return surplusBindingTreasure;
    }

    public void setSurplusBindingTreasure(Integer surplusBindingTreasure) {
        this.surplusBindingTreasure = surplusBindingTreasure;
    }

    public Integer getConsumesBindingTreasure() {
        return consumesBindingTreasure;
    }

    public void setConsumesBindingTreasure(Integer consumesBindingTreasure) {
        this.consumesBindingTreasure = consumesBindingTreasure;
    }

    public Integer getSurplusMoney() {
        return surplusMoney;
    }

    public void setSurplusMoney(Integer surplusMoney) {
        this.surplusMoney = surplusMoney;
    }

    public Integer getConsumesMoney() {
        return consumesMoney;
    }

    public void setConsumesMoney(Integer consumesMoney) {
        this.consumesMoney = consumesMoney;
    }

    public Integer getSurplusBindingMoney() {
        return surplusBindingMoney;
    }

    public void setSurplusBindingMoney(Integer surplusBindingMoney) {
        this.surplusBindingMoney = surplusBindingMoney;
    }

    public Integer getConsumesBindingMoney() {
        return consumesBindingMoney;
    }

    public void setConsumesBindingMoney(Integer consumesBindingMoney) {
        this.consumesBindingMoney = consumesBindingMoney;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getNetworkEnvironment() {
        return networkEnvironment;
    }

    public void setNetworkEnvironment(String networkEnvironment) {
        this.networkEnvironment = networkEnvironment == null ? null : networkEnvironment.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion == null ? null : systemVersion.trim();
    }
}