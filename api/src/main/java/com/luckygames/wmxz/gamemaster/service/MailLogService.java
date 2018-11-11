package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.view.request.MailLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface MailLogService extends BaseNewService<MailLogEntity> {
    Page<MailLog> searchPage(MailLogSearchQuery query);

    void sendMail(Long id, String playersIds, MailLog mailLog, String rewards);

    MailLog searchLast();
}
