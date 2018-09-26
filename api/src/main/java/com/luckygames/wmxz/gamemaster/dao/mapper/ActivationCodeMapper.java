package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface ActivationCodeMapper extends ActivationCodeEntityMapper<ActivationCodeEntity> {
    @SelectProvider(type = ActivationCodeSqlProvider.class, method = "searchPage")
    Page<ActivationCode> searchPage(ActivationCodeSearchQuery query);

    @SelectProvider(type = ActivationCodeSqlProvider.class, method = "add")
    Page<ActivationCode> add(ActivationCode activationCode);

    @Select("select * from activation_code where id = #{id}")
    ActivationCode selectById(@Param("id") Long id);

    @Select("select * from activation_code where (server_id = #{serverId} or server_id=0) and now()<=overdue_time and (use_player_id is null or universal=1)")
    List<ActivationCode> searchByServerId(@Param("serverId") Long serverId);

    @Select("SELECT * from activation_code order by create_time desc LIMIT 1")
    ActivationCode searchLast();

    @Select("SELECT * from activation_code where remarks=#{remarks}")
    Page<ActivationCode> search(@Param("remarks") String remarks);
}
