package com.luckygames.wmxz.gamemaster.dao.handler;

import com.luckygames.wmxz.gamemaster.model.enums.UserType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(UserType.class)
public class UserTypeHandler implements TypeHandler<UserType> {

    @Override
    public UserType getResult(ResultSet rs, String column) throws SQLException {
        return UserType.codeOf(rs.getInt(column));
    }

    @Override
    public UserType getResult(ResultSet rs, int i) throws SQLException {
        return UserType.codeOf(rs.getInt(i));
    }

    @Override
    public UserType getResult(CallableStatement cs, int i) throws SQLException {
        return UserType.codeOf(cs.getInt(i));
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, UserType param, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, (byte) param.code());
    }

}
