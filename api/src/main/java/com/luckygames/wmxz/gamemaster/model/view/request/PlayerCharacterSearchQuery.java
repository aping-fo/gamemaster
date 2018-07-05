package com.luckygames.wmxz.gamemaster.model.view.request;

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
