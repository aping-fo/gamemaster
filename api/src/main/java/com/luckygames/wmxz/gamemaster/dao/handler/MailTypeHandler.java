package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.MailType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(MailType.class)
public class MailTypeHandler implements TypeHandler<MailType> {

    @Override
    public MailType getResult(ResultSet rs, String column) throws SQLException {
        return MailType.codeOf(rs.getInt(column));
    }

    @Override
    public MailType getResult(ResultSet rs, int i) throws SQLException {
        return MailType.codeOf(rs.getInt(i));
    }

    @Override
    public MailType getResult(CallableStatement cs, int i) throws SQLException {
        return MailType.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, MailType param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, param.code());
    }

}
