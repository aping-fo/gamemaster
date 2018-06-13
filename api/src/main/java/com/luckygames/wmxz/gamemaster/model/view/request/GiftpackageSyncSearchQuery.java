package com.luckygames.wmxz.gamemaster.model.view.request;

public class GiftpackageSyncSearchQuery extends CommonSearchQuery {
    private String name;
    private Integer count;
    private String minTermValidity;
    private String maxTermValidity;
    private Integer type;
    private Long channelId;
    private Long serverId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMinTermValidity() {
        return minTermValidity;
    }

    public void setMinTermValidity(String minTermValidity) {
        this.minTermValidity = minTermValidity;
    }

    public String getMaxTermValidity() {
        return maxTermValidity;
    }

    public void setMaxTermValidity(String maxTermValidity) {
        this.maxTermValidity = maxTermValidity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

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
}
