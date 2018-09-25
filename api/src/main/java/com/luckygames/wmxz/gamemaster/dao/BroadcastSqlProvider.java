package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastSearchQuery;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class BroadcastSqlProvider {
    public String queryBroadcast(BroadcastSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select b.* ")
                .append(" ,c.channel_name")
                .append(" ,s.server_name")
                .append(" from broadcast b ")
                .append(" left join channel c on b.channel_id=c.channel_id ")
                .append(" left join server s on b.server_id=s.server_id ")
                .append(" where 1=1");

        if (CollectionUtils.isNotEmpty(query.getChannelIds())) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and b.channel_id in (").append(ids).append(")  ");
        }
        if (CollectionUtils.isNotEmpty(query.getServerIds())) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and b.server_id in (").append(ids).append(")  ");
        }

        if (query.getBroadcastType() != null) {
            sql.append(" and b.broadcast_type = #{broadcastType} ");
        }
        if (query.getBroadcastStatus() != null) {
            sql.append(" and b.broadcast_type = #{broadcastStatus} ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and b.play_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and b.play_time < #{endDate}  ");
        }
        sql.append(" order by b.update_time desc");
        return sql.toString();
    }

}