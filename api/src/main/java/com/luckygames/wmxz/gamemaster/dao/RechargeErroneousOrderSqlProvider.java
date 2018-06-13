package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeErroneousOrderSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class RechargeErroneousOrderSqlProvider {
    public String queryRechargeErroneousOrderReportFromOrderSingleDate(String singleDate) {
        String sql = "SELECT t1.order_code order_code,t1.channel_name channel_name,IFNULL(t1.channel_id,0) channel_id,t1.server_name server_name,t1.server_id server_id,t2.username user_name,t1.player_id player_id,t1.char_id char_id,t1.amount amount,t1.create_time report_date FROM player_order t1 LEFT JOIN \n" +
                "player t2 ON t1.player_id=t2.player_id\n" +
                "WHERE t1.status=3";
        return sql;
    }

    public String queryRechargeErroneousOrderReport(RechargeErroneousOrderSearchQuery query) {
        StringBuilder sql = new StringBuilder("select po.* ")
                .append(" ,p.username username ")
                .append(" from recharge_Erroneous_order po ")
                .append(" inner join player p on p.player_id=po.player_id ")
                .append(" inner join player_character pc on pc.char_id=po.char_id ")
                .append(" where 1=1 ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and po.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and po.server_id in (").append(ids).append(")  ");
        }

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and po.report_date >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and po.report_date < #{endDate}  ");
        }

        if (StringUtils.isNotBlank(query.getOrderCode())) {
            sql.append(" and po.order_code like \"%\"#{orderCode}\"%\" ");
        }

        if (StringUtils.isNotBlank(query.getUserName())) {
            sql.append(" and ( p.username like \"%\"#{userName}\"%\" or p.mobile like \"%\"#{userName}\"%\" or p.id_card like \"%\"#{userName}\"%\") ");
        }

        if (StringUtils.isNotBlank(query.getCharName())) {
            sql.append(" and ( pc.char_name like \"%\"#{charName}\"%\" ) ");
        }
        if (query.getSuccessfulOrder() != null) {
            sql.append(" and po.status !=2  ");
        }
        if (query.getRepeat() != null) {
            sql.append(" GROUP BY order_code  ");
        }
        return sql.toString();
    }
}
