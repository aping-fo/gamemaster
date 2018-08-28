package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.mapper.RankingMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Ranking;
import com.luckygames.wmxz.gamemaster.model.view.request.RankingSearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rankingService")
public class RankingServiceImpl implements RankingService {
    @Autowired
    private RankingMapper rankingMapper;

    @Override
    public Page<Ranking> searchPage(RankingSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rankingMapper.searchPage(query));
    }


}