package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntity;

public class PlayerOrder extends PlayerOrderEntity {
    private String username;
    private String charName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getCharName() {
        return charName;
    }

    @Override
    public void setCharName(String charName) {
        this.charName = charName;
    }
}
