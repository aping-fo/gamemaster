package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.BroadcastStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(BroadcastStatus.class)
public class BroadcastStatusHandler implements TypeHandler<BroadcastStatus> {

    @Override
    public BroadcastStatus getResult(ResultSet rs, String column) throws SQLException {
        return BroadcastStatus.codeOf(rs.getInt(column));
    }

    @Override
    public BroadcastStatus getResult(ResultSet rs, int i) throws SQLException {
        return BroadcastStatus.codeOf(rs.getInt(i));
    }

    @Override
    public BroadcastStatus getResult(CallableStatement cs, int i) throws SQLException {
        return BroadcastStatus.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, BroadcastStatus param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, param.code());
    }

}
