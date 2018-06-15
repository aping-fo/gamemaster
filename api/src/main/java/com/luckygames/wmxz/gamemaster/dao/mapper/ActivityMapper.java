package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.ActivityEntity;
import com.luckygames.wmxz.gamemaster.dao.ActivityEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ActivitySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Activity;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivitySearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface ActivityMapper extends ActivityEntityMapper<ActivityEntity> {

    @SelectProvider(type = ActivitySqlProvider.class, method = "searchPage")
    List<Activity> searchPage(ActivitySearchQuery query);

    @SelectProvider(type = ActivitySqlProvider.class, method = "add")
    void add(Activity activity);

    @SelectProvider(type = ActivitySqlProvider.class, method = "update")
    void update(ActivitySearchQuery activity);
}
