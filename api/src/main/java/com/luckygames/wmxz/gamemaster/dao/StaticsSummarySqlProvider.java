package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class StaticsSummarySqlProvider {
    public String queryStaticsSummary(CommonSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select ss.* ")
                .append(" ,s.server_name ")
                .append(" ,c.channel_name ")
                .append(" from statics_summary ss ")
                .append(" inner join channel c on c.channel_id=ss.channel_id ")
                .append(" inner join server s on s.server_id=ss.server_id ")
                .append(" where 1=1 ");
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and c.channel_id in (").append(ids).append(") ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and c.server_id in (").append(ids).append(") ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and ss.report_date >= #{startDate} ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and ss.report_date < #{endDate} ");
        }

        sql.append(" order by ss.report_date ");
        return sql.toString();
    }

    public String queryStaticsSummaryReportSingleDate(String reportDate) {
        StringBuilder sql = new StringBuilder("SELECT " +
                " pad.report_date, " +
                " pad.channel_id, " +
                " pad.server_id, " +
                " sum( pad.player_count ) player_count, " +
                " sum( pad.char_count ) char_count, " +
                " sum( pad.login_count ) login_count, " +
                " max( sol.max_online_count ) online_count, " +
                " sum( rd.recharge_amount ) recharge_sum, " +
                " sum( rd.recharge_sum ) recharge_count, " +
                " sum( rd.recharge_amount ) / sum( rd.recharge_sum ) arpu, " +
                " sum( rd.append_sum ) new_recharge_count, " +
                " sum( rd.append_sum ) / sum( pad.char_count ) new_recharge_rate, " +
                " sum( staydays.stay2d ) / sum( pad.char_count ) stay2d, " +
                " sum( staydays.stay3d ) / sum( pad.char_count ) stay3d, " +
                " sum( staydays.stay7d ) / sum( pad.char_count ) stay7d " +
                " FROM " +
                " player_action_daily pad " +
                " LEFT JOIN server_online_log sol ON pad.report_date = sol.report_date " +
                " AND pad.server_id = sol.server_id " +
                " LEFT JOIN recharge_daily rd ON pad.report_date = rd.report_date " +
                " AND pad.channel_id = rd.channel_id " +
                " AND pad.server_id = rd.server_id " +
                " LEFT JOIN ( " +
                "  SELECT " +
                "   #{reportDate} report_date, " +
                "   pal2d.channel_id, " +
                "   pal2d.server_id, " +
                "   CASE WHEN datediff( pal2d.action_date, #{reportDate} ) = 1 THEN 1 ELSE 0 END stay2d, " +
                "   CASE WHEN datediff( pal2d.action_date, #{reportDate} ) = 3 THEN 1 ELSE 0 END stay3d, " +
                "   CASE WHEN datediff( pal2d.action_date, #{reportDate} ) = 7 THEN 1 ELSE 0 END stay7d " +
                "  FROM " +
                "   player_action_log pal2d " +
                "  WHERE " +
                "   pal2d.action = 4 " +
                "   AND pal2d.char_id IN ( " +
                "    SELECT char_id FROM player_action_log pal WHERE pal.action = 3 AND pal.action_date LIKE #{reportDate}\"%\"" +
                "   ) " +
                " ) staydays ON pad.report_date = staydays.report_date AND pad.channel_id = staydays.channel_id AND pad.server_id = staydays.server_id " +
                " WHERE " +
                " pad.report_date = #{reportDate} " +
                " GROUP BY " +
                " pad.report_date, " +
                " pad.server_id, " +
                " pad.channel_id");

        return sql.toString();
    }
}
