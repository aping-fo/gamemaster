package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.IntegratedOnlineMapper;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnline;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("IntegratedOnlineService")
public class IntegratedOnlineServiceImpl extends BaseServiceImpl<IntegratedOnlineEntity> implements IntegratedOnlineService {
    @Autowired
    private IntegratedOnlineMapper integratedOnlineMapper;

    @Override
    public Mapper<IntegratedOnlineEntity> getMapper() {
        return integratedOnlineMapper;
    }

    @Override
    public List<IntegratedOnline> searchPage(IntegratedOnlineSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return integratedOnlineMapper.searchPage(query);
    }
}
