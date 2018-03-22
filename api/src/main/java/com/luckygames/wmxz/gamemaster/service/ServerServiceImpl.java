package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.Server;
import com.luckygames.wmxz.gamemaster.dao.ServerExample;
import com.luckygames.wmxz.gamemaster.dao.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serverService")
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerMapper serverMapper;

    @Override
    public List<Server> searchList(ServerSearchRequest request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andServerNameLike(request.getKeyword());
        }

        return serverMapper.selectByExample(example);
    }

    @Override
    public Page<Server> searchPage(ServerSearchRequest request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andServerNameLike(request.getKeyword());
        }

        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> serverMapper.selectByExample(example));
    }
}
