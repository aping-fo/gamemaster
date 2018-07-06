package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.CreateRoleManageEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.CreateRoleManageMapper;
import com.luckygames.wmxz.gamemaster.model.entity.CreateRoleManage;
import com.luckygames.wmxz.gamemaster.model.view.request.CreateRoleManageSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("CreateRoleManageService")
public class CreateRoleManageServiceImpl extends BaseServiceImpl<CreateRoleManageEntity> implements CreateRoleManageService {
    @Autowired
    private CreateRoleManageMapper CreateRoleManageMapper;

    @Override
    public Mapper<CreateRoleManageEntity> getMapper() {
        return CreateRoleManageMapper;
    }

    @Override
    public Page<CreateRoleManage> searchPage(CreateRoleManageSearchQuery query) {
        return CreateRoleManageMapper.searchPage(query);
    }

    @Override
    public void update(CreateRoleManage createRoleManage) {
        CreateRoleManageMapper.update(createRoleManage);
    }
}
