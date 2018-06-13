package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineServiceEntity;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineServiceEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineServiceSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnlineService;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineServiceSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface IntegratedOnlineServiceMapper extends IntegratedOnlineServiceEntityMapper<IntegratedOnlineServiceEntity> {

    @SelectProvider(type = IntegratedOnlineServiceSqlProvider.class, method = "searchPage")
    List<IntegratedOnlineService> searchPage(IntegratedOnlineServiceSearchQuery query);
}
