package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.ServerOnlineLogQuery;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class ServerOnlineLogSqlProvider {
    public String queryServerOnlineLog(ServerOnlineLogQuery query) {
        StringBuilder sql = new StringBuilder("select sol.* ")
                .append(" ,s.server_name ")
                .append(" from server_online_log sol ")
                .append(" left join server s on sol.server_id=s.server_id ")
                .append(" where 1=1");

        if (CollectionUtils.isNotEmpty(query.getServerIds())) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and sol.server_id in (").append(ids).append(")  ");
        }
        if (query.getSearchType().equals(0)) {
            String startDate = DateUtils.DateToString(DateUtils.addHours(DateUtils.Now(), -24));
            String endDate = DateUtils.DateToString(DateUtils.Now());
            int startHour = DateUtils.Now().getHours();
            sql.append(" and ( sol.report_date = '").append(startDate).append("' and sol.report_hour >= ").append(startHour)
                    .append(" or sol.report_date = '").append(endDate).append("' and sol.report_hour <=").append(startHour).append(" )");
        } else {
            if (StringUtils.isNotBlank(query.getStartDate())) {
                sql.append(" and sol.report_date >= #{startDate} ");
            }
            if (StringUtils.isNotBlank(query.getEndDate())) {
                sql.append(" and sol.report_date <= #{endDate} ");
            }
        }
        return sql.toString();
    }
}
