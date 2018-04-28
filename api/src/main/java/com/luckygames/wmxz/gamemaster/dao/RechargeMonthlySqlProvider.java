package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeMonthlySearchQuery;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;

public class RechargeMonthlySqlProvider extends RechargeMonthlyEntitySqlProvider {
    public String queryRechargeMonthlyReport(RechargeMonthlySearchQuery query) {
        StringBuilder sql = new StringBuilder(" select * ")
                .append(" from recharge_monthly rm ")
                .append(" where 1=1 ");

        if (query.getChannelId() != null && !query.getChannelId().isEmpty()) {
            String ids = StringUtils.join(query.getChannelId(), ",");
            sql.append(" and channel_id in (").append(ids).append(") ");
        }
        if (query.getServerId() != null && !query.getServerId().isEmpty()) {
            String ids = StringUtils.join(query.getServerId(), ",");
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
