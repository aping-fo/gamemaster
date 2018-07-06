package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RankingsFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.RankingsFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RankingsFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RankingsFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.RankingsFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface RankingsFlowMapper extends RankingsFlowEntityMapper<RankingsFlowEntity> {
    @SelectProvider(type = RankingsFlowSqlProvider.class, method = "searchPage")
    Page<RankingsFlow> searchPage(RankingsFlowSearchQuery query);
}
