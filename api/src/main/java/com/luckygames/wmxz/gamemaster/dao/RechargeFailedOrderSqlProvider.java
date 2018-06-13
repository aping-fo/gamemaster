package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeFailedOrderSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class RechargeFailedOrderSqlProvider {
    public String queryRechargeFailedOrderReportFromOrderSingleDate(String singleDate) {
        String sql = "SELECT t1.order_code order_code,t1.server_name server_name,t1.server_id server_id,t1.channel_name channel_name,IFNULL(t1.channel_id,0) channel_id ,t2.username user_name,t3.char_name char_name,t3.level char_level,gold_quantity gold_quantity,t1.amount amount,t1.status status,t1.create_time create_time,t1.update_time update_time,t1.create_time report_date,t1.player_id player_id,t1.char_id char_id FROM player_order t1 LEFT JOIN \n" +
                "player t2 ON t1.player_id=t2.player_id LEFT JOIN \n" +
                "player_character t3 ON t1.player_id=t3.player_id\n" +
                "WHERE t1.status=2";
        return sql;
    }

    public String queryRechargeFailedOrderReport(RechargeFailedOrderSearchQuery query) {
        StringBuilder sql = new StringBuilder("select po.* ")
                .append(" ,p.username username ")
                .append(" from recharge_failed_order po ")
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

        if (query.getGoldQuantityFrom() != null) {
            sql.append(" and po.gold_quantity >=#{goldQuantityFrom} ");
        }
        if (query.getGoldQuantityTo() != null) {
            sql.append(" and po.gold_quantity <=#{goldQuantityTo} ");
        }
        return sql.toString();
    }
}
