package com.luckygames.wmxz.gamemaster.model.view;

import java.io.Serializable;

public class LoggedView implements Serializable {
    private String token;
    private UserView userInfo;

    public LoggedView() {
    }

    public LoggedView(String token, UserView userInfo) {
        this.token = token;
        this.userInfo = userInfo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserView getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserView userInfo) {
        this.userInfo = userInfo;
    }
}
