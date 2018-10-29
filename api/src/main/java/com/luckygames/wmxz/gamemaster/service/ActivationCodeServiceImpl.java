package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.config.ThreadPoolConfig;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ActivationCodeMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("ActivationCodeService")
public class ActivationCodeServiceImpl extends BaseNewServiceImpl<ActivationCodeEntity> implements ActivationCodeService {
    @Autowired
    private ActivationCodeMapper ActivationCodeMapper;
    @Autowired
    private ServerService serverService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private Environment environment;

    @Override
    public Mapper<ActivationCodeEntity> getMapper() {
        return ActivationCodeMapper;
    }

    @Override
    public Page<ActivationCode> searchPage(ActivationCodeSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> ActivationCodeMapper.searchPage(query));
    }

    @Override
    public ActivationCode searchById(Long id) {
        return ActivationCodeMapper.selectById(id);
    }

    @Override
    public Page<ActivationCode> add(ActivationCode activationCode) {
        return ActivationCodeMapper.add(activationCode);
    }

    @Override
    public List<ActivationCode> searchByServerId(Long serverId) {
        return ActivationCodeMapper.searchByServerId(serverId);
    }

    @Override
    public ActivationCode searchLast() {
        return ActivationCodeMapper.searchLast();
    }

    @Override
    public Page<ActivationCode> search(String remarks) {
        return ActivationCodeMapper.search(remarks);
    }

    @Override
    public void updateAllActivationCode(String useServerId, String name) {
        List<Server> serverList = serverService.searchList();
        if (serverList != null && !serverList.isEmpty()) {
            serverList.stream().filter(s -> !s.getServerId().equals(Long.valueOf(useServerId))).forEach(server -> {
                if (environment.getProperty("spring.profiles.active").equals("dev") || !server.getIp().startsWith("192.168")) {
                    ThreadPoolConfig.getExecutorService().execute(() -> {
                        try {
                            adminService.sendActivationCode(new ActivationCodeQuery(server.getServerId(), name));
                        } catch (Exception e) {
                            System.out.println("服务器连接错误，服务器名称=" + server.getServerName());
                        }
                    });
                }
            });
        }
    }

    @Override
    public void addAllActivationCode() {
        List<Server> serverList = serverService.searchList();
        if (serverList != null && !serverList.isEmpty()) {
            serverList.forEach(server -> {
                if (environment.getProperty("spring.profiles.active").equals("dev") || !server.getIp().startsWith("192.168")) {
                    ThreadPoolConfig.getExecutorService().execute(() -> {
                        try {
                            adminService.sendActivationCode(new ActivationCodeQuery(server.getServerId(), ""));
                        } catch (Exception e) {
                            System.out.println("服务器连接错误，服务器名称=" + server.getServerName());
                        }
                    });
                }
            });
        }
    }
}
