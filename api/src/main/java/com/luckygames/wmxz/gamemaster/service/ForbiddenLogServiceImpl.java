package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ForbiddenLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ForbiddenLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("forbiddenLogService")
public class ForbiddenLogServiceImpl extends BaseServiceImpl<ForbiddenLogEntity> implements ForbiddenLogService {
    @Autowired
    private ForbiddenLogMapper forbiddenLogMapper;

    @Override
    public Mapper<ForbiddenLogEntity> getMapper() {
        return forbiddenLogMapper;
    }

    @Override
    public Page<ForbiddenLog> searchPage(ForbiddenSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> forbiddenLogMapper.queryFobiddenLog(query));
    }

    @Override
    public void removeFobidden(Long charId) {
        forbiddenLogMapper.removeFobidden(charId);
    }
}
