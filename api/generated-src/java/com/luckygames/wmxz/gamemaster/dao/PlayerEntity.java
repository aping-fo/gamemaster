package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="player")
public class PlayerEntity extends BaseEntity {
    private Long playerId;

    private Long channelId;

    private String channelName;

    private String username;

    private String mobile;

    private String idCard;

    private String createIp;

    private String createDevice;

    private String createVersion;

    private String createMac;

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public String getCreateDevice() {
        return createDevice;
    }

    public void setCreateDevice(String createDevice) {
        this.createDevice = createDevice == null ? null : createDevice.trim();
    }

    public String getCreateVersion() {
        return createVersion;
    }

    public void setCreateVersion(String createVersion) {
        this.createVersion = createVersion == null ? null : createVersion.trim();
    }

    public String getCreateMac() {
        return createMac;
    }

    public void setCreateMac(String createMac) {
        this.createMac = createMac == null ? null : createMac.trim();
    }
}