package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;


/**
 * Created by lucky on 2018/3/29.
 * 充值
 */
public class PayQuery extends GMQuery {
    private Long userid;
    private Long charge;
    private Long type;

    public PayQuery(Long serverId, Long userid, Long charge, Long type) {
        super(serverId);
        this.userid = userid;
        this.charge = charge;
        this.type = type;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getCharge() {
        return charge;
    }

    public void setCharge(Long charge) {
        this.charge = charge;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
