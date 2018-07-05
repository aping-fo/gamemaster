package com.luckygames.wmxz.gamemaster.model.view.request;

public class NewUserSearchQuery extends CommonSearchQuery {
    private Integer recentTime;
    private Integer packageId;

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getRecentTime() {
        return recentTime;
    }

    public void setRecentTime(Integer recentTime) {
        this.recentTime = recentTime;
    }
}
