package com.luckygames.wmxz.gamemaster.model.view.request;

public class EquipmentFlowSearchQuery extends CommonSearchQuery {
    private String type;
    private String name;
    private Integer charId;

    private Integer searchKey;
    private String keyword;
    private String sex;
    private Integer levelStart;
    private Integer levelEnd;
    private Integer goldStart;
    private Integer goldEnd;
    private String job;

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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(Integer searchKey) {
        this.searchKey = searchKey;
    }

    public Integer getCharId() {
        return charId;
    }

    public void setCharId(Integer charId) {
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
