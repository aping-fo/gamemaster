package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LevelFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.LevelFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.LevelFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.LevelFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.LevelFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface LevelFlowMapper extends LevelFlowEntityMapper<LevelFlowEntity> {
    @SelectProvider(type = LevelFlowSqlProvider.class, method = "searchPage")
    Page<LevelFlow> searchPage(LevelFlowSearchQuery query);
}
