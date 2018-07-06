package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.CreateRoleManage;
import com.luckygames.wmxz.gamemaster.model.view.request.CreateRoleManageSearchQuery;

public class CreateRoleManageSqlProvider {
    public String update(CreateRoleManage createRoleManage) {
        StringBuilder sql = new StringBuilder("update create_role_manage set create_role="+createRoleManage.getCreateRole()+" where id="+createRoleManage.getId());
        return sql.toString();
    }

    public String searchPage(CreateRoleManageSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT * FROM create_role_manage GROUP BY channel_id,server_id");
        return sql.toString();
    }
}
