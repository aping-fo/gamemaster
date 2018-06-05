package com.luckygames.wmxz.gamemaster.model.view.request;

public class NewUserSearchQuery extends CommonSearchQuery {
    private Integer recentTime;

    public Integer getRecentTime() {
        return recentTime;
    }

    public void setRecentTime(Integer recentTime) {
        this.recentTime = recentTime;
    }
}
