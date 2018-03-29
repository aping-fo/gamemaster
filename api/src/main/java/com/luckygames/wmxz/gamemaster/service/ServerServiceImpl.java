package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ServerExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serverService")
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerMapper serverMapper;

    @Override
    public List<Server> searchList(ServerSearchQuery request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andServerNameLike(request.getKeyword());
        }

        return BeanUtils.copyListProperties(serverMapper.selectByExample(example), Server.class);
    }

    @Override
    public Page<Server> searchPage(ServerSearchQuery request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andServerNameLike(request.getKeyword());
        }

        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> serverMapper.selectByExample(example));
    }
}
