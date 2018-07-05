package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineServiceSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class IntegratedOnlineServiceSqlProvider {
    public String searchPage(IntegratedOnlineServiceSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t1.server_name server_name,IFNULL( t1.total_creation_angle, 0 ) ,IFNULL( t2.max_role_count, 0 ) max_role_count,IFNULL( t2.avg_role_count, 0 ) avg_role_count,IFNULL( t2.min_role_count, 0 ) min_role_count FROM(SELECT server_name,server_id,count( pay_number ) total_creation_angle,update_time FROM comprehensive_report_data_collection WHERE 1 = 1 ");
        if (StringUtils.isNotBlank(query.getUpdateTime())) {
            sql.append(" AND update_time<='"+query.getUpdateTime()+"' and update_time>DATE_SUB('"+query.getUpdateTime()+"', INTERVAL 5 DAY) ");
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
        sql.append(" GROUP BY server_id ) t1 LEFT JOIN (SELECT t3.* FROM ( SELECT * FROM integrated_online t1 WHERE 1 = 1 ");
        if (StringUtils.isNotBlank(query.getUpdateTime())) {
            sql.append("AND DATE_FORMAT(update_time,'%Y-%m-%d')=DATE_FORMAT('"+query.getUpdateTime()+"','%Y-%m-%d') ");
        } else {
            sql.append("AND DATE_FORMAT(update_time,'%Y-%m-%d')=DATE_FORMAT(now(),'%Y-%m-%d') ");
        }
        sql.append(") t3) t2 ON DATE_FORMAT(t1.update_time,'%Y-%m-%d')=DATE_FORMAT(t2.update_time,'%Y-%m-%d')");
        return sql.toString();
    }
}
