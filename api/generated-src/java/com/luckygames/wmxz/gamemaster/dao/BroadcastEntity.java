package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="broadcast")
public class BroadcastEntity extends BaseNewEntity {
    private Long channelId;

    private Long serverId;

    private Integer broadcastType;

    private Integer loopTimes;

    private Integer gapSecond;

    private Date playTime;

    private String title;

    private String content;

    private Integer broadcastStatus;

    private String reason;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Integer getBroadcastType() {
        return broadcastType;
    }

    public void setBroadcastType(Integer broadcastType) {
        this.broadcastType = broadcastType;
    }

    public Integer getLoopTimes() {
        return loopTimes;
    }

    public void setLoopTimes(Integer loopTimes) {
        this.loopTimes = loopTimes;
    }

    public Integer getGapSecond() {
        return gapSecond;
    }

    public void setGapSecond(Integer gapSecond) {
        this.gapSecond = gapSecond;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getBroadcastStatus() {
        return broadcastStatus;
    }

    public void setBroadcastStatus(Integer broadcastStatus) {
        this.broadcastStatus = broadcastStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}