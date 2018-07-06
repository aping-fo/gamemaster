package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.MailLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface MailLogMapper extends MailLogEntityMapper<MailLogEntity> {
    @SelectProvider(type = MailLogSqlProvider.class, method = "queryMailLog")
    List<MailLog> searchPage(MailSearchQuery query);
}