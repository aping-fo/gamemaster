package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.MailLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("mailLogService")
public class MailLogServiceImpl extends BaseServiceImpl<MailLogEntity> implements MailLogService {
    @Autowired
    private MailLogMapper mailLogMapper;

    @Override
    public Mapper<MailLogEntity> getMapper() {
        return mailLogMapper;
    }

    @Override
    public Page<MailLog> searchPage(MailSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> mailLogMapper.searchPage(query));

    }
}
