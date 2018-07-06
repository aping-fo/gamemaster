package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.LoginFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.LoginFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.LoginFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.LoginFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.LoginFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface LoginFlowMapper extends LoginFlowEntityMapper<LoginFlowEntity> {
    @SelectProvider(type = LoginFlowSqlProvider.class, method = "searchPage")
    Page<LoginFlow> searchPage(LoginFlowSearchQuery query);
}
