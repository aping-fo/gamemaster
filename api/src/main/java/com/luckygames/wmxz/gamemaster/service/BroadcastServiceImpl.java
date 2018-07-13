package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.BroadcastMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Broadcast;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("broadcastService")
public class BroadcastServiceImpl extends BaseServiceImpl<BroadcastEntity> implements BroadcastService {

    @Autowired
    private BroadcastMapper broadcastMapper;

    @Override
    public Mapper<BroadcastEntity> getMapper() {
        return this.broadcastMapper;
    }

    @Override
    public Page<Broadcast> searchPage(BroadcastSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> broadcastMapper.searchPage(query));

    }

    @Override
    public void deleteById(Long id) {
        broadcastMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Broadcast searchById(Long id) {
        return broadcastMapper.searchById(id);
    }
}
