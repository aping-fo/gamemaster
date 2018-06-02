package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenOperationType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(ForbiddenOperationType.class)
public class ForbiddenOperationTypeHandler implements TypeHandler<ForbiddenOperationType> {

    @Override
    public ForbiddenOperationType getResult(ResultSet rs, String column) throws SQLException {
        return ForbiddenOperationType.codeOf(rs.getInt(column));
    }

    @Override
    public ForbiddenOperationType getResult(ResultSet rs, int i) throws SQLException {
        return ForbiddenOperationType.codeOf(rs.getInt(i));
    }

    @Override
    public ForbiddenOperationType getResult(CallableStatement cs, int i) throws SQLException {
        return ForbiddenOperationType.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, ForbiddenOperationType param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, (byte) param.code());
    }

}
