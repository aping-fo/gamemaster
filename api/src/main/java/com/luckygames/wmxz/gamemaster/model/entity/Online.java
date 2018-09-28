package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.OnlineEntity;

public class Online extends OnlineEntity {
    private String serverName1;

    public String getServerName1() {
        return serverName1;
    }

    public void setServerName1(String serverName1) {
        this.serverName1 = serverName1;
    }
}
