package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.RankingEntity;
import com.luckygames.wmxz.gamemaster.dao.RankingEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RankingSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Ranking;
import com.luckygames.wmxz.gamemaster.model.view.request.RankingSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RankingMapper extends RankingEntityMapper<RankingEntity> {
    @SelectProvider(type = RankingSqlProvider.class, method = "searchPage")
    List<Ranking> searchPage(RankingSearchQuery query);
}
