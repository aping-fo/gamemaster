package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.EmailFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.EmailFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface EmailFlowMapper extends EmailFlowEntityMapper<EmailFlowEntity> {
    @SelectProvider(type = EmailFlowSqlProvider.class, method = "searchPage")
    Page<EmailFlow> searchPage(EmailFlowSearchQuery query);
}
