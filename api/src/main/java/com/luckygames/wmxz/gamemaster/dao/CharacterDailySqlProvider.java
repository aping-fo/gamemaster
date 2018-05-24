package com.luckygames.wmxz.gamemaster.dao;

public class CharacterDailySqlProvider {
    public String queryCharacterDailyReportByDate(String reportDate) {
        StringBuilder sql = new StringBuilder("SELECT ")
                .append(" pal.char_id, ")
                .append(" #{reportDate} report_date, ")
                .append(" sum( CASE WHEN pal.action = 4 THEN 1 ELSE 0 END ) login_times, ")
                .append(" sum( online_time ) online_time, ")
                .append(" sum( po.amount ) recharge_amount  ")
                .append(" FROM ")
                .append(" player_action_log pal ")
                .append(" LEFT JOIN player_order po ON pal.char_id = po.char_id AND po.recharged_date LIKE #{reportDate}\"%\"  ")
                .append(" WHERE ")
                .append(" pal.action_date LIKE #{reportDate}\"%\"  ")
                .append(" GROUP BY ")
                .append(" char_id, ")
                .append(" report_date");
        return sql.toString();
    }
}
