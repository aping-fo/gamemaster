package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.Ranking;
import com.luckygames.wmxz.gamemaster.model.view.request.RankingSearchQuery;

public interface RankingService {
    Page<Ranking> searchPage(RankingSearchQuery query);
}
