package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.dao.ServerExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("serverService")
public class ServerServiceImpl extends BaseServiceImpl<ServerEntity> implements ServerService {

    @Autowired
    private ServerMapper serverMapper;

    @Override
    public List<Server> searchList() {
        return searchList(null);
    }

    @Override
    public void updateServerState(Long id,int serverState) {
        serverMapper.updateServerState(id,serverState);
    }

    @Override
    public void updateWhitelist(Long id, int enable, String whiteList) {
        serverMapper.updateWhitelist(id, enable,whiteList);
    }

    @Override
    public List<Server> searchList(ServerSearchQuery request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL);

        if (request != null) {
            if (StringUtils.isNotBlank(request.getKeyword())) {
                criteria.andServerNameLike(request.getKeyword());
            }
            if (CollectionUtils.isNotEmpty(request.getServerIds())) {
                criteria.andServerIdIn(request.getServerIds());
            }
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
        if (CollectionUtils.isNotEmpty(request.getServerIds())) {
            criteria.andServerIdIn(request.getServerIds());
        }

//        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> serverMapper.selectByExample(example));
        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> serverMapper.searchPage(request));
    }

    @Override
    public Server getByServerId(Long serverId) {
        ServerEntity serverEntity = serverMapper.selectOne(new ServerEntity() {{
            setServerId(serverId);
            setStatus(Status.NORMAL);
        }});
        return BeanUtils.copyProperties(serverEntity, Server.class);
    }

    @Override
    public long countServers() {
        return this.serverMapper.selectCount(new ServerEntity() {{
            setStatus(Status.NORMAL);
        }});
    }

    @Override
    public Server fixOpenDate(Long serverId, Date date) {
        if (serverId == null || serverId <= 0 || date == null) {
            return null;
        }
        Server server = getByServerId(serverId);
        if (server == null) {
            return null;
        }
//        if (server.getOpenTime() == null || server.getOpenTime().after(date)) {
//            server.setOpenTime(DateUtils.addDays(date, -1));
//            save(server);
//        }
        return server;
    }

    @Override
    public Mapper<ServerEntity> getMapper() {
        return this.serverMapper;
    }
}
