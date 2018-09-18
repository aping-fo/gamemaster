package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.NoticeSearchQuery;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class NoticeSqlProvider {
    public String searchPage(NoticeSearchQuery query) {
        StringBuilder sql = new StringBuilder("select * from notice where 1=1");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and update_time < #{endDate}  ");
        }
        sql.append(" order by update_time desc");
        return sql.toString();
    }
}