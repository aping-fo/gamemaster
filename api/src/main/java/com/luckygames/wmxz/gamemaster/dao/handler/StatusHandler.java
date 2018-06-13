package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Status.class)
public class StatusHandler implements TypeHandler<Status> {

    @Override
    public Status getResult(ResultSet rs, String column) throws SQLException {
        return Status.codeOf(rs.getInt(column));
    }

    @Override
    public Status getResult(ResultSet rs, int i) throws SQLException {
        return Status.codeOf(rs.getInt(i));
    }

    @Override
    public Status getResult(CallableStatement cs, int i) throws SQLException {
        return Status.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, Status param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, (byte) param.code());
    }

}
