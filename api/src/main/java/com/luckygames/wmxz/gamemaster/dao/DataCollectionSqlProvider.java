package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class DataCollectionSqlProvider {
    public String queryDataCollectionReportFromOrderSingleDate(Date singleDate) {
        String sql = "SELECT \n" +
                "now() report_date,IFNULL(t1.channel_id,0) channel_id,IFNULL(t1.server_id,0) server_id,IFNULL(t1.register_number,0) register_number,IFNULL(t2.role_number,0) role_number,IFNULL(t3.login_number,0) login_number,IFNULL(t4.active_number,0) active_number,IFNULL(t5.old_player_number,0) old_player_number,IFNULL(t6.pay_number,0) pay_number,IFNULL(t7.recharge_amount,0.00) recharge_amount,\n" +
                "IFNULL(format(t6.pay_number/t3.login_number,4),0.00) pay_rate, -- 登录付费率\n" +
                "IFNULL(t7.recharge_amount/t6.pay_number,0.00) pay_arpu, -- 付费ARPU\n" +
                "IFNULL(t8.new_pay_number,0) new_pay_number,IFNULL(t9.new_recharge_amount,0.00) new_recharge_amount,\n" +
                "IFNULL(format(t8.new_pay_number/t2.role_number,4),0.00) new_pay_rate, -- 新付费率\n" +
                "IFNULL(t9.new_recharge_amount/t8.new_pay_number,0.00) new_pay_arpu, -- 新付费ARPU\n" +
                "IFNULL(t10.old_pay_number,0) old_pay_number,IFNULL(t11.old_recharge_amount,0.00) old_recharge_amount,\n" +
                "IFNULL(format(t10.old_pay_number/t5.old_player_number,4),0.00) old_pay_rate, -- 老付费率\n" +
                "IFNULL(t11.old_recharge_amount/t10.old_pay_number,0.00) old_pay_arpu, -- 老付费ARPU\n" +
                "IFNULL(format(t12.login_number/t13.login_number,4),0.00) next_day_avg, -- 次留\n" +
                "IFNULL(format(t14.login_number/t15.login_number,4),0.00) three_day_avg, -- 三留\n" +
                "IFNULL(format(t16.login_number/t17.login_number,4),0.00) seven_day_avg -- 七留\n" +
                "FROM\n" +
                "(SELECT t1.channel_id,t2.server_id,COUNT(*) register_number FROM(SELECT channel_id,player_id FROM player WHERE TO_DAYS(create_time)=TO_DAYS(now())) t1 \n" +
                "RIGHT JOIN (SELECT DISTINCT server_id,player_id FROM player_character WHERE TO_DAYS(create_time)=TO_DAYS(now())) t2 on t1.player_id=t2.player_id GROUP BY t1.channel_id,t2.server_id) t1 -- 注册数\n" +
                "LEFT JOIN (SELECT t1.channel_id,t2.server_id,COUNT(*) role_number FROM(SELECT channel_id,player_id FROM player WHERE TO_DAYS(create_time)=TO_DAYS(now())) t1 \n" +
                "RIGHT JOIN (SELECT server_id,player_id FROM player_character WHERE TO_DAYS(create_time)=TO_DAYS(now())) t2 on t1.player_id=t2.player_id GROUP BY t1.channel_id,t2.server_id) t2 -- 创角数\n" +
                "ON t1.channel_id=t2.channel_id AND t1.server_id=t2.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(DISTINCT char_id) login_number FROM player_action_log WHERE TO_DAYS(action_date)=TO_DAYS(now()) AND action=4 GROUP BY channel_id,server_id) t3 -- 登录数\n" +
                "on t1.channel_id=t3.channel_id AND t1.server_id=t3.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(online_time) active_number FROM (SELECT channel_id,server_id,SUM(online_time) online_time FROM player_action_log WHERE TO_DAYS(action_date)=TO_DAYS(now()) AND action=4 \n" +
                "GROUP BY char_id) t1 WHERE t1.online_time>=1800 GROUP BY channel_id,server_id) t4 -- 活跃数\n" +
                "on t1.channel_id=t4.channel_id AND t1.server_id=t4.server_id\n" +
                "LEFT JOIN (SELECT t1.channel_id,t1.server_id,COUNT(t2.char_id) old_player_number FROM(SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE TO_DAYS(action_date)=TO_DAYS(now()) AND action=4) t1 LEFT JOIN (SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE TO_DAYS(action_date)<TO_DAYS(now()) AND action=3) t2 on t1.char_id = t2.char_id GROUP BY t1.channel_id,t1.server_id) t5 -- 老玩家\n" +
                "on t1.channel_id=t5.channel_id AND t1.server_id=t5.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(DISTINCT char_id) pay_number FROM player_order WHERE TO_DAYS(recharged_date)=TO_DAYS(now()) GROUP BY channel_id,server_id) t6 -- 付费人数\n" +
                "on t1.channel_id=t6.channel_id AND t1.server_id=t6.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,SUM(amount) recharge_amount FROM player_order WHERE TO_DAYS(recharged_date)=TO_DAYS(now()) GROUP BY channel_id,server_id) t7 -- 充值金额\n" +
                "on t1.channel_id=t7.channel_id AND t1.server_id=t7.server_id\n" +
                "LEFT JOIN (SELECT t2.channel_id,t2.server_id,COUNT(t1.char_id) new_pay_number FROM(SELECT DISTINCT char_id FROM player_character WHERE TO_DAYS(first_recharge_time)=TO_DAYS(now())) t1 LEFT JOIN(SELECT DISTINCT channel_id,server_id,char_id FROM player_order WHERE TO_DAYS(recharged_date)=TO_DAYS(now())) t2 on t1.char_id=t2.char_id GROUP BY t2.channel_id,t2.server_id) t8 -- 新付费数\n" +
                "on t1.channel_id=t8.channel_id AND t1.server_id=t8.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,SUM(amount) new_recharge_amount FROM player_order WHERE TO_DAYS(recharged_date)=TO_DAYS(now()) AND char_id IN (SELECT char_id FROM player_character WHERE TO_DAYS(first_recharge_time)=TO_DAYS(now())) AND TO_DAYS(recharged_date)=TO_DAYS(now())GROUP BY channel_id,server_id) t9 -- 新充值金额\n" +
                "on t1.channel_id=t9.channel_id AND t1.server_id=t9.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(DISTINCT char_id) old_pay_number FROM player_order WHERE TO_DAYS(recharged_date)!=TO_DAYS(now()) GROUP BY channel_id,server_id) t10 -- 老付费数\n" +
                "on t1.channel_id=t10.channel_id AND t1.server_id=t10.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,SUM(amount) old_recharge_amount FROM player_order WHERE TO_DAYS(recharged_date)!=TO_DAYS(now()) GROUP BY channel_id,server_id) t11 -- 老充值金额\n" +
                "on t1.channel_id=t11.channel_id AND t1.server_id=t11.server_id\n" +
                "LEFT JOIN (SELECT t1.channel_id,t1.server_id,COUNT(DISTINCT t1.char_id) login_number FROM(SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE TO_DAYS(action_date)=TO_DAYS(now())) t1 INNER JOIN (SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE DATE_SUB(CURDATE(), INTERVAL 1 DAY) = date(action_date) AND action=3) t2 on t1.char_id=t2.char_id GROUP BY t1.channel_id,t1.server_id) t12 -- 前天注册今日登录\n" +
                "on t1.channel_id=t12.channel_id AND t1.server_id=t12.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(DISTINCT char_id) login_number FROM player_action_log WHERE DATE_SUB(CURDATE(), INTERVAL 1 DAY) = date(action_date) AND action=3 GROUP BY channel_id,server_id) t13 -- 前一天新增用户\n" +
                "on t1.channel_id=t13.channel_id AND t1.server_id=t13.server_id\n" +
                "LEFT JOIN (SELECT t1.channel_id,t1.server_id,COUNT(DISTINCT t1.char_id) login_number FROM(SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE TO_DAYS(action_date)=TO_DAYS(now())) t1 INNER JOIN (SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE DATE_SUB(CURDATE(), INTERVAL 2 DAY) = date(action_date) AND action=3) t2 on t1.char_id=t2.char_id GROUP BY t1.channel_id,t1.server_id) t14  -- 2天前注册今日登录\n" +
                "on t1.channel_id=t14.channel_id AND t1.server_id=t14.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(DISTINCT char_id) login_number FROM player_action_log WHERE DATE_SUB(CURDATE(), INTERVAL 2 DAY) = date(action_date) AND action=3 GROUP BY channel_id,server_id) t15 -- 2天前新增用户\n" +
                "on t1.channel_id=t15.channel_id AND t1.server_id=t15.server_id\n" +
                "LEFT JOIN (SELECT t1.channel_id,t1.server_id,COUNT(DISTINCT t1.char_id) login_number FROM(SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE TO_DAYS(action_date)=TO_DAYS(now())) t1 INNER JOIN (SELECT DISTINCT channel_id,server_id,char_id FROM player_action_log WHERE DATE_SUB(CURDATE(), INTERVAL 6 DAY) = date(action_date) AND action=3) t2 on t1.char_id=t2.char_id GROUP BY t1.channel_id,t1.server_id) t16  -- 6天前注册今日登录\n" +
                "on t1.channel_id=t16.channel_id AND t1.server_id=t16.server_id\n" +
                "LEFT JOIN (SELECT channel_id,server_id,COUNT(DISTINCT char_id) login_number FROM player_action_log WHERE DATE_SUB(CURDATE(), INTERVAL 6 DAY) = date(action_date) AND action=3 GROUP BY channel_id,server_id) t17 -- 6天前新增用户\n" +
                "on t1.channel_id=t17.channel_id AND t1.server_id=t17.server_id";
        return sql;
    }

    public String queryDataCollectionReport(DataCollectionSearchQuery query) {
        String sql = "SELECT  " +
                "*  " +
                "FROM  " +
                "comprehensive_report_data_collection  " +
                "where   " +
                "1=1  ";
        if (query.getChannelId() != null && !query.getChannelId().isEmpty()) {
            String ids = StringUtils.join(query.getChannelId(), ",");
            sql += "and channel_id in (" + ids + ")  ";
        }
        if (query.getServerId() != null && !query.getServerId().isEmpty()) {
            String ids = StringUtils.join(query.getServerId(), ",");
            sql += "and server_id in (" + ids + ")  ";
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql += "and report_date >= #{startDate}  ";
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql += "and report_date < #{endDate}  ";
        }
        sql += "GROUP BY   " +
                "report_date,channel_id,server_id  " +
                "order by report_date  ";
        return sql;
    }
}
