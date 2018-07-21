package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import com.luckygames.wmxz.gamemaster.model.enums.ActionType;

import java.util.Date;
import javax.persistence.Table;

@Table(name = "player_action_log")
public class PlayerActionLogEntity extends BaseEntity {
    private String deviceId;

    private Long action;

    private Integer actionValue;

    private Date actionDate;

    private Long channelId;

    private Long serverId;

    private Long playerId;

    private Long charId;

    private Long onlineTime;

    private Integer level;

    private Long lossNumber;//流失人数
    private Double lossRate;//流失率

    private Long produceValue;//产生值
    private Long produceNumber;//产生人数
    private Double avgProduce;//人均产生
    private Long consumeValue;//消耗值
    private Long consumeNumber;//消耗人数
    private Double avgConsume;//人均消耗
    private Double retentionRate;//滞留率

    public Long getProduceValue() {
        return produceValue;
    }

    public void setProduceValue(Long produceValue) {
        this.produceValue = produceValue;
    }

    public Long getProduceNumber() {
        return produceNumber;
    }

    public void setProduceNumber(Long produceNumber) {
        this.produceNumber = produceNumber;
    }

    public Double getAvgProduce() {
        return avgProduce;
    }

    public void setAvgProduce(Double avgProduce) {
        this.avgProduce = avgProduce;
    }

    public Long getConsumeValue() {
        return consumeValue;
    }

    public void setConsumeValue(Long consumeValue) {
        this.consumeValue = consumeValue;
    }

    public Long getConsumeNumber() {
        return consumeNumber;
    }

    public void setConsumeNumber(Long consumeNumber) {
        this.consumeNumber = consumeNumber;
    }

    public Double getAvgConsume() {
        return avgConsume;
    }

    public void setAvgConsume(Double avgConsume) {
        this.avgConsume = avgConsume;
    }

    public Double getRetentionRate() {
        return retentionRate;
    }

    public void setRetentionRate(Double retentionRate) {
        this.retentionRate = retentionRate;
    }

    public Long getLossNumber() {
        return lossNumber;
    }

    public void setLossNumber(Long lossNumber) {
        this.lossNumber = lossNumber;
    }

    public Double getLossRate() {
        return lossRate;
    }

    public void setLossRate(Double lossRate) {
        this.lossRate = lossRate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Long getAction() {
        return action;
    }

    public void setAction(Long action) {
        this.action = action;
    }

    public Integer getActionValue() {
        return actionValue;
    }

    public void setActionValue(Integer actionValue) {
        this.actionValue = actionValue;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
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

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }

    public Long getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Long onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}