package com.luckygames.wmxz.gamemaster.model.entity;


import com.luckygames.wmxz.gamemaster.dao.AccountLogEntity;

public class AccountLog extends AccountLogEntity {
    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
