package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;


/**
 * Created by lucky on 2018/3/29.
 * 激活码
 */
public class ActivationCodeQuery extends GMQuery {
    private String name;

    public ActivationCodeQuery(Long serverId,  String name) {
        super(serverId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
