package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.OnlineNowSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class OnlineNowSqlProvider {
    public String queryOnlineNowReportFromOrderSingleDate(String singleDate) {
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

    public String searchPage(OnlineNowSearchQuery query) {
        StringBuilder sql = new StringBuilder("select po.* ")
                .append(" from online_now po ")
                .append(" inner join player_character pc on pc.char_id=po.char_id ")
                .append(" where online=1 ");
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and po.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and po.server_id in (").append(ids).append(")  ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and DATE_FORMAT(po.last_login_time,'%Y-%m-%d') >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and DATE_FORMAT(po.last_login_time,'%Y-%m-%d') <= #{endDate}  ");
        }
        if (StringUtils.isNotBlank(query.getCharName())) {
            sql.append(" and ( pc.char_name like \"%\"#{charName}\"%\" ) ");
        }
        return sql.toString();
    }
}
