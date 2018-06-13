package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class PayRetentionRateSqlProvider {
    public String searchAndSave(String singleDate) {
        String sql = "SELECT t1.datelist report_date,\n" +
                "IFNULL(t2.user_count,0) user_count,\n" +
                "IFNULL(t3.count,0) one_day,\n" +
                "IFNULL(t4.count,0) two_day,\n" +
                "IFNULL(t5.count,0) three_day,\n" +
                "IFNULL(t6.count,0) four_day,\n" +
                "IFNULL(t7.count,0) five_day,\n" +
                "IFNULL(t8.count,0) six_day,\n" +
                "IFNULL(t9.count,0) seven_day,\n" +
                "IFNULL(t10.count,0) two_weeks, \n" +
                "IFNULL(t11.count,0) one_month,\n" +
                "0 channel_id,\n" +
                "0 server_id\n" +
                "FROM\n" +
                "(SELECT DATE_FORMAT(datelist,'%Y-%m-%d') datelist FROM calendar WHERE datelist<=now() AND datelist>=DATE_SUB(CURDATE(), INTERVAL 30 DAY)) t1\n" +
                "LEFT JOIN \n" +
                "(SELECT DATE_FORMAT(create_time,'%Y-%m-%d') create_time,count(*) user_count FROM player_order GROUP BY create_time) t2 \n" +
                "ON t1.datelist=t2.create_time -- 当日充值用户\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 1 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id) \n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 1 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t3\n" +
                "ON t1.datelist=t3.create_time-- 1日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 2 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 2 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t4\n" +
                "ON t1.datelist=t4.create_time-- 2日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 3 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 3 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t5\n" +
                "ON t1.datelist=t5.create_time-- 3日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 4 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 4 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t6\n" +
                "ON t1.datelist=t6.create_time-- 4日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 5 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 5 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t7\n" +
                "ON t1.datelist=t7.create_time-- 5日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 6 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 6 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t8\n" +
                "ON t1.datelist=t8.create_time-- 6日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 7 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 7 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t9\n" +
                "ON t1.datelist=t9.create_time-- 7日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 14 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 14 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t10\n" +
                "ON t1.datelist=t10.create_time-- 14日\n" +
                "LEFT JOIN\n" +
                "(SELECT DATE_SUB(DATE_FORMAT(create_time,'%Y-%m-%d'), INTERVAL 30 DAY) create_time,player_id,count(*) count FROM player_action_log t1 WHERE action=4\n" +
                "AND EXISTS(SELECT * FROM \n" +
                "(SELECT MIN(create_time) first_recharge_time,player_id FROM player_order GROUP BY player_id)\n" +
                "t2 WHERE t1.player_id=t2.player_id AND  \n" +
                "DATE_ADD(DATE_FORMAT(t2.first_recharge_time,'%Y-%m-%d'), INTERVAL 30 DAY) = DATE_FORMAT(t1.create_time,'%Y-%m-%d'))) t11\n" +
                "ON t1.datelist=t11.create_time-- 30日";
        return sql;
    }

    public String searchPage(CommonSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT report_date,IFNULL(user_count,0) user_count,IFNULL(one_day,0) one_day,IFNULL(two_day,0) two_day,IFNULL(three_day,0) three_day,IFNULL(four_day,0) four_day,IFNULL(five_day,0) five_day,IFNULL(six_day,0) six_day,IFNULL(seven_day,0) seven_day,IFNULL(two_weeks,0) two_weeks, IFNULL(one_month,0) one_month FROM pay_retention_rate where 1=1");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and report_date >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and report_date < #{endDate}  ");
        }
        return sql.toString();
    }
}
