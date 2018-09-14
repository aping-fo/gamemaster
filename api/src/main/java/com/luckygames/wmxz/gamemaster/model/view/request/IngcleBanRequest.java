package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.MailType;

import java.util.List;

public class IngcleBanRequest {
    private String gameId;
    private String closureType;
    private String closureWay;
    private String closureAccount;
    private String closureRemark;
    private String serverId;
    private String closureTime;
    private String timestamp;
    private String sign;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getClosureType() {
        return closureType;
    }

    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    public String getClosureWay() {
        return closureWay;
    }

    public void setClosureWay(String closureWay) {
        this.closureWay = closureWay;
    }

    public String getClosureAccount() {
        return closureAccount;
    }

    public void setClosureAccount(String closureAccount) {
        this.closureAccount = closureAccount;
    }

    public String getClosureRemark() {
        return closureRemark;
    }

    public void setClosureRemark(String closureRemark) {
        this.closureRemark = closureRemark;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getClosureTime() {
        return closureTime;
    }

    public void setClosureTime(String closureTime) {
        this.closureTime = closureTime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
