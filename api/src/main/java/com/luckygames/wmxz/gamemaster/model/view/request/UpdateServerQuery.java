package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

public class UpdateServerQuery extends GMQuery {
    private String packName;

    public UpdateServerQuery(Long serverId, String packName) {
        super(serverId);
        this.packName = packName;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }
}
