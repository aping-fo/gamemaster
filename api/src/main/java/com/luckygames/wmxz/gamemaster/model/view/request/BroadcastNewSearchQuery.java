package com.luckygames.wmxz.gamemaster.model.view.request;

public class BroadcastNewSearchQuery extends CommonSearchQuery {
    private Long id;
    private Long notifyType;

    public Long getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Long notifyType) {
        this.notifyType = notifyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
