package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.BroadcastNewEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.BroadcastNewMapper;
import com.luckygames.wmxz.gamemaster.model.entity.BroadcastNew;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastNewSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("broadcastNewService")
public class BroadcastNewServiceImpl extends BaseServiceImpl<BroadcastNewEntity> implements BroadcastNewService {

    @Autowired
    private BroadcastNewMapper broadcastNewMapper;

    @Override
    public Mapper<BroadcastNewEntity> getMapper() {
        return this.broadcastNewMapper;
    }

    @Override
    public Page<BroadcastNew> searchPage(BroadcastNewSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> broadcastNewMapper.searchPage(query));

    }

    @Override
    public void deleteById(Long id) {
        broadcastNewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public BroadcastNew searchById(Long id) {
        return broadcastNewMapper.searchById(id);
    }
}
