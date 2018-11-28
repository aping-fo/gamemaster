package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntity;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Prohibition;
import com.luckygames.wmxz.gamemaster.model.view.request.ProhibitionSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface ProhibitionMapper extends ProhibitionEntityMapper<ProhibitionEntity> {
    @SelectProvider(type = ProhibitionSqlProvider.class, method = "searchPage")
    Page<Prohibition> searchPage(ProhibitionSearchQuery query);

    @SelectProvider(type = ProhibitionSqlProvider.class, method = "checkInfo")
    Prohibition checkInfo(Prohibition prohibition);

    @SelectProvider(type = ProhibitionSqlProvider.class, method = "searchList")
    List<Prohibition> searchList(Prohibition prohibition);

    @Select("SELECT * FROM prohibition where player_id = #{playerId}")
    Prohibition searchByPlayerId(@Param("playerId") Long playerId);
}
