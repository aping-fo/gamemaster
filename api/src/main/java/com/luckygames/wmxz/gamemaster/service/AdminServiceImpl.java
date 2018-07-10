package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.common.constants.AdminUrl;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lucky on 2018/3/29.
 * GM管理
 */
@Controller
@EnableAutoConfiguration
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ServerService serverService;

    @Value("${global.gmHost}")
    private String host;

    /**
     * 聊天监控
     * @param query
     * @return
     */
    @Override
    public String chatMonitoring(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.MESSAGE.getUrl());
    }

    @Override
    public String sendNotice(String content) {
        return null;
    }

    /**
     * 广播
     *
     * @param query 请求参数
     * @return 返回：成功:success，失败：failed,参数错误：param_error
     */
    @Override
    public String sendBroadcast(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.MESSAGE.getUrl());
    }


    /**
     * 发送系统邮件
     *
     * @param query 请求参数
     * @return 返回：成功:success，失败：failed,参数错误：param_error
     */
    @Override
    public String sendMail(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.MAIL.getUrl());
    }

    @Override
    public String getHost(Long serverId) {
        Server server = serverService.getByServerId(serverId);
        return "http://" + server.getIp() + ":" + server.getPort();
    }

    /**
     * 踢人
     * @param query
     * @return
     */
    @Override
    public String kickLine(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.KICK.getUrl());
    }

    /**
     * 角色封禁操作
     *
     * @param query hour：封禁时长
     * @return 返回：成功:success，失败：failed,参数错误：param_error
     */
    @Override
    public String banRole(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.BAN.getUrl());
    }

    @Override
    public String queryRoleInfo(String content) {
        return null;
    }
}
