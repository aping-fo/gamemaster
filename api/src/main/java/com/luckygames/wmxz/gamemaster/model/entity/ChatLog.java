package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.ChatLogEntity;

public class ChatLog extends ChatLogEntity {
    private String serverName;
    private String charName;
    private String toCharName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getToCharName() {
        return toCharName;
    }

    public void setToCharName(String toCharName) {
        this.toCharName = toCharName;
    }
}