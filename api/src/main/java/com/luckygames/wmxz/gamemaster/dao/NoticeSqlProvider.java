package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.NoticeSearchQuery;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class NoticeSqlProvider {
    public String queryNotice(NoticeSearchQuery query) {
        StringBuilder sql = new StringBuilder("select n.*,c.channel_name from notice n left join channel c on n.channel_id=c.channel_id");
        return sql.toString();
    }

}