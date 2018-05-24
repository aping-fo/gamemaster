package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class PlayerCharacterSqlProvider extends PlayerCharacterEntitySqlProvider {
    public String queryCharacterDailyReport(PlayerCharacterSearchQuery query) {
        StringBuilder sql = new StringBuilder(" SELECT ")
                .append(" pc.*, ")
                .append(" cd.login_times, ")
                .append(" cd.login_days, ")
                .append(" cd.online_time, ")
                .append(" cd.recharge_amount ")
                .append(" FROM ")
                .append(" player_character pc ")
                .append(" INNER JOIN ( ")
                .append(" SELECT ")
                .append(" char_id, ")
                .append(" sum( login_times ) login_times, ")
                .append(" count( login_times ) login_days, ")
                .append(" sum( online_time ) online_time, ")
                .append(" sum( recharge_amount ) recharge_amount  ")
                .append(" FROM ")
                .append(" character_daily cd  ")
                .append(" WHERE 1=1 ");

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and cd.report_date >= #{startDate} ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and cd.report_date < #{endDate} ");
        }
        sql.append(" GROUP BY ")
                .append(" char_id  ")
                .append(" ) cd ON pc.char_id = cd.char_id ");

        return sql.toString();
    }
}
