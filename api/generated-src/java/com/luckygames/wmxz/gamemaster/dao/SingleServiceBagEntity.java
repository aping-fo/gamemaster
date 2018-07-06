package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="single_service_bag")
public class SingleServiceBagEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer numberBackgroundActivationCodes;

    private Integer numberSingleServiceActivationCodes;

    private String differentialBatch;

    private Integer singleServiceStatus;

    private String singleServiceName;

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

    public Integer getNumberBackgroundActivationCodes() {
        return numberBackgroundActivationCodes;
    }

    public void setNumberBackgroundActivationCodes(Integer numberBackgroundActivationCodes) {
        this.numberBackgroundActivationCodes = numberBackgroundActivationCodes;
    }

    public Integer getNumberSingleServiceActivationCodes() {
        return numberSingleServiceActivationCodes;
    }

    public void setNumberSingleServiceActivationCodes(Integer numberSingleServiceActivationCodes) {
        this.numberSingleServiceActivationCodes = numberSingleServiceActivationCodes;
    }

    public String getDifferentialBatch() {
        return differentialBatch;
    }

    public void setDifferentialBatch(String differentialBatch) {
        this.differentialBatch = differentialBatch == null ? null : differentialBatch.trim();
    }

    public Integer getSingleServiceStatus() {
        return singleServiceStatus;
    }

    public void setSingleServiceStatus(Integer singleServiceStatus) {
        this.singleServiceStatus = singleServiceStatus;
    }

    public String getSingleServiceName() {
        return singleServiceName;
    }

    public void setSingleServiceName(String singleServiceName) {
        this.singleServiceName = singleServiceName == null ? null : singleServiceName.trim();
    }
}