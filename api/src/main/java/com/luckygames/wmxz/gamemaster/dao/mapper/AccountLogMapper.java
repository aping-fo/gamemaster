package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.AccountLogEntity;
import com.luckygames.wmxz.gamemaster.dao.AccountLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.AccountLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.AccountLog;
import com.luckygames.wmxz.gamemaster.model.view.request.AccountLogSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface AccountLogMapper extends AccountLogEntityMapper<AccountLogEntity> {
    @SelectProvider(type = AccountLogSqlProvider.class, method = "searchPage")
    Page<AccountLog> searchPage(AccountLogSearchQuery query);
}
