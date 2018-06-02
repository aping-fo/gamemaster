package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenType;

public class ForbiddenSearchQuery extends CommonSearchQuery {
    private ForbiddenType forbiddenType;
    private String username;
    private String charName;
    private String ipAddress;

    public ForbiddenType getForbiddenType() {
        return forbiddenType;
    }

    public void setForbiddenType(ForbiddenType forbiddenType) {
        this.forbiddenType = forbiddenType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
