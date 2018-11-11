package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MailEntity;
import com.luckygames.wmxz.gamemaster.dao.MailEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.MailSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Mail;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface MailMapper extends MailEntityMapper<MailEntity> {
    @SelectProvider(type = MailSqlProvider.class, method = "searchPage")
    Page<Mail> searchPage(MailSearchQuery query);
}
