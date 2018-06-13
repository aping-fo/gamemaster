package com.luckygames.wmxz.gamemaster.service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntity;
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
    private OnlineNowMapper OnlineNowMapper;

    @Override
    public Mapper<OnlineNowEntity> getMapper() {
        return OnlineNowMapper;
    }

    @Override
    public Page<OnlineNow> searchPage(OnlineNowSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> OnlineNowMapper.queryOnlineNowReport(query));
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
        List<OnlineNowEntity> OnlineNowList = OnlineNowMapper.selectByExample(example);
        if (OnlineNowList == null || OnlineNowList.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(OnlineNowList.get(0), OnlineNow.class);
    }
    @Override
    public List<OnlineNow> findByOneDate(Date date) {
        List<OnlineNowEntity> OnlineNowEntities = this.OnlineNowMapper.select(new OnlineNowEntity() {{
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
        List<OnlineNow> list = OnlineNowMapper.queryOnlineNowReportFromOrderSingleDate(date);
        if (list == null || list.isEmpty()) {
            return;
        }
        saveOnlineNowReport(list);
    }

}
