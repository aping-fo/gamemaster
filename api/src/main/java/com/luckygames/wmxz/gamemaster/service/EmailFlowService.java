package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.EmailFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.EmailFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface EmailFlowService extends BaseService<EmailFlowEntity> {
    Page<EmailFlow> searchPage(EmailFlowSearchQuery query);
}
