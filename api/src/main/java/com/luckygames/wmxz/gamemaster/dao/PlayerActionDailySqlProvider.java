package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class PlayerActionDailySqlProvider extends PlayerActionDailyEntitySqlProvider {
    public String queryPlayerDailyReportSingleDate(Date date) {
        StringBuilder sql = new StringBuilder(" select pa.channel_id, pa.server_id, DATE_FORMAT(pa.action_date,'%Y-%m-%d') report_date ")
                .append(" , sum(case when (pa.action =2) then 1 else 0 end) player_count ")
                .append(" , sum(case when (pa.action =3) then 1 else 0 end) char_count ")
                .append(" , sum(case when (pa.action =4) then 1 else 0 end) login_count ")
                .append(" , sum(case when (pa.action =5) then 1 else 0 end) logoff_count ")
                .append(" , sum(pa.online_time) online_time ")
                .append(" from player_action_log pa ")
                .append(" where ")
                .append(" pa.action_date between DATE(#{date}) and DATE(DATE_ADD(#{date},INTERVAL 1 DAY))")
                .append(" group by pa.channel_id,pa.server_id,report_date ");
        return sql.toString();
    }

    public String queryPlayerActionDailyRegisterReport(CommonSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select pa.channel_id ")
                .append(" , sum(pa.player_count) player_count ")
                .append(" , pa.report_date ")
                .append(" , c.channel_name ")
                .append(" from player_action_daily pa ")
                .append(" inner join channel c on c.channel_id=pa.channel_id ")
                .append(" where 1=1 ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and pa.channel_id in (" + ids + ") ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and pa.report_date >= #{startDate} ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and pa.report_date < #{endDate} ");
        }

        sql.append(" group by pa.channel_id, pa.report_date ")
                .append(" ,c.channel_name ")
                .append(" order by pa.channel_id, pa.report_date  ");

        return sql.toString();
    }
}
