package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.Prohibition;
import com.luckygames.wmxz.gamemaster.model.view.request.ProhibitionSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ProhibitionSqlProvider {
    public String searchPage(ProhibitionSearchQuery query) {
        StringBuffer sql = new StringBuffer("SELECT t1.*,t2.server_name FROM account_log t1 left join server t2 on t1.server_id=t2.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and t1.update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and t1.update_time < #{endDate}  ");
        }
//        if (query.getServerId()!=null) {
//            sql.append(" and t1.server_id = #{serverId}  ");
//        }
        sql.append(" order by t1.create_time desc");
        return sql.toString();
    }

    public String checkInfo(Prohibition prohibition) {
        StringBuffer sql = new StringBuffer("SELECT t1.* FROM prohibition t1 where 1=1 ");
        if (prohibition.getClosureWay()!=null) {
            sql.append(" and t1.closure_way = #{closureWay}  ");
        }
        if (StringUtils.isNotBlank(prohibition.getClosureAccount())) {
            sql.append(" and t1.closure_account = #{closureAccount}  ");
        }
        if (prohibition.getServerId()!=null) {
            sql.append(" and t1.server_id = #{serverId}  ");
        }
        return sql.toString();
    }
}
