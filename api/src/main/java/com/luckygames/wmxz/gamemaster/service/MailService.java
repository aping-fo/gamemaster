package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MailEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Mail;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface MailService extends BaseNewService<MailEntity> {
    Page<Mail> searchPage(MailSearchQuery query);
}
