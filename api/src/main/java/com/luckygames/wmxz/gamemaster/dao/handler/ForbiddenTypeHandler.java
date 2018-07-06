package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(ForbiddenType.class)
public class ForbiddenTypeHandler implements TypeHandler<ForbiddenType> {

    @Override
    public ForbiddenType getResult(ResultSet rs, String column) throws SQLException {
        return ForbiddenType.codeOf(rs.getInt(column));
    }

    @Override
    public ForbiddenType getResult(ResultSet rs, int i) throws SQLException {
        return ForbiddenType.codeOf(rs.getInt(i));
    }

    @Override
    public ForbiddenType getResult(CallableStatement cs, int i) throws SQLException {
        return ForbiddenType.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, ForbiddenType param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, param.code());
    }

}
