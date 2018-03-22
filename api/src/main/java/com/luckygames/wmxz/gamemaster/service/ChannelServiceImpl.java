package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.Channel;
import com.luckygames.wmxz.gamemaster.dao.ChannelExample;
import com.luckygames.wmxz.gamemaster.dao.ChannelMapper;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("channelService")
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> searchList(ChannelSearchRequest request) {
        ChannelExample example = new ChannelExample();
        ChannelExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andChannelNameLike(request.getKeyword());
        }

        return channelMapper.selectByExample(example);
    }

    @Override
    public Page<Channel> searchPage(ChannelSearchRequest request) {
        ChannelExample example = new ChannelExample();
        ChannelExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andChannelNameLike(request.getKeyword());
        }

        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> channelMapper.selectByExample(example));
    }
}
