package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import javax.persistence.Table;

@Table(name="account_log")
public class AccountLogEntity extends BaseNewEntity {
    private Long serverId;

    private String accountName;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }
}