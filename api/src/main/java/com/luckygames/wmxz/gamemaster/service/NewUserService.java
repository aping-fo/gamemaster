package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.NewUserEntity;
import com.luckygames.wmxz.gamemaster.model.entity.NewUser;
import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface NewUserService extends BaseNewService<NewUserEntity> {
    Page<NewUser> searchPage(NewUserSearchQuery query);
}
