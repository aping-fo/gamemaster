package com.luckygames.wmxz.gamemaster.model.view.request;

public class ActivitySearchQuery extends CommonSearchQuery {
    private Integer activityStatus;
    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }
}
