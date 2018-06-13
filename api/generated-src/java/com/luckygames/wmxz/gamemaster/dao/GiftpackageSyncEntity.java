package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="giftpackage_sync")
public class GiftpackageSyncEntity extends BaseEntity {
    private String cardFile;

    private Integer activityId;

    private Date minTermValidity;

    private Date maxTermValidity;

    private Integer isExclusiveGiftbag;

    private String cardType;

    private Integer cardCount;

    private Integer isActivation;

    private Date generateTime;

    private String generateType;

    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    public String getCardFile() {
        return cardFile;
    }

    public void setCardFile(String cardFile) {
        this.cardFile = cardFile == null ? null : cardFile.trim();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getMinTermValidity() {
        return minTermValidity;
    }

    public void setMinTermValidity(Date minTermValidity) {
        this.minTermValidity = minTermValidity;
    }

    public Date getMaxTermValidity() {
        return maxTermValidity;
    }

    public void setMaxTermValidity(Date maxTermValidity) {
        this.maxTermValidity = maxTermValidity;
    }

    public Integer getIsExclusiveGiftbag() {
        return isExclusiveGiftbag;
    }

    public void setIsExclusiveGiftbag(Integer isExclusiveGiftbag) {
        this.isExclusiveGiftbag = isExclusiveGiftbag;
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

    public Integer getIsActivation() {
        return isActivation;
    }

    public void setIsActivation(Integer isActivation) {
        this.isActivation = isActivation;
    }

    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public String getGenerateType() {
        return generateType;
    }

    public void setGenerateType(String generateType) {
        this.generateType = generateType == null ? null : generateType.trim();
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }
}