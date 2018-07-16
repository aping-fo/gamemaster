package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.common.constants.AdminUrl;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.BackendCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lucky on 2018/3/29.
 * GM管理
 */
@Controller
@EnableAutoConfiguration
@Service("adminNewService")
public class AdminNewServiceImpl implements AdminNewService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ServerService serverService;

    @Value("${global.gmHost}")
    private String host;
    private HttpHeaders headers;

    //设置消息头
    public AdminNewServiceImpl() {
        headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
    }

    @Override
    public String getHost(Long serverId) {
        Server server = serverService.getByServerId(serverId);
        return "http://" + server.getIp() + ":" + server.getPort();
    }

    @Override
    public String commonAction(GMQuery query,String actionUrl) {
        BackendCommand command = (BackendCommand)query;
        command.setAction(actionUrl);
        return reqBackendCommond(command);
    }

    public String reqBackendCommond(BackendCommand command){
        String host = getHost(command.getServerId());
        HttpEntity<String> entity = new HttpEntity<>(command.encodeReqParams(),headers);
        ResponseEntity<String> result = restTemplate.postForEntity(host, entity, String.class);
        System.out.println(result.getBody());
        return result.getBody();
    }
}
