package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="mail_log")
public class MailLogEntity extends BaseEntity {
    private Long serverId;

    private Integer mailType;

    private String title;

    private String content;

    private Integer vocation;

    private Integer minLev;

    private Integer maxLev;

    private String sender;

    private String rewards;

    private String playerids;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Integer getMailType() {
        return mailType;
    }

    public void setMailType(Integer mailType) {
        this.mailType = mailType;
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

    public Integer getVocation() {
        return vocation;
    }

    public void setVocation(Integer vocation) {
        this.vocation = vocation;
    }

    public Integer getMinLev() {
        return minLev;
    }

    public void setMinLev(Integer minLev) {
        this.minLev = minLev;
    }

    public Integer getMaxLev() {
        return maxLev;
    }

    public void setMaxLev(Integer maxLev) {
        this.maxLev = maxLev;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards == null ? null : rewards.trim();
    }

    public String getPlayerids() {
        return playerids;
    }

    public void setPlayerids(String playerids) {
        this.playerids = playerids == null ? null : playerids.trim();
    }
}