package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by lucky on 2018/3/29.
 */
public interface AdminService {
    /**
     * 公告
     *
     * @param content
     * @return
     */
    public String sendNotice(String content);

    /**
     * 广播
     *
     * @param query {@link com.luckygames.wmxz.gamemaster.model.view.request.MessageQuery}
     * @return
     */
    public String sendBroadcast(GMQuery query);

    /**
     * 邮件
     *
     *
     * @param query {@link com.luckygames.wmxz.gamemaster.model.view.request.MailQuery}
     * @return
     */
    public String sendMail(GMQuery query);


    /**
     * 封禁操作
     * 禁言
     * 禁止登录
     *
     * @param query {@link com.luckygames.wmxz.gamemaster.model.view.request.BanQuery}
     * @return
     */
    public String banRole(GMQuery query);

    /**
     * 查询玩家信息
     *
     * @param  query {@link com.luckygames.wmxz.gamemaster.model.view.request.RoleInfoQuery}
     * @return
     */
    public String queryRoleInfo(GMQuery query);


    /**
     * 参数
     *
     * @param reqParams
     * @return
     */
    default String encodeReqParams(Map<String, String> reqParams) {
        StringBuilder sb = new StringBuilder("?");
        reqParams.forEach((k, v) -> sb.append(k).append("=").append(v).append("&"));
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }


    /**
     * 通用请求处理
     *
     * @param reqParams
     * @param restTemplate
     * @param host
     * @return
     */
    default String commonRequest(String reqParams, RestTemplate restTemplate, String host,int port, String url) {
        //String strParams = encodeReqParams(reqParams);
        //http://127.0.0.1:20010
        String http = "http://" + host + ":" + port;
        ResponseEntity<String> result = restTemplate.getForEntity(http + url + reqParams, String.class);
        System.out.println(result.getBody());
        return result.getBody();
    }
}

