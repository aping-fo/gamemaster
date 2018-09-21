package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;

public class ActivationCode extends ActivationCodeEntity {
    private Integer number;
    private String serverName;
    private String useServerName;

    public String getUseServerName() {
        return useServerName;
    }

    public void setUseServerName(String useServerName) {
        this.useServerName = useServerName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
