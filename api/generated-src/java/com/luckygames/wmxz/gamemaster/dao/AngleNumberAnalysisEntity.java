package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="angle_number_analysis")
public class AngleNumberAnalysisEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer totalCreationAngle;

    private Integer nonRepeat;

    private BigDecimal nonRepeatRate;

    private Integer repeat;

    private BigDecimal repeatRate;

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

    public Integer getTotalCreationAngle() {
        return totalCreationAngle;
    }

    public void setTotalCreationAngle(Integer totalCreationAngle) {
        this.totalCreationAngle = totalCreationAngle;
    }

    public Integer getNonRepeat() {
        return nonRepeat;
    }

    public void setNonRepeat(Integer nonRepeat) {
        this.nonRepeat = nonRepeat;
    }

    public BigDecimal getNonRepeatRate() {
        return nonRepeatRate;
    }

    public void setNonRepeatRate(BigDecimal nonRepeatRate) {
        this.nonRepeatRate = nonRepeatRate;
    }

    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    public BigDecimal getRepeatRate() {
        return repeatRate;
    }

    public void setRepeatRate(BigDecimal repeatRate) {
        this.repeatRate = repeatRate;
    }
}