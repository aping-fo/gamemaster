package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.MailType;

import java.util.List;

public class SendMailRequest {
    private MailType mailType;
    private Long serverId;
    private List<String> charNames;
    private Integer minLevel;
    private Integer maxLevel;
    private String sender;
    private String title;
    private String content;
    private List<String> rewardNames;
    private String attachments;
    private String extraParam;

    public String getExtraParam() {
        return extraParam;
    }

    public void setExtraParam(String extraParam) {
        this.extraParam = extraParam;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public MailType getMailType() {
        return mailType;
    }

    public void setMailType(MailType mailType) {
        this.mailType = mailType;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public List<String> getCharNames() {
        return charNames;
    }

    public void setCharNames(List<String> charNames) {
        this.charNames = charNames;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
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

    public List<String> getRewardNames() {
        return rewardNames;
    }

    public void setRewardNames(List<String> rewardNames) {
        this.rewardNames = rewardNames;
    }
}
