package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.PageQuery;

import java.util.List;

public class PlayerOrderSearchQuery extends PageQuery {
    private List<Long> serverId;
    private List<Long> channelId;
    private String startDate;
    private String endDate;
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

    public List<Long> getServerId() {
        return serverId;
    }

    public void setServerId(List<Long> serverId) {
        this.serverId = serverId;
    }

    public List<Long> getChannelId() {
        return channelId;
    }

    public void setChannelId(List<Long> channelId) {
        this.channelId = channelId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
