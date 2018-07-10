package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntity;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenlogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.ForbiddenLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

public interface ForbiddenLogMapper extends ForbiddenLogEntityMapper<ForbiddenLogEntity> {
    @SelectProvider(type = ForbiddenlogSqlProvider.class, method = "queryFobiddenLog")
    Page<ForbiddenLog> queryFobiddenLog(ForbiddenSearchQuery query);

    @Update("update forbidden_log f set status =-1, update_time=now() where char_id = #{charId}")
    void removeFobidden(Long charId);

    @Select("select * from forbidden_log where status=1 and char_id=#{charId}")
    ForbiddenLog searchByCharId(@Param("charId") Long charId);
}
