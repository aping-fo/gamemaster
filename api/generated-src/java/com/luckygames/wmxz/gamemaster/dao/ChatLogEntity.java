package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="chat_log")
public class ChatLogEntity extends BaseEntity {
    private Long serverId;

    private Long charId;

    private Integer chatChannel;

    private Long toCharId;

    private String content;

    private Date chatTime;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }

    public Integer getChatChannel() {
        return chatChannel;
    }

    public void setChatChannel(Integer chatChannel) {
        this.chatChannel = chatChannel;
    }

    public Long getToCharId() {
        return toCharId;
    }

    public void setToCharId(Long toCharId) {
        this.toCharId = toCharId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getChatTime() {
        return chatTime;
    }

    public void setChatTime(Date chatTime) {
        this.chatTime = chatTime;
    }
}