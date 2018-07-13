package com.luckygames.wmxz.gamemaster.model.view.request;

public class LoginFlowSearchQuery extends CommonSearchQuery {
    private String type;
    private String name;
    private Long charId;

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
