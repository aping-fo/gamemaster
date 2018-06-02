package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class PayLTVSqlProvider extends PayLTVEntitySqlProvider {
    public String queryPayLTVReportSingleDate(String date) {
        StringBuilder sql = new StringBuilder(" select pa.channel_id,pa.server_id,pa.report_date,pa.char_count ")
                .append(" from player_action_daily pa ")
                .append(" where ")
                .append(" pa.report_date = #{date} ")
                .append(" and pa.char_count >0 ")
                .append(" order by pa.channel_id, pa.server_id, pa.report_date ");
        return sql.toString();
    }

    public String queryPayLTVReport(LTVSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select pl.report_date ")
                .append(" ,sum(pl.char_count) char_count ");

        sql.append(" from pay_ltv pl ")
                .append(" where 1=1 ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and pl.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and pl.server_id in (").append(ids).append(")  ");
        }

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and pl.report_date >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and pl.report_date < #{endDate}  ");
        }

        sql.append(" group by pl.report_date ")
                .append(" order by pl.report_date ");

        return sql.toString();
    }
}
