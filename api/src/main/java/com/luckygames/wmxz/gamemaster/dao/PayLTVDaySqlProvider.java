package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class PayLTVDaySqlProvider extends PayLTVDayEntitySqlProvider {
    public String queryPayLTVDaySingleDate(Map<String, Object> queryMap) {
        StringBuilder sql = new StringBuilder(" select ")
                .append(" #{payLtvId} payLtvId ")
                .append(" ,#{days} days ")
                .append(" ,sum(po.amount) / #{charCount} average ")
                .append(" ,sum(po.amount) summary ")
                .append(" FROM ")
                .append(" player_order po ")
                .append(" WHERE ")
                .append(" 1 = 1 ")
                .append(" AND po.recharged_date >= date( #{reportDate} ) ")
                .append(" AND po.recharged_date < date_add( date( #{reportDate} ), INTERVAL #{days} DAY ) ")
                .append(" AND po.channel_id = #{channelId} ")
                .append(" AND po.server_id = #{serverId} ")
                .append(" AND po.char_id IN ( ")
                .append(" SELECT ")
                .append(" char_id ")
                .append(" FROM ")
                .append(" player_action_log pal ")
                .append(" WHERE ")
                .append(" pal.action = 3 ")
                .append(" AND pal.action_date >= date( #{reportDate} ) ")
                .append(" AND pal.action_date < date_add( date( #{reportDate} ), INTERVAL 1 DAY ) ")
                .append(" AND pal.channel_id = #{channelId} ")
                .append(" AND pal.server_id = #{serverId} ")
                .append(" )");
        return sql.toString();
    }

    public String queryPayLTVDays(LTVSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select ")
                .append(" pld.days ")
                .append(" ,sum(pld.summary) summary ")
                .append(" ,sum(pld.summary) / sum(pl.char_count) average ")
                .append(" from ")
                .append(" pay_ltv_day pld ")
                .append(" ,pay_ltv pl ")
                .append(" where 1=1 ")
                .append(" and pld.pay_ltv_id = pl.id ")
                .append(" and pl.report_date = #{reportDate} ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and pl.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and pl.server_id in (").append(ids).append(")  ");
        }
        sql.append(" group by pld.days")
                .append(" order by pld.days ");

        return sql.toString();
    }
}
