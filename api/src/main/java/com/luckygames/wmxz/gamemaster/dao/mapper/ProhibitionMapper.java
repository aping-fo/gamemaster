package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntity;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Prohibition;
import com.luckygames.wmxz.gamemaster.model.view.request.ProhibitionSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface ProhibitionMapper extends ProhibitionEntityMapper<ProhibitionEntity> {
    @SelectProvider(type = ProhibitionSqlProvider.class, method = "searchPage")
    Page<Prohibition> searchPage(ProhibitionSearchQuery query);

    @SelectProvider(type = ProhibitionSqlProvider.class, method = "checkInfo")
    Prohibition checkInfo(Prohibition prohibition);
}
