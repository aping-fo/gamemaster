package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PropFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PropFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.PropFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("PropFlowService")
public class PropFlowServiceImpl extends BaseServiceImpl<PropFlowEntity> implements PropFlowService {
    @Autowired
    private PropFlowMapper PropFlowMapper;

    @Override
    public Mapper<PropFlowEntity> getMapper() {
        return PropFlowMapper;
    }

    @Override
    public Page<PropFlow> searchPage(PropFlowSearchQuery query) {
        return PropFlowMapper.searchPage(query);
    }
}
