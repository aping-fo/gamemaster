package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ActivationCodeSqlProvider {
    public String add(ActivationCode activationCode) {
        StringBuilder sql = new StringBuilder("insert into activation_code(gift_bag,number,frequency,invalid_time,overdue_time,create_time,update_time) values(");
            sql.append("'"+activationCode.getGiftBag()+"',"+activationCode.getNumber()+","+activationCode.getFrequency()+",'"+activationCode.getInvalidTime()+"','"+activationCode.getOverdueTime()+"',now(),now())");
            return sql.toString();
    }

    public String searchPage(ActivationCodeSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT * FROM activation_code where 1=1 ");
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (").append(ids).append(")  ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and update_time < #{endDate}  ");
        }
        return sql.toString();
    }
}
