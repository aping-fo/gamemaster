package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.CreateRoleManageEntity;
import com.luckygames.wmxz.gamemaster.dao.CreateRoleManageEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.CreateRoleManageSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.CreateRoleManage;
import com.luckygames.wmxz.gamemaster.model.view.request.CreateRoleManageSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface CreateRoleManageMapper extends CreateRoleManageEntityMapper<CreateRoleManageEntity> {
    @SelectProvider(type = CreateRoleManageSqlProvider.class, method = "searchPage")
    Page<CreateRoleManage> searchPage(CreateRoleManageSearchQuery query);

    @SelectProvider(type = CreateRoleManageSqlProvider.class, method = "update")
    void update(CreateRoleManage createRoleManage);
}
