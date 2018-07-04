package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import com.luckygames.wmxz.gamemaster.model.enums.BroadcastStatus;
import com.luckygames.wmxz.gamemaster.model.enums.BroadcastType;
import java.util.Date;
import javax.persistence.Table;

@Table(name="broadcast")
public class BroadcastEntity extends BaseEntity {
    private Long channelId;

    private Long serverId;

    private BroadcastType broadcastType;

    private Integer loopTimes;

    private Integer gapSecond;

    private Date playTime;

    private String title;

    private String content;

    private BroadcastStatus broadcastStatus;

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

    public BroadcastType getBroadcastType() {
        return broadcastType;
    }

    public void setBroadcastType(BroadcastType broadcastType) {
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

    public BroadcastStatus getBroadcastStatus() {
        return broadcastStatus;
    }

    public void setBroadcastStatus(BroadcastStatus broadcastStatus) {
        this.broadcastStatus = broadcastStatus;
    }
}