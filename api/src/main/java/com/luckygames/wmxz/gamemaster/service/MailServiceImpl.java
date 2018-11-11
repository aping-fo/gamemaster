package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.MailEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.MailMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Mail;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("MailService")
public class MailServiceImpl extends BaseNewServiceImpl<MailEntity> implements MailService {
    @Autowired
    private MailMapper MailMapper;

    @Override
    public Mapper<MailEntity> getMapper() {
        return MailMapper;
    }

    @Override
    public Page<Mail> searchPage(MailSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> MailMapper.searchPage(query));
    }
}
