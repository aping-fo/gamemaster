package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.AccountLogSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class AccountLogSqlProvider {
    public String searchPage(AccountLogSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t1.*,t2.server_name FROM account_log t1 left join server t2 on t1.server_id=t2.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and t1.update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and t1.update_time < #{endDate}  ");
        }
        if (query.getServerId()!=null) {
            sql.append(" and t1.server_id = #{serverId}  ");
        }
        sql.append(" order by t1.create_time desc");
        return sql.toString();
    }
}
