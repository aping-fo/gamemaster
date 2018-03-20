package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.util.Date;

public class PlayerCharacter extends BaseEntity {
    private Long playerId;

    private Long serverId;

    private Long charId;

    private String charName;

    private String sex;

    private Integer level;

    private Integer vipLevel;

    private Integer power;

    private Integer factionId;

    private String factionName;

    private String job;

    private Integer exp;

    private Integer rechargeGold;

    private Integer rechargeTimes;

    private Date firstRechargeTime;

    private Date lastRechargeTime;

    private Integer leftGold;

    private Integer leftSpecialGold;

    private Integer usedSpecialGold;

    private Long leftCoin;

    private Long usedCoin;

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName == null ? null : charName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName == null ? null : factionName.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getRechargeGold() {
        return rechargeGold;
    }

    public void setRechargeGold(Integer rechargeGold) {
        this.rechargeGold = rechargeGold;
    }

    public Integer getRechargeTimes() {
        return rechargeTimes;
    }

    public void setRechargeTimes(Integer rechargeTimes) {
        this.rechargeTimes = rechargeTimes;
    }

    public Date getFirstRechargeTime() {
        return firstRechargeTime;
    }

    public void setFirstRechargeTime(Date firstRechargeTime) {
        this.firstRechargeTime = firstRechargeTime;
    }

    public Date getLastRechargeTime() {
        return lastRechargeTime;
    }

    public void setLastRechargeTime(Date lastRechargeTime) {
        this.lastRechargeTime = lastRechargeTime;
    }

    public Integer getLeftGold() {
        return leftGold;
    }

    public void setLeftGold(Integer leftGold) {
        this.leftGold = leftGold;
    }

    public Integer getLeftSpecialGold() {
        return leftSpecialGold;
    }

    public void setLeftSpecialGold(Integer leftSpecialGold) {
        this.leftSpecialGold = leftSpecialGold;
    }

    public Integer getUsedSpecialGold() {
        return usedSpecialGold;
    }

    public void setUsedSpecialGold(Integer usedSpecialGold) {
        this.usedSpecialGold = usedSpecialGold;
    }

    public Long getLeftCoin() {
        return leftCoin;
    }

    public void setLeftCoin(Long leftCoin) {
        this.leftCoin = leftCoin;
    }

    public Long getUsedCoin() {
        return usedCoin;
    }

    public void setUsedCoin(Long usedCoin) {
        this.usedCoin = usedCoin;
    }
}