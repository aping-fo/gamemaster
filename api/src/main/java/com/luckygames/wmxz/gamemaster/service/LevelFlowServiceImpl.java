package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LevelFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.LevelFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.LevelFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.LevelFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("LevelFlowService")
public class LevelFlowServiceImpl extends BaseServiceImpl<LevelFlowEntity> implements LevelFlowService {
    @Autowired
    private LevelFlowMapper LevelFlowMapper;

    @Override
    public Mapper<LevelFlowEntity> getMapper() {
        return LevelFlowMapper;
    }

    @Override
    public Page<LevelFlow> searchPage(LevelFlowSearchQuery query) {
        return LevelFlowMapper.searchPage(query);
    }
}
