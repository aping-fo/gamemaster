package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;

public class PlayerActionLogSqlProvider extends PlayerActionLogEntitySqlProvider {
    public String queryEquipmentCountReport(CommonSearchQuery query) {
        String sql = "SELECT t1.create_time action_date FROM player_action_log t1 \n" +
                "LEFT JOIN \n" +
                "player_character t2 ON t1.player_id=t2.player_id \n" +
                "LEFT JOIN \n" +
                "player t3 ON t1.player_id=t3.player_id\n" +
                "LEFT JOIN \n" +
                "(SELECT max(create_time) last_login_time,player_id FROM player_action_log WHERE action=4 GROUP BY player_id) t4 ON t1.player_id=t4.player_id\n" +
                "GROUP BY t1.player_id";
        return sql;
    }
}
