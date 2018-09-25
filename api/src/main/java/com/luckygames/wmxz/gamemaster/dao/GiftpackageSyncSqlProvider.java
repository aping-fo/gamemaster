package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class GiftpackageSyncSqlProvider {
    public String searchPage(GiftpackageSyncSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT gs.*,s.server_name FROM giftpackage_sync gs left join server s on gs.server_id=s.server_id where 1=1 ");
        sql.append(" order by gs.update_time desc");
        return sql.toString();
    }

    public String queryGiftpackageSyncReport(GiftpackageSyncSearchQuery query) {
        StringBuilder sql = new StringBuilder("select * from giftpackage_sync");
        return sql.toString();
    }

    public String selectById(Integer id) {
        StringBuilder sql = new StringBuilder("select * from giftpackage_sync where id = " + id);
        return sql.toString();
    }
}
