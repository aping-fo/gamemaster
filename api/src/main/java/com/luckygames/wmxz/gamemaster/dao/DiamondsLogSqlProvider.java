package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.DiamondsLogSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class DiamondsLogSqlProvider {
    public String searchPage(DiamondsLogSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t1.*,t2.server_name FROM players_diamond_logs t1 left join server t2 on t1.server_id=t2.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and t1.create_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and t1.create_time < #{endDate}  ");
        }
        if (query.getPlayerId()!=null) {
            sql.append(" and t1.player_id = #{playerId}  ");
        }
        sql.append(" order by t1.create_time desc");
        return sql.toString();
    }
}
