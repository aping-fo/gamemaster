package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RankingsFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.RankingsFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RankingsFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.RankingsFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("RankingsFlowService")
public class RankingsFlowServiceImpl extends BaseServiceImpl<RankingsFlowEntity> implements RankingsFlowService {
    @Autowired
    private RankingsFlowMapper RankingsFlowMapper;

    @Override
    public Mapper<RankingsFlowEntity> getMapper() {
        return RankingsFlowMapper;
    }

    @Override
    public Page<RankingsFlow> searchPage(RankingsFlowSearchQuery query) {
        return RankingsFlowMapper.searchPage(query);
    }
}
