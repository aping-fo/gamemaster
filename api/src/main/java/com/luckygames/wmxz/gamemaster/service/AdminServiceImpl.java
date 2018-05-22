package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.common.constants.AdminUrl;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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


    @Override
    public String sendNotice(String content) {
        return null;
    }

    /**
     * 发送系统邮件
     *
     * @param query 请求参数
     * @return 返回：成功:success，失败：failed,参数错误：param_error
     */
    @Override
    public String sendBroadcast(GMQuery query) {
        Server server = serverService.searchOne(query.getServerId());
        if (server != null) {
            return commonRequest(query.encodeReqParams(), restTemplate, server.getServerIp(), server.getServerPort(), AdminUrl.MESSAGE.getUrl());
        }
        return "failed";
    }


    /**
     * 发送系统邮件
     *
     * @param query 请求参数
     * @return 返回：成功:success，失败：failed,参数错误：param_error
     */
    @Override
    public String sendMail(GMQuery query) {
        Server server = serverService.searchOne(query.getServerId());
        if (server != null) {
            return commonRequest(query.encodeReqParams(), restTemplate, server.getServerIp(), server.getServerPort(), AdminUrl.MAIL.getUrl());
        }
        return "failed";
    }

    /**
     * 角色封禁操作
     *
     * @param query hour：封禁时长
     * @return 返回：成功:success，失败：failed,参数错误：param_error
     */
    @Override
    public String banRole(GMQuery query) {
        Server server = serverService.searchOne(query.getServerId());
        if (server != null) {
            return commonRequest(query.encodeReqParams(), restTemplate, server.getServerIp(), server.getServerPort(), AdminUrl.BAN.getUrl());
        }
        return "failed";
    }

    @Override
    public String queryRoleInfo(GMQuery query) {
        Server server = serverService.searchOne(query.getServerId());
        if (server != null) {
            return commonRequest(query.encodeReqParams(), restTemplate, server.getServerIp(), server.getServerPort(), AdminUrl.GETINFO.getUrl());
        }
        return "failed";
    }
}
