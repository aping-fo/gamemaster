package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.config.ThreadPoolConfig;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.MailLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.MailQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.concurrent.TimeUnit;

@Service("mailLogService")
public class MailLogServiceImpl extends BaseNewServiceImpl<MailLogEntity> implements MailLogService {
    @Autowired
    private MailLogMapper mailLogMapper;
    @Autowired
    private ServerService serverService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private Environment environment;

    private static final String SUCCESS = "success";

    @Override
    public Mapper<MailLogEntity> getMapper() {
        return mailLogMapper;
    }

    @Override
    public Page<MailLog> searchPage(MailSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> mailLogMapper.searchPage(query));
    }

    @Override
    public void sendMail(Long id, String playersIds, MailLog mailLog, String rewards) {
        Server server = serverService.getByServerId(id);
        if (environment.getProperty("spring.profiles.active").equals("dev") || !server.getIp().startsWith("192.168")) {
            ThreadPoolConfig.getExecutorService().execute(() -> {
                try {
                    String result = adminService.sendMail(new MailQuery(
                            id,
                            mailLog.getTitle(),
                            mailLog.getContent(),
                            playersIds,
                            mailLog.getMinLev(),
                            mailLog.getMaxLev(),
                            0,
                            rewards
                    ));
                    if (SUCCESS.equals(result)) {
                        mailLog.setServerId(id);
                        save(mailLog);
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
