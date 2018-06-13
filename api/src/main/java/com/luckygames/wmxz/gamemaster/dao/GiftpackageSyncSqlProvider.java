package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageSyncSearchQuery;

public class GiftpackageSyncSqlProvider {
    public String queryGiftpackageSyncReportFromOrderSingleDate(String singleDate) {
        String sql = "SELECT t1.char_id,t2.char_name,t3.username,t4.last_login_time,sum(online_time) max_online_length,create_ip player_ip FROM player_action_log t1 \n" +
                "LEFT JOIN \n" +
                "player_character t2 ON t1.player_id=t2.player_id \n" +
                "LEFT JOIN \n" +
                "player t3 ON t1.player_id=t3.player_id\n" +
                "LEFT JOIN \n" +
                "(SELECT max(create_time) last_login_time,player_id FROM player_action_log WHERE action=4 GROUP BY player_id) t4 ON t1.player_id=t4.player_id\n" +
                "GROUP BY t1.player_id";
        return sql;
    }

    public String queryGiftpackageSyncReport(GiftpackageSyncSearchQuery query) {
        StringBuilder sql = new StringBuilder("select * from giftpackage_sync");
        return sql.toString();
    }
}
