package com.luckygames.wmxz.gamemaster.dao.mapperNew;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntity;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ItemLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.ItemLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ItemLogSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface ItemLogMapper extends ItemLogEntityMapper<ItemLogEntity> {
    @SelectProvider(type = ItemLogSqlProvider.class, method = "searchPage")
    Page<ItemLog> searchPage(ItemLogSearchQuery query);
}
