package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.config.ThreadPoolConfig;
import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.dao.ServerExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.MergeServerQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("serverService")
public class ServerServiceImpl extends BaseNewServiceImpl<ServerEntity> implements ServerService {

    @Autowired
    private ServerMapper serverMapper;
    @Autowired
    private AdminService adminService;

    @Override
    public List<Server> searchList() {
        ServerSearchQuery query = new ServerSearchQuery();
        query.setOpen(1);
        return searchList(query);
    }

    @Override
    public List<Server> searchAllList() {
        return searchList(null);
    }

    @Override
    public void updateServerState(Long id, int serverState, String maintenanceTips) {
        serverMapper.updateServerState(id, serverState, maintenanceTips);
    }

    @Override
    public void updateWhitelist(Long id, int enable, String whiteList) {
        serverMapper.updateWhitelist(id, enable, whiteList);
    }

    @Override
    public String combine(ServerSearchQuery query) {
        try {
            Optional<Server> server = Optional.ofNullable(getByServerId(query.getFromServer()));
            return adminService.combine(new MergeServerQuery(
                    query.getToServer(),
                    query.getFromServer(),
                    server.map(ServerEntity::getIp).get(),
                    server.map(ServerEntity::getDbName).get()
            ));
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }

    @Override
    public List<Server> servers(ServerSearchQuery query) {
        return serverMapper.servers(query);
    }

    @Override
    public void updateServer(Server server) {
        for (Long serverId : server.getIds()) {
            Server server1 = getByServerId(serverId);

            String dbName = server1.getDbName();
            String catalog = "app";
            if (dbName.length() > 4) {
                catalog += dbName.substring(4);
            }

            StringBuffer cmd = new StringBuffer("ssh -o StrictHostKeyChecking=no -p 23232 -i /root/my_world_ras root@");
            cmd.append(server1.getIp())
                    .append(" sh /root/")
                    .append(catalog)
                    .append("/server_new/update.sh");
            ThreadPoolConfig.getExecutorService().execute(() -> {
                try {
                    Process proc = Runtime.getRuntime().exec(cmd.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Override
    public void stop(Server server) {
        for (Long serverId : server.getIds()) {
            Server server1 = getByServerId(serverId);

            String dbName = server1.getDbName();
            String catalog = "app";
            if (dbName.length() > 4) {
                catalog += dbName.substring(4);
            }

            StringBuffer cmd = new StringBuffer("ssh -o StrictHostKeyChecking=no -p 23232 -i /root/my_world_ras root@");
            cmd.append(server1.getIp())
                    .append(" sh /root/")
                    .append(catalog)
                    .append("/server_new/stop.sh");
            ThreadPoolConfig.getExecutorService().execute(() -> {
                try {
                    Process proc = Runtime.getRuntime().exec(cmd.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Override
    public List<Server> searchList(ServerSearchQuery request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();

        if (request != null) {
            if (StringUtils.isNotBlank(request.getKeyword())) {
                criteria.andServerNameLike(request.getKeyword());
            }
            if (CollectionUtils.isNotEmpty(request.getServerIds())) {
                criteria.andServerIdIn(request.getServerIds());
            }
            if (request.getOpen() != null) {
                criteria.andOpenEqualTo(request.getOpen());
            }
        }

        return BeanUtils.copyListProperties(serverMapper.searchList(request), Server.class);
    }

    @Override
    public Page<Server> searchPage(ServerSearchQuery request) {
        ServerExample example = new ServerExample();
        ServerExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(request.getKeyword())) {
            criteria.andServerNameLike(request.getKeyword());
        }
        if (CollectionUtils.isNotEmpty(request.getServerIds())) {
            criteria.andServerIdIn(request.getServerIds());
        }
        return PageHelper.startPage(request.getPageNum(), request.getPageSize()).doSelectPage(() -> serverMapper.searchPage(request));
    }

    @Override
    public Server getByServerId(Long serverId) {
        return serverMapper.getByServerId(serverId);
    }


    @Override
    public long countServers() {
        return this.serverMapper.selectCount(new ServerEntity() {{
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
