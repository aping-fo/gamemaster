package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;


/**
 * Created by lucky on 2018/3/29.
 * 激活码
 */
public class PlayerQuery extends GMQuery {
    private Long playerId;

    public PlayerQuery(Long serverId, Long playerId) {
        super(serverId);
        this.playerId = playerId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}
