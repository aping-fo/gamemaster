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
        String date = "now()";
        if (StringUtils.isNotBlank(query.getDate())) {
            date = query.getDate();
        }
        int day = 3;
        if (query.getDay() != null) {
            day = query.getDay();
        }
        StringBuilder sql = new StringBuilder("SELECT" +
                " LEVEL," +
                " count(*) lossNumber," +
                " count(*)/(SELECT count(*) FROM player_action_log t1" +
                " WHERE " +
                " DATE_FORMAT( update_time, '%Y-%m-%d' ) = DATE_SUB('" + date + "', INTERVAL " + day + " DAY )" +
                " AND NOT EXISTS(SELECT player_id FROM player_action_log where player_id=t1.player_id " +
                " AND DATE_FORMAT( update_time, '%Y-%m-%d' )>DATE_SUB('" + date + "', INTERVAL " + day + " DAY ) " +
                " AND DATE_FORMAT( update_time, '%Y-%m-%d' )<='" + date + "')");
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
        sql.append(" ) lossRate" +
                " FROM" +
                " player_action_log t1" +
                " WHERE " +
                " DATE_FORMAT( update_time, '%Y-%m-%d' ) = DATE_SUB('" + date + "', INTERVAL " + day + " DAY )" +
                " AND NOT EXISTS(SELECT player_id FROM player_action_log where player_id=t1.player_id " +
                " AND DATE_FORMAT( update_time, '%Y-%m-%d' )>DATE_SUB('" + date + "', INTERVAL " + day + " DAY ) " +
                " AND DATE_FORMAT( update_time, '%Y-%m-%d' )<='" + date + "')");
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
        String date = "now()";
        if (StringUtils.isNotBlank(query.getDate())) {
            date = query.getDate();
        }
        StringBuilder sql = new StringBuilder(" SELECT" +
                " DATE_FORMAT('" + date + "','%Y-%m-%d' ) date," +
                " t1.LEVEL," +
                " IFNULL(count(*),0) userNumber," +
                " FORMAT(IFNULL(count(*)/(" +
                " SELECT count(*) FROM player_action_log t1" +
                " where DATE_FORMAT( update_time, '%Y-%m-%d' ) = '" + date + "'");
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
        sql.append( "),0),4) userRate," +
                " IFNULL(t2.activeNumber,0) activeNumber," +
                " FORMAT(IFNULL(t2.activeNumber/(" +
                " SELECT count(*) FROM player_action_log t1 WHERE DATE_FORMAT( update_time, '%Y-%m-%d' ) = '" + date + "' AND online_time >= 4");
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
        sql.append( " ),0),4) activeRate," +
                " IFNULL(t3.payNumber,0) payNumber," +
                " FORMAT(IFNULL(t3.payNumber/(" +
                " SELECT count(*) payNumber FROM player_action_log t1 WHERE DATE_FORMAT( update_time, '%Y-%m-%d' ) = '" + date + "' AND action=21");
        sql.append("),0),4) payRate" +
                " FROM" +
                " player_action_log t1" +
                " LEFT JOIN (SELECT DISTINCT LEVEL,count(*) activeNumber FROM player_action_log t1 WHERE DATE_FORMAT( update_time, '%Y-%m-%d' ) = '" + date + "' AND online_time >= 4 GROUP BY LEVEL)t2 ON t1.LEVEL=t2.LEVEL " +
                " LEFT JOIN (SELECT DISTINCT LEVEL,count(*) payNumber FROM player_action_log t1 WHERE DATE_FORMAT( update_time, '%Y-%m-%d' ) = '" + date + "' AND action=21 GROUP BY LEVEL)t3 ON t1.LEVEL=t3.LEVEL" +
                " where DATE_FORMAT( update_time, '%Y-%m-%d' ) = '" + date + "'");
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
            sql.append(" and t1.level>=#{level}");
        }
        sql.append(" GROUP BY LEVEL");
        return sql.toString();
    }

    public String searchLeProduceExpend(PlayerActionLogSearchQuery query) {
        int type = 22;
        if (query.getType() != null) {
            type = query.getType();
        }
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
                " action = (" + type + "+1) " +
                " GROUP BY" +
                " DATE_FORMAT( update_time, '%Y-%m-%d' )" +
                " ) t2" +
                " ON DATE_FORMAT( t1.update_time, '%Y-%m-%d' )=DATE_FORMAT( t2.update_time, '%Y-%m-%d' )" +
                " RIGHT JOIN");
        if (StringUtils.isBlank(query.getEndDate()) && StringUtils.isBlank(query.getStartDate())) {
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=(select last_day(curdate())) AND datelist>=(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t3");
        } else if (StringUtils.isNotBlank(query.getEndDate()) && StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=#{endDate} AND datelist>=#{startDate}) t3");
        } else if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=#{endDate} AND datelist>=(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t3");
        } else if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" (SELECT datelist FROM calendar t1 WHERE datelist<=(select last_day(curdate())) AND datelist>=#{startDate}) t3");
        }
        sql.append(" ON DATE_FORMAT( t1.update_time, '%Y-%m-%d' )=t3.datelist WHERE action = " + type + " ");
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
