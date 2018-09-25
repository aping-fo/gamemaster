package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.dao.ServerEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ServerSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface ServerMapper extends ServerEntityMapper<ServerEntity> {
    @Select("update server set server_state=#{serverState} where id = #{id}")
    void updateServerState(@Param("id")Long id,@Param("serverState")int serverState);

    @SelectProvider(type = ServerSqlProvider.class, method = "searchPage")
    List<Server> searchPage(ServerSearchQuery query);

    @Select("update server set white_list_enable=#{enable},white_list = #{whiteList} where id = #{id}")
    void updateWhitelist(@Param("id")Long id,@Param("enable")int enable,@Param("whiteList")String whiteList);

    @Select("select * from server where server_id = #{serverId}")
    Server getByServerId(@Param("serverId")Long serverId);
}