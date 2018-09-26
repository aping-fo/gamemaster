package com.luckygames.wmxz.gamemaster.model.view.request;

public class ForbiddenSearchQuery extends CommonSearchQuery {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
