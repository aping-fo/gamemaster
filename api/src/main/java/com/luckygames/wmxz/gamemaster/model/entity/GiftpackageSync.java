package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;

import java.util.Date;

public class GiftpackageSync extends GiftpackageSyncEntity {
    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
