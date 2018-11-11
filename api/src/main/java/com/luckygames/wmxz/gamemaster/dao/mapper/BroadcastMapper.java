package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.BroadcastEntity;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.BroadcastSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Broadcast;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface BroadcastMapper extends BroadcastEntityMapper<BroadcastEntity> {
    @SelectProvider(type = BroadcastSqlProvider.class, method = "queryBroadcast")
    List<Broadcast> searchPage(BroadcastSearchQuery query);

    @Select("select * from broadcast where id=#{id}")
    Broadcast searchById(@Param("id") Long id);

    @Select("select * from broadcast where broadcast_type = 3 order by update_time limit 1")
    Broadcast searchTemplate();
}