package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ActivationCodeMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

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
        return ActivationCodeMapper.searchPage(query);
    }

    @Override
    public Page<ActivationCode> add(ActivationCode activationCode) {
        return ActivationCodeMapper.add(activationCode);
    }
}
