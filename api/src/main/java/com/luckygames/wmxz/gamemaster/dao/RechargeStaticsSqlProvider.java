package com.luckygames.wmxz.gamemaster.dao;

public class RechargeStaticsSqlProvider {
    /**
     * 区服充值列表，TODO 需求不明确，暂时这么多
     * @return
     */
    public String queryServerRechargeTotalReportFromOrder() {
        String sql = "SELECT  " +
                "po.channel_id,  " +
                "po.server_id,  " +
                "sum(po.amount) rechargeAmount,  " +
                "sum(po.gold_quantity) goldSum  " +
                "FROM  " +
                "player_order po  " +
                "GROUP BY   " +
                "po.channel_id,  " +
                "po.server_id  " +
                "order by po.channel_id,po.server_id  ";
        return sql;
    }
}
