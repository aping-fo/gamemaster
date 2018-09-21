package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;


/**
 * Created by lucky on 2018/3/29.
 * 激活码
 */
public class RecoveryGoodsQuery extends GMQuery {
    private String goods;
    private Long playerId;

    public RecoveryGoodsQuery(Long serverId, String goods, Long playerId) {
        super(serverId);
        this.goods = goods;
        this.playerId = playerId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }
}
