package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class IntegratedOnlineSqlProvider {
    public String searchPage(IntegratedOnlineSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT IFNULL( t1.max_role_count, 0 ) max_role_count,IFNULL( t1.avg_role_count, 0 ) avg_role_count,IFNULL( t1.min_role_count, 0 ) min_role_count,t2.datelist update_time FROM ( SELECT max_role_count, avg_role_count, min_role_count, update_time FROM integrated_online WHERE 1 = 1 ");
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        sql.append(" ) t1 RIGHT JOIN (SELECT datelist FROM calendar WHERE 1 = 1 ");
        if (query.getRecentTime() != null && query.getRecentTime() == 60) {
            sql.append(" and datelist<=now() and datelist> DATE_SUB(CURDATE(), INTERVAL 60 DAY) ");
        } else if (query.getRecentTime() != null && query.getRecentTime() == 90) {
            sql.append(" and datelist<=now() and datelist> DATE_SUB(CURDATE(), INTERVAL 90 DAY) ");
        } else {
            if (StringUtils.isNotBlank(query.getEndDate())) {
                sql.append(" and datelist<=#{endDate}  ");
            } else {
                sql.append(" and datelist<=now()  ");
            }
            if (StringUtils.isNotBlank(query.getStartDate())) {
                sql.append(" and datelist>= #{startDate} ");
            } else {
                sql.append(" and datelist> DATE_SUB(CURDATE(), INTERVAL 30 DAY ) ");
            }
        }
        sql.append(") t2 ON DATE_FORMAT(t1.update_time,'%Y-%m-%d')=t2.datelist");
        return sql.toString();
    }
}
