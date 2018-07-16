package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.BroadcastEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.BroadcastNewEntity;
import com.luckygames.wmxz.gamemaster.dao.BroadcastNewSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.BroadcastNew;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastNewSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface BroadcastNewMapper extends BroadcastEntityMapper<BroadcastNewEntity> {
    @SelectProvider(type = BroadcastNewSqlProvider.class, method = "queryBroadcastNew")
    List<BroadcastNew> searchPage(BroadcastNewSearchQuery query);

    @Select("select * from broadcast_new where id=#{id}")
    BroadcastNew searchById(@Param("id") Long id);
}