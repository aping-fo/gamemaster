package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeMonthlySearchQuery;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;

public class RechargeMonthlySqlProvider extends RechargeMonthlyEntitySqlProvider {
    public String queryRechargeMonthlyReport(RechargeMonthlySearchQuery query) {
        StringBuilder sql = new StringBuilder(" select * ")
                .append(" from recharge_monthly rm ")
                .append(" where 1=1 ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and channel_id in (").append(ids).append(") ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(") ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            int year = DateUtils.YearFromDate(query.getStartDate());
            sql.append(" and recharge_year = ").append(year);
            int month = DateUtils.MonthFromDate(query.getStartDate());
            sql.append(" and recharge_month = ").append(month);
        }
        return sql.toString();
    }
}
