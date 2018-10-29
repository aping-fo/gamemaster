package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.NewUserEntity;

public class NewUser extends NewUserEntity {
    private String serverName;
    private int charge;
    private int newPlayerCount;
    private double arpu;

    public int getNewPlayerCount() {
        return newPlayerCount;
    }

    public void setNewPlayerCount(int newPlayerCount) {
        this.newPlayerCount = newPlayerCount;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
