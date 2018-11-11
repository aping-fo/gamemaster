package com.luckygames.wmxz.gamemaster.model.view.request;

public class MailLogSearchQuery extends CommonSearchQuery {
    private Integer mailType;
    private Integer serverId;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public Integer getMailType() {
        return mailType;
    }

    public void setMailType(Integer mailType) {
        this.mailType = mailType;
    }
}
