package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.utils.BeanUtils;

public class PackageSearchQuery extends CommonSearchQuery {
    private Long PackageId;

    public Long getPackageId() {
        return PackageId;
    }

    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    public PackageSearchQuery() {
    }

    public PackageSearchQuery(KeywordSearchQuery request) {
        BeanUtils.copyProperties(request, this);
    }
}
