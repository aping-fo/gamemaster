package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineEntity;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnline;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface IntegratedOnlineMapper extends IntegratedOnlineEntityMapper<IntegratedOnlineEntity> {

    @SelectProvider(type = IntegratedOnlineSqlProvider.class, method = "searchPage")
    List<IntegratedOnline> searchPage(IntegratedOnlineSearchQuery query);
}
