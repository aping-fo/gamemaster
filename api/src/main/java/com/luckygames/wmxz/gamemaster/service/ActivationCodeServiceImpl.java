package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ActivationCodeMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("ActivationCodeService")
public class ActivationCodeServiceImpl extends BaseServiceImpl<ActivationCodeEntity> implements ActivationCodeService {
    @Autowired
    private ActivationCodeMapper ActivationCodeMapper;

    @Override
    public Mapper<ActivationCodeEntity> getMapper() {
        return ActivationCodeMapper;
    }

    @Override
    public Page<ActivationCode> searchPage(ActivationCodeSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> ActivationCodeMapper.searchPage(query));
    }

    @Override
    public ActivationCode searchById(Long id) {
        return ActivationCodeMapper.selectById(id);
    }

    @Override
    public Page<ActivationCode> add(ActivationCode activationCode) {
        return ActivationCodeMapper.add(activationCode);
    }

    @Override
    public List<ActivationCode> searchByServerId(Long serverId) {
        return ActivationCodeMapper.searchByServerId(serverId);
    }

    @Override
    public ActivationCode searchLast() {
        return ActivationCodeMapper.searchLast();
    }
}
