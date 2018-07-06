package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MoneyFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.MoneyFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.MoneyFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.MoneyFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("MoneyFlowService")
public class MoneyFlowServiceImpl extends BaseServiceImpl<MoneyFlowEntity> implements MoneyFlowService {
    @Autowired
    private MoneyFlowMapper MoneyFlowMapper;

    @Override
    public Mapper<MoneyFlowEntity> getMapper() {
        return MoneyFlowMapper;
    }

    @Override
    public Page<MoneyFlow> searchPage(MoneyFlowSearchQuery query) {
        return MoneyFlowMapper.searchPage(query);
    }
}
