package com.luckygames.wmxz.gamemaster.service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ActivityEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ActivityMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Activity;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivitySearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("ActivityService")
public class ActivityServiceImpl extends BaseServiceImpl<ActivityEntity> implements ActivityService {
    @Autowired
    private ActivityMapper ActivityMapper;

    @Override
    public Mapper<ActivityEntity> getMapper() {
        return ActivityMapper;
    }

    @Override
    public Page<Activity> searchPage(ActivitySearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> ActivityMapper.searchPage(query));
    }

    @Override
    public void add(Activity activity) {
        ActivityMapper.add(activity);
    }

    @Override
    public void update(ActivitySearchQuery query) {
        ActivityMapper.update(query);
    }
}
