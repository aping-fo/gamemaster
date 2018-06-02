package com.luckygames.wmxz.gamemaster.model.view.request;

public class PlayerOrderSearchQuery extends CommonSearchQuery {
    private String orderCode;
    private String player;
    private String character;
    private Integer goldFrom;
    private Integer goldTo;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Integer getGoldFrom() {
        return goldFrom;
    }

    public void setGoldFrom(Integer goldFrom) {
        this.goldFrom = goldFrom;
    }

    public Integer getGoldTo() {
        return goldTo;
    }

    public void setGoldTo(Integer goldTo) {
        this.goldTo = goldTo;
    }
}
