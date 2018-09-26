package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ForbiddenlogSqlProvider {
    public String queryFobiddenLog(ForbiddenSearchQuery query) {
        StringBuilder sql = new StringBuilder("select fl.* ,s.server_name FROM forbidden_log fl left join server s on fl.server_id=s.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and fl.update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and fl.update_time < #{endDate}  ");
        }
        if (StringUtils.isNotBlank(query.getPlayerName())) {
            sql.append(" and fl.player_name like \"%\"#{playerName}\"%\" ");
        }
        sql.append(" order by fl.create_time desc");
        return sql.toString();
    }
}
