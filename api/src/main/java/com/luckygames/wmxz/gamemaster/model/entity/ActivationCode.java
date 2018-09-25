package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;

import java.util.Date;

public class ActivationCode extends ActivationCodeEntity {
    private String name;
    private String remarks;
    private String rewards;
    private String universal2;
    private String invalidTime;
    private String overdueTime;
    private String serverName;
    private Date createTime;
    private Date useTime;
    private Integer usePlayerId;
    private String usePlayerName;
    private String usePlayerAccount;
    private String useServerName;
    private Integer number;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getRemarks() {
        return remarks;
    }

    @Override
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String getRewards() {
        return rewards;
    }

    @Override
    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

    public String getUniversal2() {
        return universal2;
    }

    public void setUniversal2(String universal2) {
        this.universal2 = universal2;
    }

    @Override
    public String getInvalidTime() {
        return invalidTime;
    }

    @Override
    public void setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
    }

    @Override
    public String getOverdueTime() {
        return overdueTime;
    }

    @Override
    public void setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getUseTime() {
        return useTime;
    }

    @Override
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    @Override
    public Integer getUsePlayerId() {
        return usePlayerId;
    }

    @Override
    public void setUsePlayerId(Integer usePlayerId) {
        this.usePlayerId = usePlayerId;
    }

    @Override
    public String getUsePlayerName() {
        return usePlayerName;
    }

    @Override
    public void setUsePlayerName(String usePlayerName) {
        this.usePlayerName = usePlayerName;
    }

    @Override
    public String getUsePlayerAccount() {
        return usePlayerAccount;
    }

    @Override
    public void setUsePlayerAccount(String usePlayerAccount) {
        this.usePlayerAccount = usePlayerAccount;
    }

    public String getUseServerName() {
        return useServerName;
    }

    public void setUseServerName(String useServerName) {
        this.useServerName = useServerName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
