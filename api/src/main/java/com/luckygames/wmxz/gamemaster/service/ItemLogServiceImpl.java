package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapperNew.ItemLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ItemLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ItemLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("ItemLogService")
public class ItemLogServiceImpl extends BaseNewServiceImpl<ItemLogEntity> implements ItemLogService {
    @Autowired
    private ItemLogMapper itemLogMapper;

    @Override
    public Mapper<ItemLogEntity> getMapper() {
        return itemLogMapper;
    }

    @Override
    public Page<ItemLog> searchPage(ItemLogSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> itemLogMapper.searchPage(query));
    }
}
