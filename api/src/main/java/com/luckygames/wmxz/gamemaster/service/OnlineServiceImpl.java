package com.luckygames.wmxz.gamemaster.service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.OnlineEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.OnlineMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Online;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.OnlineSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("OnlineService")
public class OnlineServiceImpl extends BaseServiceImpl<OnlineEntity> implements OnlineService {
    @Autowired
    private OnlineMapper OnlineMapper;

    @Override
    public Mapper<OnlineEntity> getMapper() {
        return OnlineMapper;
    }


    @Override
    public Page<Online> searchPage(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> OnlineMapper.queryOnlineReport(query));
    }
}
