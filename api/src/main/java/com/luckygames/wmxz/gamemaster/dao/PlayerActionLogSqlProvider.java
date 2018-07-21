package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerActionLogSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class PlayerActionLogSqlProvider extends PlayerActionLogEntitySqlProvider {
    public String queryEquipmentCountReport(CommonSearchQuery query) {
        String sql = "SELECT t1.create_time action_date FROM player_action_log t1 " +
                "LEFT JOIN " +
                "player_character t2 ON t1.player_id=t2.player_id " +
                "LEFT JOIN " +
                "player t3 ON t1.player_id=t3.player_id" +
                "LEFT JOIN " +
                "(SELECT max(create_time) last_login_time,player_id FROM player_action_log WHERE action=4 GROUP BY player_id) t4 ON t1.player_id=t4.player_id" +
                "GROUP BY t1.player_id";
        return sql;
    }

    public String searchLeaveLoss(PlayerActionLogSearchQuery query) {
        if (!StringUtils.isNotBlank(query.getDate())) {
            query.setDate("now()");
        }
        if(query.getDay()==null){
            query.setDay(3);
        }
        StringBuilder sql = new StringBuilder("SELECT" +
                " LEVEL," +
                " count(*) lossNumber," +
                " count(*)/(SELECT count(*) FROM player_character) lossRate" +
                " FROM" +
                " player_action_log t1" +
                " WHERE " +
                " DATE_FORMAT( update_time, '%Y-%m-%d' )  = DATE_SUB(#{date}, INTERVAL #{day} DAY )" +
                " AND NOT EXISTS(SELECT player_id FROM player_action_log where player_id=t1.player_id " +
                " AND DATE_FORMAT( update_time, '%Y-%m-%d' )>DATE_SUB(#{date}, INTERVAL #{day} DAY ) " +
                " AND DATE_FORMAT( update_time, '%Y-%m-%d' )<=#{date})");
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" AND server_id in (" + ids + ")  ");
        }
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" AND EXISTS(SELECT player_id from player where player_id=t1.player_id and channel_id in (" + ids + ") ) ");
        }
        if (query.getPlatform() != null) {
            sql.append(" AND EXISTS(SELECT player_id from player where player_id=t1.player_id and platform =#{platform} ) ");
        }
        sql.append(" GROUP BY LEVEL");
        return sql.toString();
    }

    public String searchLeaveDistribution(PlayerActionLogSearchQuery query) {
        if (!StringUtils.isNotBlank(query.getDate())) {
            query.setDate("now()");
        }
        StringBuilder sql = new StringBuilder(" SELECT" +
                " DATE_FORMAT(#{date},'%Y-%m-%d' ) date," +
                " LEVEL," +
                " count(*) userNumber," +
                " count(*)/(SELECT count(*) FROM player_character) userRate," +
                " count(t2.player_id) activeNumber," +
                " count(t2.player_id)/(SELECT count(*) FROM player_character) activeRate," +
                " count(t3.player_id) payNumber," +
                " count(t3.player_id)/(SELECT count(*) FROM player_character) payRate" +
                " FROM" +
                " player_action_log t1" +
                " LEFT JOIN (SELECT DISTINCT player_id FROM player_action_log t1 WHERE DATE_FORMAT( update_time, '%Y-%m-%d' ) = #{date} AND online_time >= 4)t2 ON t1.player_id=t2.player_id " +
                " LEFT JOIN (SELECT DISTINCT player_id FROM player_action_log t1 WHERE DATE_FORMAT( update_time, '%Y-%m-%d' ) = #{date} AND action=21)t3 ON t1.player_id=t3.player_id" +
                " where DATE_FORMAT( update_time, '%Y-%m-%d' ) = #{date}");
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and server_id in (" + ids + ")  ");
        }
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and EXISTS(SELECT player_id from player where player_id=t1.player_id and channel_id in (" + ids + ") ) ");
        }
        if (query.getPlatform() != null) {
            sql.append(" and EXISTS(SELECT player_id from player where player_id=t1.player_id and platform =#{platform} ) ");
        }
        if (query.getLevel() != null) {
            sql.append(" and level>=#{level}");
        }
        sql.append(" GROUP BY LEVEL");
        return sql.toString();
    }

    public String searchLeProduceExpend(PlayerActionLogSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT" +
                " t3.datelist date," +
                " action," +
                " IFNULL(sum( action_value ),0) produceValue," +
                " IFNULL(count(*),0) produceNumber," +
                " IFNULL(sum( action_value )/count(*),0) avgProduce," +
                " IFNULL(t2.consumeValue,0) consumeValue," +
                " IFNULL(t2.consumeNumber,0) consumeNumber," +
                " IFNULL(t2.avgConsume,0) avgConsume," +
                " IFNULL((sum( action_value )-t2.consumeValue)/sum( action_value ),0) retentionRate" +
                " FROM" +
                " player_action_log t1" +
                " LEFT JOIN (" +
                " SELECT" +
                " DATE_FORMAT( update_time, '%Y-%m-%d' ) update_time," +
                " sum( action_value ) consumeValue," +
                " count(*) consumeNumber," +
                " sum( action_value )/count(*) avgConsume" +
                " FROM" +
                " player_action_log t1" +
                " WHERE" +
                " action = (#{type}+1) " +
                " GROUP BY" +
                " DATE_FORMAT( update_time, '%Y-%m-%d' )" +
                " ) t2" +
                " ON DATE_FORMAT( t1.update_time, '%Y-%m-%d' )=DATE_FORMAT( t2.update_time, '%Y-%m-%d' )" +
                " RIGHT JOIN");
        if (StringUtils.isBlank(query.getEndDate())&&StringUtils.isBlank(query.getStartDate())) {
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=(select last_day(curdate())) AND datelist>=(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t3");
        }else if(StringUtils.isNotBlank(query.getEndDate())&&StringUtils.isNotBlank(query.getStartDate())){
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=#{endDate} AND datelist>=#{startDate}) t3");
        }else if(StringUtils.isNotBlank(query.getEndDate())){
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=#{endDate} AND datelist>=(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t3");
        }else if(StringUtils.isNotBlank(query.getStartDate())){
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=(select last_day(curdate())) AND datelist>=#{startDate}) t3");
        }
        sql.append(" ON DATE_FORMAT( t1.update_time, '%Y-%m-%d' )=t3.datelist WHERE action = #{type} ");
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append("and EXISTS(SELECT player_id FROM player_character where player_id=t1.player_id and server_id in (" + ids + ") ) ");
        }
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and EXISTS(SELECT player_id from player where player_id=t1.player_id and channel_id in (" + ids + ") ) ");
        }
        if (query.getPackageId() != null) {
            sql.append(" and EXISTS(SELECT player_id from player_character where player_id=t1.player_id and package_id =#{packageId} ) ");
        }
        sql.append(" GROUP BY t3.datelist");
        return sql.toString();
    }
}
