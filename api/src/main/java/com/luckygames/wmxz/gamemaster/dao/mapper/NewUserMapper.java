package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.NewUserEntity;
import com.luckygames.wmxz.gamemaster.dao.NewUserEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.NewUserSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.NewUser;
import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface NewUserMapper extends NewUserEntityMapper<NewUserEntity> {

    @SelectProvider(type = NewUserSqlProvider.class, method = "searchPage")
    List<NewUser> searchPage(NewUserSearchQuery query);
}
