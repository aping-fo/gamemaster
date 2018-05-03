package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(LTVDaysType.class)
public class LTVDaysTypeHandler implements TypeHandler<LTVDaysType> {

    @Override
    public LTVDaysType getResult(ResultSet rs, String column) throws SQLException {
        return LTVDaysType.codeOf(rs.getInt(column));
    }

    @Override
    public LTVDaysType getResult(ResultSet rs, int i) throws SQLException {
        return LTVDaysType.codeOf(rs.getInt(i));
    }

    @Override
    public LTVDaysType getResult(CallableStatement cs, int i) throws SQLException {
        return LTVDaysType.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, LTVDaysType param, JdbcType jdbcType) throws SQLException {
        ps.setByte(i, (byte) param.code());
    }

}
