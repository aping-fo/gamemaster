package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineServiceSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class IntegratedOnlineServiceSqlProvider {
    public String searchPage(IntegratedOnlineServiceSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t2.server_name server_name,IFNULL( t1.total_creation_angle, 0 ) ,IFNULL( t2.max_role_count, 0 ) max_role_count,IFNULL( t2.avg_role_count, 0 ) avg_role_count,IFNULL( t2.min_role_count, 0 ) min_role_count FROM(SELECT server_id,count( pay_number ) total_creation_angle FROM comprehensive_report_data_collection WHERE 1 = 1 ");
        if (StringUtils.isNotBlank(query.getUpdateTime())) {
            sql.append(" AND DATE_FORMAT( update_time, '%Y-%m-%d' )<='"+query.getUpdateTime()+"' and update_time>DATE_SUB('"+query.getUpdateTime()+"', INTERVAL 5 DAY) ");
        } else {
            sql.append(" AND update_time<=now() and update_time>DATE_SUB(CURDATE(), INTERVAL 5 DAY) ");
        }
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        sql.append(" GROUP BY server_id ) t1 INNER JOIN (SELECT t3.* FROM ( SELECT server_name,server_id,sum(max_role_count) max_role_count,sum(avg_role_count) avg_role_count,sum(min_role_count) min_role_count FROM integrated_online t1 WHERE 1 = 1 ");
        if (StringUtils.isNotBlank(query.getUpdateTime())) {
            sql.append("AND DATE_FORMAT(update_time,'%Y-%m-%d')=DATE_FORMAT('"+query.getUpdateTime()+"','%Y-%m-%d') ");
        } else {
            sql.append("AND DATE_FORMAT(update_time,'%Y-%m-%d')=DATE_FORMAT(now(),'%Y-%m-%d') ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        sql.append("GROUP BY server_id) t3) t2 ON t1.server_id=t2.server_id");
        return sql.toString();
    }
}
