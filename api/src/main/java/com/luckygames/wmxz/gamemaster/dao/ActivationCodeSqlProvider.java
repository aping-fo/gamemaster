package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ActivationCodeSqlProvider {
    public String add(ActivationCode activationCode) {
        StringBuilder sql = new StringBuilder("insert into activation_code(gift_bag,number,frequency,invalid_time,overdue_time,create_time,update_time) values(");
//            sql.append("'"+activationCode.getGiftBag()+"',"+activationCode.getNumber()+","+activationCode.getFrequency()+",'"+activationCode.getInvalidTime()+"','"+activationCode.getOverdueTime()+"',now(),now())");
        return sql.toString();
    }

    public String searchPage(ActivationCodeSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT ac.*,s.server_name,se.server_name useServerName FROM activation_code ac left join server s on ac.server_id=s.server_id left join server se on ac.use_server_id=se.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getName())) {
            sql.append(" and ac.name like \"%\"#{name}\"%\" ");
        }
        if (StringUtils.isNotBlank(query.getRemarks())) {
            sql.append(" and ac.remarks like \"%\"#{remarks}\"%\" ");
        }
        sql.append(" order by ac.create_time desc");
        return sql.toString();
    }

    public String exportPage(ActivationCodeSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT ac.*,s.server_name,se.server_name useServerName FROM activation_code ac left join server s on ac.server_id=s.server_id left join server se on ac.use_server_id=se.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getRemarks())) {
            sql.append(" and ac.remarks = #{remarks}");
        }
        sql.append(" order by ac.create_time desc");
        return sql.toString();
    }
}
