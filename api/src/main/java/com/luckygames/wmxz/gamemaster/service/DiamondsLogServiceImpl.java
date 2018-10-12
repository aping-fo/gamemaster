package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.DiamondsLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.DiamondsLog;
import com.luckygames.wmxz.gamemaster.model.view.request.DiamondsLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("DiamondsLogService")
public class DiamondsLogServiceImpl extends BaseNewServiceImpl<DiamondLogsEntity> implements DiamondsLogService {
    @Autowired
    private DiamondsLogMapper diamondsLogMapper;

    @Override
    public Mapper<DiamondLogsEntity> getMapper() {
        return diamondsLogMapper;
    }

    @Override
    public Page<DiamondsLog> searchPage(DiamondsLogSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> diamondsLogMapper.searchPage(query));
    }
}
