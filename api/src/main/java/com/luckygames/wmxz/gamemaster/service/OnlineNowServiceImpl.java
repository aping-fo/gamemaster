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
    private OnlineNowMapper onlineNowMapper;

    @Override
    public Mapper<OnlineNowEntity> getMapper() {
        return onlineNowMapper;
    }

    @Override
    public Page<OnlineNow> searchPage(OnlineNowSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> onlineNowMapper.searchPage(query));
    }
}
