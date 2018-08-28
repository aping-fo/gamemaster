package com.luckygames.wmxz.gamemaster.model.view.request;

public class PayRetentionRateSearchQuery extends CommonSearchQuery {
    private Integer packageId;
    private Long ChannelId;

    public Long getChannelId() {
        return ChannelId;
    }

    public void setChannelId(Long channelId) {
        ChannelId = channelId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }
}
