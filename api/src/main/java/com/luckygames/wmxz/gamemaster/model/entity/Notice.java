package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.NoticeEntity;

public class Notice extends NoticeEntity {
    private String type;//操作类型
    private String serverName;//服务器名称
    private String startDate;
    private String endDate;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}