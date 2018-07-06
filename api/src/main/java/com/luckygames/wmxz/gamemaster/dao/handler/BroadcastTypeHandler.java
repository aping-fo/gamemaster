package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.BroadcastType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(BroadcastType.class)
public class BroadcastTypeHandler implements TypeHandler<BroadcastType> {

    @Override
    public BroadcastType getResult(ResultSet rs, String column) throws SQLException {
        return BroadcastType.codeOf(rs.getInt(column));
    }

    @Override
    public BroadcastType getResult(ResultSet rs, int i) throws SQLException {
        return BroadcastType.codeOf(rs.getInt(i));
    }

    @Override
    public BroadcastType getResult(CallableStatement cs, int i) throws SQLException {
        return BroadcastType.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, BroadcastType param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, param.code());
    }

}
