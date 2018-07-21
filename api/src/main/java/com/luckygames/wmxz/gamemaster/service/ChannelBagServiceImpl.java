package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.ChannelBagEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ChannelBagMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ChannelBag;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("channelBagService")
public class ChannelBagServiceImpl extends BaseServiceImpl<ChannelBagEntity> implements ChannelBagService {

    @Autowired
    private ChannelBagMapper channelBagMapper;

    @Override
    public Mapper<ChannelBagEntity> getMapper() {
        return this.channelBagMapper;
    }

    @Override
    public List<ChannelBag> searchPageByChannelId(Long channelId) {
        return  channelBagMapper.searchPageByChannelId(channelId);
    }
}
