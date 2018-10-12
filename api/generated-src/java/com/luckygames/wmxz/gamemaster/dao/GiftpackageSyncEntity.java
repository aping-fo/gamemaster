package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="giftpackage_sync")
public class GiftpackageSyncEntity extends BaseNewEntity {
    private String minTermValidity;

    private String maxTermValidity;

    private String cardType;

    private Integer cardCount;

    private Date generateTime;

    private Long serverId;

    public String getMinTermValidity() {
        return minTermValidity;
    }

    public void setMinTermValidity(String minTermValidity) {
        this.minTermValidity = minTermValidity == null ? null : minTermValidity.trim();
    }

    public String getMaxTermValidity() {
        return maxTermValidity;
    }

    public void setMaxTermValidity(String maxTermValidity) {
        this.maxTermValidity = maxTermValidity == null ? null : maxTermValidity.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public Integer getCardCount() {
        return cardCount;
    }

    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }
}