package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="money_flowquery")
public class MoneyFlowQueryEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer type;

    private Integer moneyType;

    private Integer changeMoney;

    private Integer changeBindGold;

    private Integer leftGold;

    private Integer leftBindGold;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(Integer moneyType) {
        this.moneyType = moneyType;
    }

    public Integer getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(Integer changeMoney) {
        this.changeMoney = changeMoney;
    }

    public Integer getChangeBindGold() {
        return changeBindGold;
    }

    public void setChangeBindGold(Integer changeBindGold) {
        this.changeBindGold = changeBindGold;
    }

    public Integer getLeftGold() {
        return leftGold;
    }

    public void setLeftGold(Integer leftGold) {
        this.leftGold = leftGold;
    }

    public Integer getLeftBindGold() {
        return leftBindGold;
    }

    public void setLeftBindGold(Integer leftBindGold) {
        this.leftBindGold = leftBindGold;
    }
}