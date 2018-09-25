package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;
import org.apache.commons.lang3.StringUtils;

public class GoodsRecoverySqlProvider {
    public String searchPage(GoodsRecoverySearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT gr.*,s.server_name FROM goods_recovery gr left join server s on gr.server_id=s.server_id where 1=1 ");
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and gr.update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and gr.update_time < #{endDate}  ");
        }
        if (query.getGoodId() != null) {
            sql.append(" and gr.goods like '%" + query.getGoodId() + "%' ");
        }
        sql.append(" order by gr.update_time desc");
        return sql.toString();
    }
}
