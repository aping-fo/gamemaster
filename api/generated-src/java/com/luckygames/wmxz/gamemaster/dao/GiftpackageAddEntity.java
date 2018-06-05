package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import javax.persistence.Table;

@Table(name="giftpackage_add")
public class GiftpackageAddEntity extends BaseEntity {
    private String name;

    private String des;

    private Integer isbinding;

    private String goods0Name;

    private Integer goods0Count;

    private String goods1Name;

    private Integer goods1Count;

    private String goods2Name;

    private Integer goods2Count;

    private String goods3Name;

    private Integer goods3Count;

    private String goods4Name;

    private Integer goods4Count;

    private Long serverId;

    private String serverName;

    private Long channelId;

    private String channelName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Integer getIsbinding() {
        return isbinding;
    }

    public void setIsbinding(Integer isbinding) {
        this.isbinding = isbinding;
    }

    public String getGoods0Name() {
        return goods0Name;
    }

    public void setGoods0Name(String goods0Name) {
        this.goods0Name = goods0Name == null ? null : goods0Name.trim();
    }

    public Integer getGoods0Count() {
        return goods0Count;
    }

    public void setGoods0Count(Integer goods0Count) {
        this.goods0Count = goods0Count;
    }

    public String getGoods1Name() {
        return goods1Name;
    }

    public void setGoods1Name(String goods1Name) {
        this.goods1Name = goods1Name == null ? null : goods1Name.trim();
    }

    public Integer getGoods1Count() {
        return goods1Count;
    }

    public void setGoods1Count(Integer goods1Count) {
        this.goods1Count = goods1Count;
    }

    public String getGoods2Name() {
        return goods2Name;
    }

    public void setGoods2Name(String goods2Name) {
        this.goods2Name = goods2Name == null ? null : goods2Name.trim();
    }

    public Integer getGoods2Count() {
        return goods2Count;
    }

    public void setGoods2Count(Integer goods2Count) {
        this.goods2Count = goods2Count;
    }

    public String getGoods3Name() {
        return goods3Name;
    }

    public void setGoods3Name(String goods3Name) {
        this.goods3Name = goods3Name == null ? null : goods3Name.trim();
    }

    public Integer getGoods3Count() {
        return goods3Count;
    }

    public void setGoods3Count(Integer goods3Count) {
        this.goods3Count = goods3Count;
    }

    public String getGoods4Name() {
        return goods4Name;
    }

    public void setGoods4Name(String goods4Name) {
        this.goods4Name = goods4Name == null ? null : goods4Name.trim();
    }

    public Integer getGoods4Count() {
        return goods4Count;
    }

    public void setGoods4Count(Integer goods4Count) {
        this.goods4Count = goods4Count;
    }

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
}