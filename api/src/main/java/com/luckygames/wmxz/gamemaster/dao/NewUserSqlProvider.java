package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class NewUserSqlProvider {
    public String searchPage(NewUserSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t1.*,t2.server_name serverName FROM new_user t1  LEFT JOIN server t2 on t1.server_id=t2.server_id where 1=1");
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and t1.create_time < #{endDate}");
        }else{
            sql.append(" and t1.create_time < DATE_SUB(curdate(),INTERVAL 0 DAY)");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and t1.create_time >= #{startDate}");
        }else {
            sql.append(" and t1.create_time >= DATE_SUB(curdate(),INTERVAL 1 DAY)");
        }
        if (query.getServerId() != null) {
            sql.append(" and t1.server_id = #{serverId}");
        }
        sql.append(" GROUP BY t1.server_id");
        return sql.toString();
    }
}
