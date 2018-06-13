package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;

public class OnlineSqlProvider {
    public String queryOnlineReport(CommonSearchQuery query) {
        String sql = "SELECT t2.datelist update_time,IFNULL(t1.number,0) max_role_count,IFNULL(t1.number,0) avg_role_count,IFNULL(t1.number,0) min_role_count FROM\n" +
                "(SELECT count(*) number,update_time FROM player_action_log WHERE action=4 GROUP BY DATE_FORMAT(update_time,'%Y-%m-%d'))t1\n" +
                "RIGHT JOIN\n" +
                "(SELECT datelist FROM calendar t1 WHERE datelist<=(select last_day(curdate()))   -- 获取当月最后一天\n" +
                "AND datelist>=(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t2  -- 获取本月第一天\n" +
                "ON DATE_FORMAT(t1.update_time,'%Y-%m-%d')=t2.datelist";
        return sql;
    }
}
