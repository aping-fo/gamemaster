package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ChannelEntity;
import com.luckygames.wmxz.gamemaster.dao.ChannelExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.ChannelMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("channelService")
public class ChannelServiceImpl extends BaseServiceImpl<ChannelEntity> implements ChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> searchList(ChannelSearchQuery request) {
        ChannelExample example = new ChannelExample();
        ChannelExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (request != null) {
            if (StringUtils.isNotBlank(request.getKeyword())) {
                criteria.andChannelNameLike(request.getKeyword());
            }
        }

        return BeanUtils.copyListProperties(channelMapper.selectByExample(example), Channel.class);
    }

    @Override
    public Page<Channel> searchPage(ChannelSearchQuery request) {
        ChannelExample example = new ChannelExample();
        ChannelExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andChannelNameLike(request.getKeyword());
        }

        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> channelMapper.selectByExample(example));
    }

    @Override
    public Channel getByChannelId(Long channelId) {
        ChannelEntity channelEntity = channelMapper.selectOne(new ChannelEntity() {{
            setChannelId(channelId);
            setStatus(Status.NORMAL);
        }});
        return BeanUtils.copyProperties(channelEntity, Channel.class);
    }

    @Override
    public long countChannles() {
        return this.channelMapper.selectCount(new ChannelEntity() {{
            setStatus(Status.NORMAL);
        }});
    }

    @Override
    public Channel fixOpenDate(Long channelId, Date registerDate) {
        if (channelId == null || channelId <= 0 || registerDate == null) {
            return null;
        }
        Channel channel = getByChannelId(channelId);
        if (channel == null) {
            return null;
        }
        if (channel.getOpenDate() == null || channel.getOpenDate().after(registerDate)) {
            channel.setOpenDate(DateUtils.addDays(registerDate, -1));
            save(channel);
        }
        return channel;
    }

    @Override
    public List<Channel> searchList() {
        return searchList(null);
    }

    @Override
    public Mapper<ChannelEntity> getMapper() {
        return this.channelMapper;
    }
}
