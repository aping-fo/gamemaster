package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LoginFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.LoginFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.LoginFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.LoginFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("LoginFlowService")
public class LoginFlowServiceImpl extends BaseServiceImpl<LoginFlowEntity> implements LoginFlowService {
    @Autowired
    private LoginFlowMapper LoginFlowMapper;

    @Override
    public Mapper<LoginFlowEntity> getMapper() {
        return LoginFlowMapper;
    }

    @Override
    public Page<LoginFlow> searchPage(LoginFlowSearchQuery query) {
        return LoginFlowMapper.searchPage(query);
    }
}
