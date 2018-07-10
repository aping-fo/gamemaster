package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

/**
 * Created by lucky on 2018/3/29.
 * 踢人
 */
public class KickLineQuery extends GMQuery {
    public KickLineQuery() {
        super(0L);
    }

    public KickLineQuery(Long id, Long serverId) {
        super(serverId);
        this.id = id;
    }

    /**
     * 角色id
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        KickLineQuery query = new KickLineQuery();
        query.setId(1L);

        System.out.println(query.encodeReqParams());
    }
}
