package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class OnlineSqlProvider {
    public String queryOnlineReport(CommonSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT o.*,s.server_name server_name1 FROM online o left join server s on o.server_id=s.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and o.update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and o.update_time < #{endDate}  ");
        }
        sql.append(" order by o.create_time desc");
        return sql.toString();
    }
}
