package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.BaseInformation;
import com.luckygames.wmxz.gamemaster.model.view.request.BaseInformationSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class BaseInformationSqlProvider {
    public String searchAndSave(String singleDate) {
        String sql = "SELECT t2.char_id,t1.username,t2.char_name,t2.level,t2.vip_level,t1.create_time,t2.sex,t2.power,t2.faction_id,t1.channel_name,t2.server_name,t2.exp,t2.recharge_gold,t2.recharge_times,t2.first_recharge_time,t2.last_recharge_time,t2.left_gold,t2.left_special_gold,t2.used_special_gold,t2.left_coin,t2.used_coin,t1.create_ip,t1.create_mac,t1.create_device,t1.create_version FROM player t1\n" +
                "LEFT JOIN player_character t2\n" +
                "ON t1.player_id=t2.player_id\n";
        return sql;
    }
    public String searchById(Integer charId) {
        StringBuilder sql = new StringBuilder("select * from base_information where char_id="+charId);
        return sql.toString();
    }
}
