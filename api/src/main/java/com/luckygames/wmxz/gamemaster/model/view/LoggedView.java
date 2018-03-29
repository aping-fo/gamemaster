package com.luckygames.wmxz.gamemaster.model.view;

import com.luckygames.wmxz.gamemaster.model.entity.User;

import java.io.Serializable;

public class LoggedView implements Serializable {
    private String token;
    private User userInfo;

    public LoggedView() {
    }

    public LoggedView(String token, User userInfo) {
        this.token = token;
        this.userInfo = userInfo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }
}
