package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchQuery;
import org.apache.commons.lang3.StringUtils;

public class RechargeDailySqlProvider {
    public String queryRechargeDailyReportFromOrderSingleDate(String singleDate) {
        String sql = "SELECT  " +
                "po.channel_id,  " +
                "po.server_id,  " +
                "DATE_FORMAT(po.paid_date,'%Y-%m-%d') report_date,  " +
                "count(po.char_id) rechargeSum,  " +
                "sum(po.amount) rechargeAmount,  " +
                "sum(po.gold_quantity) goldSum,  " +
                "(sum(po.amount) / count(po.player_id)) arpuSum,  " +
                "sum(CASE WHEN (po.paid_date=pc.first_recharge_time) THEN po.amount ELSE 0 END) appendAmount,  " +
                "sum(CASE WHEN (po.paid_date=pc.first_recharge_time) THEN 1 ELSE 0 END) appendSum,  " +
                "sum(CASE WHEN (po.paid_date=pc.first_recharge_time) THEN 1 ELSE 0 END) goldAppend,  " +
                "sum(CASE WHEN (po.paid_date=pc.first_recharge_time) THEN po.amount ELSE 0 END)/sum(CASE WHEN (po.paid_date=pc.first_recharge_time) THEN 1 ELSE 0 END) arpuAppend,  " +
                "now() updateTime  " +
                "FROM  " +
                "player_order po  " +
                "left JOIN  " +
                "player_character pc on po.char_id=pc.char_id   " +
                "where   " +
                "po.paid_date between DATE(#{singleDate}) and DATE_ADD(DATE(#{singleDate}),INTERVAL 1 DAY)  " +
                "GROUP BY   " +
                "po.channel_id,  " +
                "po.server_id,  " +
                "report_date  " +
                "order by po.channel_id,po.server_id,report_date  ";
        return sql;
    }

    public String queryRechargeDailyReport(RechargeDailySearchQuery query) {
        String sql = "SELECT  " +
                "report_date,  " +
                "sum(recharge_sum) rechargeSum,  " +
                "sum(recharge_amount) rechargeAmount,  " +
                "sum(gold_sum) goldSum,  " +
                "sum(recharge_amount) / sum(recharge_sum) arpuSum,  " +
                "sum(append_amount) appendAmount,  " +
                "sum(append_sum) appendSum,  " +
                "sum(gold_append) goldAppend,  " +
                "sum(append_amount) / sum(append_sum) arpuAppend  " +
                "FROM  " +
                "recharge_daily  " +
                "where   " +
                "1=1  ";
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql += "and channel_id in (" + ids + ")  ";
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql += "and server_id in (" + ids + ")  ";
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql += "and report_date >= #{startDate}  ";
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql += "and report_date < #{endDate}  ";
        }
        sql += "GROUP BY   " +
                "report_date  " +
                "order by report_date  ";
        return sql;
    }
}
