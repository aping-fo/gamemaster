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
        StringBuilder sql = new StringBuilder("SELECT * FROM activation_code where 1=1 ");
        if (StringUtils.isNotBlank(query.getName())) {
            sql.append(" and name like \"%\"#{name}\"%\" ");
        }
        return sql.toString();
    }
}
