package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;

import java.util.Date;

public class GiftpackageSync extends GiftpackageSyncEntity {
    private String cardFile;

    private Integer activityId;

    private Date minTermValidity;

    private Date maxTermValidity;

    private String channelName;

    private String serverName;

    private String isExclusiveGiftbag2;

    private String cardType;

    private Integer cardCount;

    private String isActivation2;

    private Date generateTime;

    private String generateType2;

    @Override
    public String getCardFile() {
        return cardFile;
    }

    @Override
    public void setCardFile(String cardFile) {
        this.cardFile = cardFile;
    }

    @Override
    public Integer getActivityId() {
        return activityId;
    }

    @Override
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    @Override
    public Date getMinTermValidity() {
        return minTermValidity;
    }

    @Override
    public void setMinTermValidity(Date minTermValidity) {
        this.minTermValidity = minTermValidity;
    }

    @Override
    public Date getMaxTermValidity() {
        return maxTermValidity;
    }

    @Override
    public void setMaxTermValidity(Date maxTermValidity) {
        this.maxTermValidity = maxTermValidity;
    }

    @Override
    public String getChannelName() {
        return channelName;
    }

    @Override
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public String getServerName() {
        return serverName;
    }

    @Override
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getIsExclusiveGiftbag2() {
        return isExclusiveGiftbag2;
    }

    public void setIsExclusiveGiftbag2(String isExclusiveGiftbag2) {
        this.isExclusiveGiftbag2 = isExclusiveGiftbag2;
    }

    @Override
    public String getCardType() {
        return cardType;
    }

    @Override
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public Integer getCardCount() {
        return cardCount;
    }

    @Override
    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    public String getIsActivation2() {
        return isActivation2;
    }

    public void setIsActivation2(String isActivation2) {
        this.isActivation2 = isActivation2;
    }

    @Override
    public Date getGenerateTime() {
        return generateTime;
    }

    @Override
    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public String getGenerateType2() {
        return generateType2;
    }

    public void setGenerateType2(String generateType2) {
        this.generateType2 = generateType2;
    }
}
