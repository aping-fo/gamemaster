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

    public BanQuery(Integer ban, Integer type, Long id, Integer hour, Long serverId) {
        super(serverId);
        this.ban = ban;
        this.type = type;
        this.id = id;
        this.hour = hour;
    }

    /**
     * 封禁类型，1：禁止登录，2：禁止聊天
     */
    private Integer ban;

    /**
     * 封禁操作类型，0：解封，1：封禁
     */
    private Integer type;

    /**
     * 角色id
     */
    private Long id;


    /**
     * 封禁时长
     */
    private Integer hour;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public static void main(String[] args) {
        BanQuery query = new BanQuery();
        query.setBan(1);
        query.setHour(1);
        query.setId(1L);
        query.setType(1);

        System.out.println(query.encodeReqParams());
    }
}
