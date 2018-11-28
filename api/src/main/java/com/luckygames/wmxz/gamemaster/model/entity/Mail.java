package com.luckygames.wmxz.gamemaster.model.entity;


import com.luckygames.wmxz.gamemaster.dao.MailEntity;

public class Mail extends MailEntity {
    private String serverName;
    private String reason;
    private String goodsName;
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
