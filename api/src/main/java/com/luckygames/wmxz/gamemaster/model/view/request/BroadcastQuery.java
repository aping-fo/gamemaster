package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

import java.util.Date;

public class BroadcastQuery extends GMQuery {
    private int loopTimes;
    private int gapSecond;
    private Date playTime;
    private String title;
    private String content;

    public BroadcastQuery(Long serverId, int loopTimes, int gapSecond, Date playTime, String title, String content) {
        super(serverId);
        this.loopTimes = loopTimes;
        this.gapSecond = gapSecond;
        this.playTime = playTime;
        this.title = title;
        this.content = content;
    }

    public int getLoopTimes() {
        return loopTimes;
    }

    public void setLoopTimes(int loopTimes) {
        this.loopTimes = loopTimes;
    }

    public int getGapSecond() {
        return gapSecond;
    }

    public void setGapSecond(int gapSecond) {
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
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
