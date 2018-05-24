package com.luckygames.wmxz.gamemaster.model.view.request;

public class PlayerCharacterSearchQuery extends CommonSearchQuery {
    private Long charId;

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }
}
