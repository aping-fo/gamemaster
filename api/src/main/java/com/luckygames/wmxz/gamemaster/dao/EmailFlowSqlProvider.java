package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.EmailFlowSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class EmailFlowSqlProvider {
    public String searchPage(EmailFlowSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT * FROM email_flow where 1=1 ");
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and update_time < #{endDate}  ");
        }
        if (StringUtils.isNotBlank(query.getName())) {
            sql.append(" and name like \"%\"#{name}\"%\" ");
        }
        if (StringUtils.isNotBlank(query.getType())) {
        }
        return sql.toString();
    }
}
