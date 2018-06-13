package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.AngleNumberAnalysisEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.AngleNumberAnalysisMapper;
import com.luckygames.wmxz.gamemaster.model.entity.AngleNumberAnalysis;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("AngleNumberAnalysisService")
public class AngleNumberAnalysisServiceImpl extends BaseServiceImpl<AngleNumberAnalysisEntity> implements AngleNumberAnalysisService {
    @Autowired
    private AngleNumberAnalysisMapper AngleNumberAnalysisMapper;

    @Override
    public Mapper<AngleNumberAnalysisEntity> getMapper() {
        return AngleNumberAnalysisMapper;
    }

    @Override
    public Page<AngleNumberAnalysis> searchPage(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> AngleNumberAnalysisMapper.searchPage(query));

    }
}
