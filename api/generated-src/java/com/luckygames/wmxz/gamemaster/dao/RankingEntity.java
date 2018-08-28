package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="ranking")
public class RankingEntity extends BaseEntity {
    private Integer playerId;

    private Integer type;

    private Integer sortValue;

    private Integer contrastValue;

    private String extraValue;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSortValue() {
        return sortValue;
    }

    public void setSortValue(Integer sortValue) {
        this.sortValue = sortValue;
    }

    public Integer getContrastValue() {
        return contrastValue;
    }

    public void setContrastValue(Integer contrastValue) {
        this.contrastValue = contrastValue;
    }

    public String getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(String extraValue) {
        this.extraValue = extraValue == null ? null : extraValue.trim();
    }
}