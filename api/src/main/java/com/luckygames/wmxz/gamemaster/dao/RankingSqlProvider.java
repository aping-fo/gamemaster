package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RankingSearchQuery;

public class RankingSqlProvider {
    public String searchPage(RankingSearchQuery query) {
        if(query.getType()==null){
            query.setType(1);
        }
        StringBuilder sql = new StringBuilder("select t1.*,t2.char_name playerName FROM ranking t1 LEFT JOIN player_character t2 on t1.player_id=t2.player_id where type = #{type}");
        if (query.getServerId() != null ) {
            sql.append(" and EXISTS(SELECT player_id FROM player_character where player_id=t1.player_id and server_id = #{serverId}) ");
        }
        if(query.getDate()!=null){
            sql.append(" and DATE_FORMAT(t1.update_time,'%Y-%m-%d %H')= DATE_FORMAT(CONCAT(#{date},' ',#{hour}),'%Y-%m-%d %H')");
        }else{
            sql.append(" and DATE_FORMAT(t1.update_time,'%Y-%m-%d %H')= DATE_FORMAT(now(),'%Y-%m-%d %H')");
        }
        return sql.toString();
    }
}
