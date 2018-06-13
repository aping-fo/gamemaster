package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="pay_ltv")
public class PayLTVEntity extends BaseEntity {
    private Long channelId;

    private Long serverId;

    private String reportDate;

    private Integer charCount;

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

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public Integer getCharCount() {
        return charCount;
    }

    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }
}