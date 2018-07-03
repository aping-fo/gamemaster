package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface MailLogService extends BaseService<MailLogEntity> {
    Page<MailLog> searchPage(MailSearchQuery query);
}
