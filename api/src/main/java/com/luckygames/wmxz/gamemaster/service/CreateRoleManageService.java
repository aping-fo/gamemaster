package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.CreateRoleManageEntity;
import com.luckygames.wmxz.gamemaster.model.entity.CreateRoleManage;
import com.luckygames.wmxz.gamemaster.model.view.request.CreateRoleManageSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface CreateRoleManageService extends BaseService<CreateRoleManageEntity> {
    Page<CreateRoleManage> searchPage(CreateRoleManageSearchQuery query);
    void update(CreateRoleManage createRoleManage);
}
