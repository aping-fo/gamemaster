package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RechargeSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Recharge;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSearchQuery;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RechargeMapper extends RechargeEntityMapper<RechargeEntity> {
    @SelectProvider(type = RechargeSqlProvider.class, method = "searchPage")
    Page<Recharge> searchPage(RechargeSearchQuery query);

    @Select("select * from recharge")
    List<Recharge> searchList();
}
