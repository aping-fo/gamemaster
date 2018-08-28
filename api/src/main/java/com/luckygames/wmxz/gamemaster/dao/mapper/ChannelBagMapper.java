package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.ChannelBagEntity;
import com.luckygames.wmxz.gamemaster.dao.ChannelBagEntityMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ChannelBag;
import com.luckygames.wmxz.gamemaster.model.view.request.PackageSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChannelBagMapper extends ChannelBagEntityMapper<ChannelBagEntity> {
    @Select("select * from channel_bag where channel_id = #{channelId}")
    List<ChannelBag> searchPageByChannelId(@Param("channelId") Long channelId);

    @Select("select * from channel_bag")
    List<ChannelBag> searchPage(PackageSearchQuery query);
}