package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.BroadcastType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class SendBroadcastRequest {
    private BroadcastType broadcastType;
    private List<Long> serverIds;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date playTime;
    private Integer loopTimes;
    private Integer gameSeconds;
    private String content;

    private String title;

    public BroadcastType getBroadcastType() {
        return broadcastType;
    }

    public void setBroadcastType(BroadcastType broadcastType) {
        this.broadcastType = broadcastType;
    }

    public List<Long> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<Long> serverIds) {
        this.serverIds = serverIds;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public Integer getLoopTimes() {
        return loopTimes;
    }

    public void setLoopTimes(Integer loopTimes) {
        this.loopTimes = loopTimes;
    }

    public Integer getGameSeconds() {
        return gameSeconds;
    }

    public void setGameSeconds(Integer gameSeconds) {
        this.gameSeconds = gameSeconds;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
