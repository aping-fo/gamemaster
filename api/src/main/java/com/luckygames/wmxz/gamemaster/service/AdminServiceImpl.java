package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.common.constants.AdminUrl;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.BackendCommand;
import com.luckygames.wmxz.gamemaster.model.view.request.RecoveryGoodsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
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

    private HttpHeaders headers;

    public AdminServiceImpl() {
        headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);

        //复杂构造函数的使用
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setReadTimeout(999999);//设置读取超时
        //利用复杂构造器可以实现超时设置，内部实际实现为 HttpClient
        restTemplate = new RestTemplate(requestFactory);
    }

    /**
     * 聊天监控
     *
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
        return "http://" + server.getIp() + ":" + server.getGmPort();
    }

    /**
     * 踢人
     *
     * @param query
     * @return
     */
    @Override
    public String kickLine(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.KICK.getUrl());
    }

    public String sendActivationCode(ActivationCodeQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.ACTIVATION_CODE.getUrl());
    }

    @Override
    public String recoveryGoods(RecoveryGoodsQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.RECOVERY_GOODS.getUrl());
    }

    @Override
    public String getPlayerName(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.GET_INFO_BY_PLAYER_NAME.getUrl());
    }

    @Override
    public String pay(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.PAY.getUrl());
    }

    @Override
    public String queryNewPlayer(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.NEW_PLAYER.getUrl());
    }

    @Override
    public String combine(GMQuery query) {
        return commonRequest(query.encodeReqParams(), restTemplate, query.getServerId(), AdminUrl.MERGE_SERVER.getUrl());
    }

    public String reqBackendCommond(BackendCommand command) {
        String host = getHost(command.getServerId());
        HttpEntity<String> entity = new HttpEntity<>(command.encodeReqParams(), headers);
        ResponseEntity<String> result = restTemplate.postForEntity(host, entity, String.class);
        System.out.println(result.getBody());
        return result.getBody();
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
