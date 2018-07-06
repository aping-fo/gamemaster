package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.EmailFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.EmailFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.EmailFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("EmailFlowService")
public class EmailFlowServiceImpl extends BaseServiceImpl<EmailFlowEntity> implements EmailFlowService {
    @Autowired
    private EmailFlowMapper EmailFlowMapper;

    @Override
    public Mapper<EmailFlowEntity> getMapper() {
        return EmailFlowMapper;
    }

    @Override
    public Page<EmailFlow> searchPage(EmailFlowSearchQuery query) {
        return EmailFlowMapper.searchPage(query);
    }
}
