package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ActivityEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Activity;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivitySearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface ActivityService extends BaseService<ActivityEntity> {
    Page<Activity> searchPage(ActivitySearchQuery query);
    void add(Activity activity);

    void update(ActivitySearchQuery query);
}
