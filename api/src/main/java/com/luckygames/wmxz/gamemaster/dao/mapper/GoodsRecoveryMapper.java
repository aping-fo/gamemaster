package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.GoodsRecoveryEntity;
import com.luckygames.wmxz.gamemaster.dao.GoodsRecoveryEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.GoodsRecoverySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;
import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface GoodsRecoveryMapper extends GoodsRecoveryEntityMapper<GoodsRecoveryEntity>
{
    @SelectProvider(type = GoodsRecoverySqlProvider.class, method = "searchPage")
    Page<GoodsRecovery> searchPage(GoodsRecoverySearchQuery query);
}
