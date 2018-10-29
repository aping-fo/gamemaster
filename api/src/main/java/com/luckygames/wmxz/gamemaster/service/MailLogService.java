package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface MailLogService extends BaseNewService<MailLogEntity> {
    Page<MailLog> searchPage(MailSearchQuery query);

    void sendMail(Long id, String playersIds, MailLog mailLog, String rewards);
}
