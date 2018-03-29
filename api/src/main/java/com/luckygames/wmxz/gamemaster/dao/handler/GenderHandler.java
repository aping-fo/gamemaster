package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.Gender;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Gender.class)
public class GenderHandler implements TypeHandler<Gender> {

    @Override
    public Gender getResult(ResultSet rs, String column) throws SQLException {
        return Gender.codeOf(rs.getInt(column));
    }

    @Override
    public Gender getResult(ResultSet rs, int i) throws SQLException {
        return Gender.codeOf(rs.getInt(i));
    }

    @Override
    public Gender getResult(CallableStatement cs, int i) throws SQLException {
        return Gender.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, Gender param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, param.code());
    }

}
