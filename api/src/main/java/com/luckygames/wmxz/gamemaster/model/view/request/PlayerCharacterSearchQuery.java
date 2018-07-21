package com.luckygames.wmxz.gamemaster.model.view.request;

import java.util.Date;

public class PlayerCharacterSearchQuery extends CommonSearchQuery {
    private Integer searchKey;
    private String keyword;
    private String sex;
    private Integer levelStart;
    private Integer levelEnd;
    private Integer goldStart;
    private Integer goldEnd;
    private String job;
    private Integer charId;
    private String loginTime;
    private Integer loginDay;//登录天数
    private Long platform;//平台

    public Long getPlatform() {
        return platform;
    }

    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    public Integer getLoginDay() {
        return loginDay;
    }

    public void setLoginDay(Integer loginDay) {
        this.loginDay = loginDay;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getCharId() {
        return charId;
    }

    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getLevelStart() {
        return levelStart;
    }

    public void setLevelStart(Integer levelStart) {
        this.levelStart = levelStart;
    }

    public Integer getLevelEnd() {
        return levelEnd;
    }

    public void setLevelEnd(Integer levelEnd) {
        this.levelEnd = levelEnd;
    }

    public Integer getGoldStart() {
        return goldStart;
    }

    public void setGoldStart(Integer goldStart) {
        this.goldStart = goldStart;
    }

    public Integer getGoldEnd() {
        return goldEnd;
    }

    public void setGoldEnd(Integer goldEnd) {
        this.goldEnd = goldEnd;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(Integer searchKey) {
        this.searchKey = searchKey;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
