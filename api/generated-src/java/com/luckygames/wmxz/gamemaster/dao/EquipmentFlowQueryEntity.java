package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="equipment_flowQuery")
public class EquipmentFlowQueryEntity extends BaseEntity {
    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    private Integer type;

    private String name;

    private Integer count;

    private Integer strengtheningGrade;

    private BigDecimal strengtheningDegreeCompletion;

    private Integer luckyValue;

    private String set;

    private String clear;

    private String ultimateAttribute;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStrengtheningGrade() {
        return strengtheningGrade;
    }

    public void setStrengtheningGrade(Integer strengtheningGrade) {
        this.strengtheningGrade = strengtheningGrade;
    }

    public BigDecimal getStrengtheningDegreeCompletion() {
        return strengtheningDegreeCompletion;
    }

    public void setStrengtheningDegreeCompletion(BigDecimal strengtheningDegreeCompletion) {
        this.strengtheningDegreeCompletion = strengtheningDegreeCompletion;
    }

    public Integer getLuckyValue() {
        return luckyValue;
    }

    public void setLuckyValue(Integer luckyValue) {
        this.luckyValue = luckyValue;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set == null ? null : set.trim();
    }

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear == null ? null : clear.trim();
    }

    public String getUltimateAttribute() {
        return ultimateAttribute;
    }

    public void setUltimateAttribute(String ultimateAttribute) {
        this.ultimateAttribute = ultimateAttribute == null ? null : ultimateAttribute.trim();
    }
}