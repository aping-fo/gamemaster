package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LoginFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.LoginFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.LoginFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface LoginFlowService extends BaseService<LoginFlowEntity> {
    Page<LoginFlow> searchPage(LoginFlowSearchQuery query);
}
