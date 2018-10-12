package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntity;
import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.DiamondsLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.DiamondsLog;
import com.luckygames.wmxz.gamemaster.model.view.request.DiamondsLogSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface DiamondsLogMapper extends DiamondLogsEntityMapper<DiamondLogsEntity> {
    @SelectProvider(type = DiamondsLogSqlProvider.class, method = "searchPage")
    List<DiamondsLog> searchPage(DiamondsLogSearchQuery query);

    @Select("select * from DiamondsLog where id=#{id}")
    DiamondsLog searchById(@Param("id") Long id);
}