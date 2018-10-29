package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RecoveryGoodsQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by lucky on 2018/3/29.
 */
public interface AdminService {
    /**
     * 聊天监控
     * @param conten
     * @return
     */
    public  String chatMonitoring(GMQuery conten);
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
     * @param content
     * @return
     */
    public String queryRoleInfo(String content);


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
     * @param serverId
     * @return
     */
    default String commonRequest(String reqParams, RestTemplate restTemplate, Long serverId, String url) {
        String host = getHost(serverId);
        ResponseEntity<String> result = restTemplate.getForEntity(host + url + reqParams, String.class);
        System.out.println(result.getBody());
        return result.getBody();
    }

    public String getHost(Long serverId);

    /**
     * 踢人
     */
    public String kickLine(GMQuery query);

    //更新激活码
    public String sendActivationCode(ActivationCodeQuery query);

    //物品回收
    public String recoveryGoods(RecoveryGoodsQuery query);

    //获取玩家信息
    public String getPlayerName(GMQuery query);

    //模拟充值
    public String pay(GMQuery query);

    //新增玩家
    public String queryNewPlayer(GMQuery query);
}

