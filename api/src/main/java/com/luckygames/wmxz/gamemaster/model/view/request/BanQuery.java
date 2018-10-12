package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

/**
 * Created by lucky on 2018/3/29.
 * 封禁
 */
public class BanQuery extends GMQuery {
    public BanQuery() {
        super(0L);
    }

    public BanQuery(Long serverId, Integer ban, Integer type, Long hour, String closureAccount) {
        super(serverId);
        this.ban = ban;
        this.type = type;
        this.hour = hour;
        this.closureAccount = closureAccount;
    }

    /**
     * 封禁操作类型，1：封禁，2：解封
     */
    private Integer ban;

    /**
     * 封禁类型，1：禁言，2：封号，3：禁ip，4：禁IMEI，5：踢下线
     */
    private Integer type;

    /**
     * 封禁时长（秒）
     */
    private Long hour;

    private String closureAccount;

    public String getClosureAccount() {
        return closureAccount;
    }

    public void setClosureAccount(String closureAccount) {
        this.closureAccount = closureAccount;
    }

    public Integer getBan() {
        return ban;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getHour() {
        return hour;
    }

    public void setHour(Long hour) {
        this.hour = hour;
    }
}
