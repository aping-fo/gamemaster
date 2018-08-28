package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntity;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntityExample;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.OnlineNowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.OnlineNow;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.OnlineNowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("onlineNowService")
public class OnlineNowServiceImpl extends BaseServiceImpl<OnlineNowEntity> implements OnlineNowService {
    @Autowired
    private OnlineNowMapper onlineNowMapper;

    @Override
    public Mapper<OnlineNowEntity> getMapper() {
        return onlineNowMapper;
    }

    @Override
    public Page<OnlineNow> searchPage(OnlineNowSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> onlineNowMapper.searchPage(query));
    }

    private void saveOnlineNowReport(List<OnlineNow> list) {
        list.forEach(r -> {
            OnlineNow OnlineNow = findOne(r.getCharId());
            if (OnlineNow == null) {
                OnlineNow = new OnlineNow();
            }
            BeanUtils.copyProperties(r, OnlineNow);
            save(OnlineNow);
        });
    }

    @Override
    public OnlineNow findOne(Long charId) {
        OnlineNowExample example = new OnlineNowExample();
        OnlineNowExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andCharIdEqualTo(charId);
        List<OnlineNowEntity> OnlineNowList = onlineNowMapper.selectByExample(example);
        if (OnlineNowList == null || OnlineNowList.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(OnlineNowList.get(0), OnlineNow.class);
    }

    @Override
    public List<OnlineNow> findByOneDate(Date date) {
        List<OnlineNowEntity> OnlineNowEntities = this.onlineNowMapper.select(new OnlineNowEntity() {{
            setStatus(Status.NORMAL);
        }});
        return BeanUtils.copyListProperties(OnlineNowEntities, OnlineNow.class);
    }

    @Override
    public void generateOnlineNowReportToday() {
        generateOnlineNowReportByDay(DateUtils.TodayString());
    }


    @Override
    public void generateOnlineNowReportByDay(String date) {
        List<OnlineNow> list = onlineNowMapper.queryOnlineNowReportFromOrderSingleDate(date);
        if (list == null || list.isEmpty()) {
            return;
        }
        saveOnlineNowReport(list);
    }

    @Override
    public long countOnlineNow(Long serverId) {
        return countOnlineNow(serverId, null);
    }

    @Override
    public long countOnlineNow(Long serverId, Integer onlineSeconds) {
        OnlineNowExample example = new OnlineNowExample();
        OnlineNowEntityExample.Criteria criteria = example.createCriteria();
        criteria.andLastLoginTimeGreaterThanOrEqualTo(DateUtils.StringToDate(DateUtils.TodayString()));
        if (serverId != null) {
            criteria.andServerIdEqualTo(serverId.intValue());
        }
        if (onlineSeconds != null) {
            criteria.andMaxOnlineLengthGreaterThanOrEqualTo(onlineSeconds);
        }
        return this.onlineNowMapper.selectCountByExample(example);
    }

}
