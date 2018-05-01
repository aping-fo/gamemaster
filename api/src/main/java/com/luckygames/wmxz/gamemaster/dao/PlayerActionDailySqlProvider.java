package com.luckygames.wmxz.gamemaster.dao;

import java.util.Date;

public class PlayerActionDailySqlProvider extends PlayerActionDailyEntitySqlProvider {
    public String queryPlayerDailyReportSingleDate(Date date) {
        StringBuilder sql = new StringBuilder(" select pa.channel_id, pa.server_id, DATE_FORMAT(pa.action_date,'%Y-%m-%d') report_date ")
                .append(" , sum(case when (pa.action =2) then 1 else 0 end) player_count ")
                .append(" , sum(case when (pa.action =3) then 1 else 0 end) char_count ")
                .append(" , sum(case when (pa.action =4) then 1 else 0 end) login_count ")
                .append(" , sum(case when (pa.action =5) then 1 else 0 end) logoff_count ")
                .append(" , sum(pa.online_time) online_time ")
                .append(" from player_action_log pa ")
                .append(" where ")
                .append(" pa.action_date between DATE(#{date}) and DATE(DATE_ADD(#{date},INTERVAL 1 DAY))")
                .append(" group by pa.channel_id,pa.server_id,report_date ");
        return sql.toString();
    }
}
