package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.AccountLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.AccountLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.AccountLog;
import com.luckygames.wmxz.gamemaster.model.view.request.AccountLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("AccountLogService")
public class AccountLogServiceImpl extends BaseNewServiceImpl<AccountLogEntity> implements AccountLogService {
    @Autowired
    private AccountLogMapper accountLogMapper;

    @Override
    public Mapper<AccountLogEntity> getMapper() {
        return accountLogMapper;
    }

    @Override
    public Page<AccountLog> searchPage(AccountLogSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> accountLogMapper.searchPage(query));
    }
}
