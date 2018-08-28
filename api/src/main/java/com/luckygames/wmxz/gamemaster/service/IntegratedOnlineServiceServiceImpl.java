package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineServiceEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.IntegratedOnlineServiceMapper;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnlineService;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineServiceSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("IntegratedOnlineServiceService")
public class IntegratedOnlineServiceServiceImpl extends BaseServiceImpl<IntegratedOnlineServiceEntity> implements IntegratedOnlineServiceService {
    @Autowired
    private IntegratedOnlineServiceMapper IntegratedOnlineServiceMapper;

    @Override
    public Mapper<IntegratedOnlineServiceEntity> getMapper() {
        return IntegratedOnlineServiceMapper;
    }

    @Override
    public Page<IntegratedOnlineService> searchPage(IntegratedOnlineServiceSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> IntegratedOnlineServiceMapper.searchPage(query));
    }
}
