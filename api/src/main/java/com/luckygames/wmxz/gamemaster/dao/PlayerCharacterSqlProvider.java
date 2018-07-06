package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class PlayerCharacterSqlProvider extends PlayerCharacterEntitySqlProvider {
    public String queryCharacterDailyReport(PlayerCharacterSearchQuery query) {
        StringBuilder sql = new StringBuilder(" SELECT ")
                .append(" pc.*, ")
                .append(" cd.login_times, ")
                .append(" cd.login_days, ")
                .append(" cd.online_time, ")
                .append(" cd.recharge_amount ")
                .append(" FROM ")
                .append(" player_character pc ")
                .append(" INNER JOIN ( ")
                .append(" SELECT ")
                .append(" char_id, ")
                .append(" sum( login_times ) login_times, ")
                .append(" count( login_times ) login_days, ")
                .append(" sum( online_time ) online_time, ")
                .append(" sum( recharge_amount ) recharge_amount  ")
                .append(" FROM ")
                .append(" character_daily cd  ")
                .append(" WHERE 1=1 ");

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and cd.report_date >= #{startDate} ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and cd.report_date < #{endDate} ");
        }

        sql.append(" GROUP BY ")
                .append(" char_id  ")
                .append(" ) cd ON pc.char_id = cd.char_id ");

        sql.append(" INNER JOIN player p on pc.player_id = p.player_id ")
                .append(" WHERE 1=1 ");

        if (query.getSearchKey() != null && StringUtils.isNotBlank(query.getKeyword())) {
            if (query.getSearchKey() == 1) {
                sql.append(" and pc.char_name like \"%\"#{keyword}\"%\" ");
            } else if (query.getSearchKey() == 2) {
                sql.append(" and (p.username like \"%\"#{keyword}\"%\" or p.mobile like \"%\"#{keyword}\"%\" or p.id_card like \"%\"#{keyword}\"%\" )");
            } else if (query.getSearchKey() == 3) {
                sql.append(" and pc.char_id = #{keyword} ");
            }
        }
        if (StringUtils.isNotBlank(query.getSex())) {
            sql.append(" and pc.sex = #{sex} ");
        }

        if (StringUtils.isNotBlank(query.getJob())) {
            sql.append(" and pc.job = #{job} ");
        }

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and p.channel_id in (").append(ids).append(") ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and pc.server_id in (").append(ids).append(") ");
        }

        return sql.toString();
    }

    public String searchPlayerCharacter(PlayerCharacterSearchQuery query) {
        StringBuilder sql = new StringBuilder(" select ")
                .append(" pc.* ")
                .append(" ,p.username username ")
                .append(" ,p.channel_id channel_id")
                .append(" ,p.channel_name channel_name")
                .append(" from player_character pc ")
                .append(" inner join player p on pc.player_id=p.player_id ")
                .append(" where 1=1 ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append("and p.channel_id in (" + ids + ")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append("and pc.server_id in (" + ids + ")  ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append("and pc.create_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append("and pc.create_time < #{endDate}  ");
        }

        if (query.getSearchKey() != null && StringUtils.isNotBlank(query.getKeyword())) {
            if (query.getSearchKey() == 1) {
                sql.append(" and pc.char_name like \"%\"#{keyword}\"%\" ");
            } else if (query.getSearchKey() == 2) {
                sql.append(" and (p.username like \"%\"#{keyword}\"%\" or p.mobile like \"%\"#{keyword}\"%\" or p.id_card like \"%\"#{keyword}\"%\" )");
            } else if (query.getSearchKey() == 3) {
                sql.append(" and pc.char_id = #{keyword} ");
            }
        }

        if (StringUtils.isNotBlank(query.getSex())) {
            sql.append(" and pc.sex = #{sex} ");
        }

        if (StringUtils.isNotBlank(query.getJob())) {
            sql.append(" and pc.job = #{job} ");
        }

        if (query.getLevelStart() != null && query.getLevelStart() > 0) {
            sql.append(" and pc.level >= #{levelStart} ");
        }
        if (query.getLevelEnd() != null && query.getLevelEnd() > 0) {
            sql.append(" and pc.level <= #{levelEnd} ");
        }

        if (query.getGoldStart() != null && query.getGoldStart() > 0) {
            sql.append(" and pc.left_gold >= #{goldStart} ");
        }
        if (query.getGoldEnd() != null && query.getGoldEnd() > 0) {
            sql.append(" and pc.left_gold <= #{goldEnd} ");
        }


        return sql.toString();

    }


    public String updateStatus(Long playerId, Integer operateStatus) {
        StringBuilder sql = new StringBuilder("update player_character set operate_status= " + operateStatus + " where player_id = " + playerId);
        return sql.toString();
    }
}
