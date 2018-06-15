package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.Activity;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivitySearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ActivitySqlProvider {
    public String add(Activity activity) {
        StringBuilder sql = new StringBuilder("INSERT INTO activity(create_time,update_time,classification,title,start_time,end_time,activity_status,is_open,type,des,sort,creater,auditor,auditor_time) VALUES(now(),now()");
        sql.append(","+activity.getClassification());
        sql.append(",'"+activity.getTitle()+"'");
        sql.append(",'"+activity.getStartTime()+"'");
        sql.append(",'"+activity.getEndTime()+"'");
        sql.append(",0");
        sql.append(","+activity.getIsOpen());
        sql.append(","+activity.getType());
        sql.append(",'"+activity.getDes()+"'");
        sql.append(","+activity.getSort());
        sql.append(",'张三','李四',now())");
        return sql.toString();
    }

    public String update(ActivitySearchQuery query) {
        StringBuilder sql = new StringBuilder("UPDATE activity set activity_status=1 where id="+query.getId());
        return sql.toString();
    }

    public String searchPage(ActivitySearchQuery query) {
        StringBuilder sql = new StringBuilder("select * from activity where 1=1 ");
        if(query.getActivityStatus()!=null){
            sql.append(" and activity_status ="+query.getActivityStatus());
        }
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
        return sql.toString();
    }
}
