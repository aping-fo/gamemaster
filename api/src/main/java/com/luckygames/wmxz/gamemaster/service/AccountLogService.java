package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.AccountLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.AccountLog;
import com.luckygames.wmxz.gamemaster.model.view.request.AccountLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface AccountLogService extends BaseNewService<AccountLogEntity> {
    Page<AccountLog> searchPage(AccountLogSearchQuery query);
}
