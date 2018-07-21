package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChannelEntity;
import com.luckygames.wmxz.gamemaster.dao.ChannelEntityMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ChannelMapper extends ChannelEntityMapper<ChannelEntity> {
    @Select("select * from channel where server_id = #{serverId}")
    Page<Channel> searchListByServerId(@Param("serverId") Long serverId);
}