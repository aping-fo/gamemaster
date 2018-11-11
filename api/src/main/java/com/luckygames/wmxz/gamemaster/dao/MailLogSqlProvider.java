package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.MailLogSearchQuery;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class MailLogSqlProvider {
    public String queryMailLog(MailLogSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select ml.*,s.server_name from mail_log ml left join server s on ml.server_id = s.server_id where 1=1 ");

        if (CollectionUtils.isNotEmpty(query.getServerIds())) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and ml.server_id in (").append(ids).append(")  ");
        }

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and ml.create_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and ml.create_time < #{endDate}  ");
        }
        if (query.getServerId() != null) {
            sql.append(" and ml.server_id = #{serverId}  ");
        }
        if (query.getMailType() != null) {
            sql.append(" and ml.mail_type = #{mailType} ");
        }
        sql.append(" order by ml.create_time desc");
        return sql.toString();
    }
}
