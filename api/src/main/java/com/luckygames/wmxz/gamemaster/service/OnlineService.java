package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.OnlineEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Online;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.List;

public interface OnlineService extends BaseService<OnlineEntity> {
    Page<Online> searchPage(CommonSearchQuery query);
}
