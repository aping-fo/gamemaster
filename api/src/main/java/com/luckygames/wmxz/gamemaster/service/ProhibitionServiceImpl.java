package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ProhibitionMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Prohibition;
import com.luckygames.wmxz.gamemaster.model.view.request.ProhibitionSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("ProhibitionService")
public class ProhibitionServiceImpl extends BaseNewServiceImpl<ProhibitionEntity> implements ProhibitionService {
    @Autowired
    private ProhibitionMapper prohibitionMapper;

    @Override
    public Mapper<ProhibitionEntity> getMapper() {
        return prohibitionMapper;
    }

    @Override
    public Page<Prohibition> searchPage(ProhibitionSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> prohibitionMapper.searchPage(query));
    }

    @Override
    public Prohibition checkInfo(Prohibition prohibition) {
        return prohibitionMapper.checkInfo(prohibition);
    }

    @Override
    public List<Prohibition> searchList(Prohibition prohibition) {
        return prohibitionMapper.searchList(prohibition);
    }

    @Override
    public Prohibition searchByPlayerId(Long playerId) {
        return prohibitionMapper.searchByPlayerId(playerId);
    }
}
