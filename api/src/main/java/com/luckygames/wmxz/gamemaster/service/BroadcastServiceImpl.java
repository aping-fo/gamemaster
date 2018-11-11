package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.config.ThreadPoolConfig;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.BroadcastMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Broadcast;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.BroadcastSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service("broadcastService")
public class BroadcastServiceImpl extends BaseNewServiceImpl<BroadcastEntity> implements BroadcastService {

    @Autowired
    private BroadcastMapper broadcastMapper;

    private static final String SUCCESS = "success";

    @Autowired
    private ServerService serverService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private Environment environment;

    @Override
    public Mapper<BroadcastEntity> getMapper() {
        return this.broadcastMapper;
    }

    @Override
    public Page<Broadcast> searchPage(BroadcastSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> broadcastMapper.searchPage(query));

    }

    @Override
    public void deleteById(Long id) {
        broadcastMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Broadcast searchById(Long id) {
        return broadcastMapper.searchById(id);
    }

    @Override
    public Broadcast searchTemplate() {
        return broadcastMapper.searchTemplate();
    }

    @Override
    public void sendBroadcast(Broadcast broadcast) {
        if (broadcast.getIds() != null) {
            Long[] ids = broadcast.getIds();
            for (Long id : ids) {
                Server server = serverService.getByServerId(id);
                if (environment.getProperty("spring.profiles.active").equals("dev") || !server.getIp().startsWith("192.168")) {
                    ThreadPoolConfig.getExecutorService().execute(() -> {
                        try {
                            String result = adminService.sendBroadcast(new BroadcastQuery(
                                    id,
                                    broadcast.getLoopTimes(),
                                    broadcast.getGapSecond(),
                                    new Date(),
                                    broadcast.getTitle(),
                                    broadcast.getContent()
                            ));
                            if (SUCCESS.equals(result)) {
                                broadcast.setServerId(id);
                                save(broadcast);
                            }
                        } catch (Exception e) {
                            System.out.println("服务器连接错误，服务器名称=" + server.getServerName());
                        }
                    });
                    try {
                        ThreadPoolConfig.getExecutorService().awaitTermination(1, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
