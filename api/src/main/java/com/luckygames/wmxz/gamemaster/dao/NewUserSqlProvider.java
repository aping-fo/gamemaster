package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class NewUserSqlProvider {
    public String searchPage(NewUserSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t2.datelist update_time,IFNULL(t1.new_pay_number,0) first_charge_count,IFNULL(t1.role_number,0) new_user_count,IFNULL(t1.recharge_amount,0) new_pay_sum,IFNULL(t1.pay_arpu,0) new_pay_rate FROM comprehensive_report_data_collection t1 ");
        sql.append("RIGHT JOIN ");
        sql.append("(SELECT datelist FROM calendar WHERE 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and DATE_FORMAT(datelist,'%Y-%m-%d') >= #{startDate}  ");
        } else {
            sql.append(" and DATE_FORMAT(datelist,'%Y-%m-%d')>= DATE_SUB(CURDATE(), INTERVAL 30 DAY)  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and DATE_FORMAT(datelist,'%Y-%m-%d') <= #{endDate}  ");
        } else {
            sql.append(" and DATE_FORMAT(datelist,'%Y-%m-%d')<=now()  ");
        }
        sql.append(") t2 ON DATE_FORMAT(t1.report_date,'%Y-%m-%d')=t2.datelist ");
        if (query.getChannelId() != null ) {
            sql.append(" and channel_id = #{channelId}");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        if (query.getPackageId()!=null) {
            sql.append(" and package_id = #{packageId}");
        }
        sql.append(" ORDER BY update_time DESC");
        return sql.toString();
    }
}
