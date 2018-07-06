package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.OtherFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.OtherFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.OtherFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.OtherFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("OtherFlowService")
public class OtherFlowServiceImpl extends BaseServiceImpl<OtherFlowEntity> implements OtherFlowService {
    @Autowired
    private OtherFlowMapper OtherFlowMapper;

    @Override
    public Mapper<OtherFlowEntity> getMapper() {
        return OtherFlowMapper;
    }

    @Override
    public Page<OtherFlow> searchPage(OtherFlowSearchQuery query) {
        return OtherFlowMapper.searchPage(query);
    }
}
