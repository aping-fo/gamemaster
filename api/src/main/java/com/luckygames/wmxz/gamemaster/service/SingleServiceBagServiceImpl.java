package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.SingleServiceBagMapper;
import com.luckygames.wmxz.gamemaster.model.entity.SingleServiceBag;
import com.luckygames.wmxz.gamemaster.model.view.request.SingleServiceBagSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("SingleServiceBagService")
public class SingleServiceBagServiceImpl extends BaseServiceImpl<SingleServiceBagEntity> implements SingleServiceBagService {
    @Autowired
    private SingleServiceBagMapper SingleServiceBagMapper;

    @Override
    public Mapper<SingleServiceBagEntity> getMapper() {
        return SingleServiceBagMapper;
    }

    @Override
    public Page<SingleServiceBag> searchPage(SingleServiceBagSearchQuery query) {
        return SingleServiceBagMapper.searchPage(query);
    }
}
