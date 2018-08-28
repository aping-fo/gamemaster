package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.NewUserEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.NewUserMapper;
import com.luckygames.wmxz.gamemaster.model.entity.NewUser;
import com.luckygames.wmxz.gamemaster.model.view.request.NewUserSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("NewUserService")
public class NewUserServiceImpl extends BaseServiceImpl<NewUserEntity> implements NewUserService {
    @Autowired
    private NewUserMapper NewUserMapper;

    @Override
    public Mapper<NewUserEntity> getMapper() {
        return NewUserMapper;
    }

    @Override
    public Page<NewUser> searchPage(NewUserSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> NewUserMapper.searchPage(query));
    }
}
