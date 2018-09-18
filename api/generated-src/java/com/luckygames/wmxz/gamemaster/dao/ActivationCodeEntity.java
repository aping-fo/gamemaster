package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="activation_code")
public class ActivationCodeEntity extends BaseEntity {
    private Long serverId;

    private String invalidTime;

    private String overdueTime;

    private Integer remarks;

    private Integer universal;

    private String useTime;

    private Integer usePlayerId;

    private String usePlayerName;

    private String usePlayerAccount;

    private String useServerId;

    private String name;

    private String rewards;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime == null ? null : invalidTime.trim();
    }

    public String getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime == null ? null : overdueTime.trim();
    }

    public Integer getRemarks() {
        return remarks;
    }

    public void setRemarks(Integer remarks) {
        this.remarks = remarks;
    }

    public Integer getUniversal() {
        return universal;
    }

    public void setUniversal(Integer universal) {
        this.universal = universal;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime == null ? null : useTime.trim();
    }

    public Integer getUsePlayerId() {
        return usePlayerId;
    }

    public void setUsePlayerId(Integer usePlayerId) {
        this.usePlayerId = usePlayerId;
    }

    public String getUsePlayerName() {
        return usePlayerName;
    }

    public void setUsePlayerName(String usePlayerName) {
        this.usePlayerName = usePlayerName == null ? null : usePlayerName.trim();
    }

    public String getUsePlayerAccount() {
        return usePlayerAccount;
    }

    public void setUsePlayerAccount(String usePlayerAccount) {
        this.usePlayerAccount = usePlayerAccount == null ? null : usePlayerAccount.trim();
    }

    public String getUseServerId() {
        return useServerId;
    }

    public void setUseServerId(String useServerId) {
        this.useServerId = useServerId == null ? null : useServerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards == null ? null : rewards.trim();
    }
}