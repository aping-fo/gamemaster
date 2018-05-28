package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("playerOrderService")
public class PlayerOrderServiceImpl extends BaseServiceImpl<PlayerOrderEntity> implements PlayerOrderService {
    @Autowired
    private PlayerOrderMapper playerOrderMapper;

    @Override
    public Page<PlayerOrder> searchPage(PlayerOrderSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerOrderMapper.queryPlayerOrder(query));
    }

    @Override
    public Mapper<PlayerOrderEntity> getMapper() {
        return this.playerOrderMapper;
    }
}
