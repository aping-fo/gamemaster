package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="chat_settings")
public class ChatSettingsEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer chatChannel;

    private Integer chatLevel;

    private Integer chatVip;

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

    public Integer getChatChannel() {
        return chatChannel;
    }

    public void setChatChannel(Integer chatChannel) {
        this.chatChannel = chatChannel;
    }

    public Integer getChatLevel() {
        return chatLevel;
    }

    public void setChatLevel(Integer chatLevel) {
        this.chatLevel = chatLevel;
    }

    public Integer getChatVip() {
        return chatVip;
    }

    public void setChatVip(Integer chatVip) {
        this.chatVip = chatVip;
    }
}