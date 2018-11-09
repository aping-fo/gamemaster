package com.luckygames.wmxz.gamemaster.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.luckygames.wmxz.gamemaster.config.ThreadPoolConfig;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.dao.AccountLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.request.BanQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.KickLineQuery;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.HttpRequestUtil;
import com.luckygames.wmxz.gamemaster.utils.TimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @作者 周聪
 * @时间 2018/9/12 19:46
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {
    public static List<Server> serverList = Collections.synchronizedList(new ArrayList<>());
    public static List<Notice> noticeList = Collections.synchronizedList(new ArrayList<>());
    public static List<Recharge> rechargeList = Collections.synchronizedList(new ArrayList<>());
    private static final Integer GAMEID = 2008;//密钥id
    private static final String GAMEKEY = "00c4392347b1865bd3fd6f0af5b8b26b";//密钥
    public static final String RETURN_SUCCESS = "success";// 成功

    public static final int BAN_CHAT = 1;//禁言
    public static final int BAN_LOGIN = 2;//封号
    public static final int BAN_IP = 3;//禁ip
    public static final int BAN_IMEI = 4;//禁IMEI
    public static final int KICK_LINE = 5;//踢下线

    public static final int BAN_PROHIBITION = 1;//封禁
    public static final int BAN_UNSEAL = 2;//解封

    public static final int QUERY_FAIL = -1;//未查找到数据

    public static final String PAY_FAIL = "PAY_FAIL";//支付失败
    public static final String PAY_FAIL_IOS = "FAILURE";//支付失败

    @Autowired
    private ActivationCodeService activationCodeService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private OnlineService onlineService;
    @Autowired
    private AccountLogService accountLogService;
    @Autowired
    private ProhibitionService prohibitionService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private RechargeService rechargeService;

    //获取服务器列表
    @RequestMapping(value = "/serverList", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<Server> getServerList(String group, String channel) {
        List<Server> list = new ArrayList<>();
        if (StringUtils.isNotBlank(group)) {
            serverList.forEach(s -> {
                if (s.getServerGroup().equals(group)) {
                    list.add(s);
                }
            });
        } else {
            return serverList;
        }

        if (StringUtils.isNotBlank(channel)) {
            serverList.forEach(s -> {
                if (s.getChannel().equals(channel)) {
                    list.add(s);
                }
            });
        } else {
            return serverList;
        }

        return list;
    }

    //获取登录公告
    @RequestMapping(value = "/notice", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Notice getNotice(String group, String channel) {
        return noticeList.stream().filter(n -> n.getNoticeGroup().equals(group)).collect(Collectors.toList()).get(0);
    }

    //获取激活码
    @RequestMapping(value = "/activationCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<ActivationCode> activationCode(Long serverId) {
        return activationCodeService.searchByServerId(serverId);
    }

    //更新激活码
    @RequestMapping(value = "/updateActivationCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void updateActivationCode(ActivationCode activationCode) {
        activationCode.setUseTime(new Date());
        activationCodeService.update(activationCode);
        if (activationCode.getServerId() == 0 && activationCode.getUniversal() != 1) {
            activationCodeService.updateAllActivationCode(activationCode.getUseServerId(), activationCode.getName());
        }
    }

    //当前在线人数
    @RequestMapping(value = "/onlinePlayer", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void onlinePlayer(Online online) {
        if (online.getMaxRoleCount() == null) {
            online.setMaxRoleCount("0");
        }
        onlineService.save(online);
    }

    //账户登录日志
    @RequestMapping(value = "/accountLog", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void accountLog(AccountLogEntity accountLogEntity) {
        accountLogService.save(accountLogEntity);
    }

    //封禁
    @RequestMapping(value = "/prohibition", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String accountLog(Prohibition prohibition) {
        JSONObject json = new JSONObject();
        if (!GAMEID.equals(prohibition.getGameId())) {
            json.put("code", 2);
            json.put("msg", "gameId无效");
            return json.toJSONString();
        }

        StringBuffer param = new StringBuffer();
        param.append(prohibition.getGameId())
                .append(prohibition.getClosureType())
                .append(prohibition.getClosureWay())
                .append(prohibition.getTimestamp())
                .append(GAMEKEY);
        String validateSign = md5(param.toString());
        if (!validateSign.equals(prohibition.getSign())) {
            json.put("code", 3);
            json.put("msg", "签名错误");
            return json.toJSONString();
        }

        String result;
        if (prohibition.getClosureWay() == KICK_LINE) {
            result = adminService.kickLine(
                    new KickLineQuery(
                            prohibition.getServerId(),
                            Long.parseLong(prohibition.getClosureAccount())
                    )
            );
        } else {
            result = adminService.banRole(
                    new BanQuery(
                            prohibition.getServerId(),
                            prohibition.getClosureType(),
                            prohibition.getClosureWay(),
                            prohibition.getClosureTime(),
                            prohibition.getClosureAccount()
                    )
            );
        }

        if (result.equals(RETURN_SUCCESS)) {
            if (prohibition.getClosureWay() != KICK_LINE) {
                Date time = new Date();
                time.setTime(time.getTime() + TimeUtil.ONE_SECOND * prohibition.getClosureTime());
                prohibition.setEndTime(time);
                Prohibition prohibition1 = prohibitionService.checkInfo(prohibition);
                if (prohibition1 == null) {
                    prohibitionService.save(prohibition);
                } else {
                    prohibition.setId(prohibition1.getId());
                    prohibitionService.update(prohibition);
                }
            }
            StringBuffer msg = new StringBuffer();
            if (prohibition.getClosureType() == BAN_PROHIBITION) {
                msg.append("封禁");
            } else if (prohibition.getClosureType() == BAN_UNSEAL) {
                msg.append("解封");
            }

            if (prohibition.getClosureWay() == BAN_CHAT) {
                msg.append("发言");
            } else if (prohibition.getClosureWay() == BAN_LOGIN) {
                msg.append("登录");
            } else if (prohibition.getClosureWay() == BAN_IP) {
                msg.append("IP");
            } else if (prohibition.getClosureWay() == BAN_IMEI) {
                msg.append("IMEI");
            } else if (prohibition.getClosureWay() == KICK_LINE) {
                msg = new StringBuffer("踢人");
            }
            msg.append("成功");
            json.put("code", 1);
            json.put("msg", msg);
            return json.toJSONString();
        } else {
            json.put("code", 4);
            json.put("msg", "游戏服出错");
            return json.toJSONString();
        }
    }

    //md5转换
    private String md5(String planText) {
        StringBuilder ciperText = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = (messageDigest.digest(planText.getBytes(Charset.forName("UTF-8"))));
            for (byte b : bytes) {
                ciperText.append(Character.forDigit((b >> 4) & 0x0f, 16));
                ciperText.append(Character.forDigit(b & 0x0f, 16));
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error("md5检验异常：", e);
        }
        return ciperText.toString();
    }

    //查询封禁状态
    @RequestMapping(value = "/prohibitionState", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String prohibitionState(Prohibition prohibition) {
        JSONArray jsonArray = new JSONArray();

        if (!GAMEID.equals(prohibition.getGameId())) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 2);
            jsonObject.put("msg", "gameId无效");
            jsonArray.add(jsonObject);
            return jsonArray.toJSONString();
        }

        StringBuffer param = new StringBuffer();
        param.append(prohibition.getGameId())
                .append(prohibition.getTimestamp())
                .append(GAMEKEY);
        String validateSign = md5(param.toString());
        if (!validateSign.equals(prohibition.getSign())) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 3);
            jsonObject.put("msg", "签名错误");
            jsonArray.add(jsonObject);
            return jsonArray.toJSONString();
        }

        if (prohibition.getCheckType() == null || prohibition.getCheckType() == 1) {//对象
            JSONObject checkInfo = JSONObject.parseObject(prohibition.getCheckInfo());
            check(prohibition, jsonArray, checkInfo);
        } else if (prohibition.getCheckType() == 2) {//数组
            JSONArray checkInfo = JSONArray.parseArray(prohibition.getCheckInfo());
            for (int i = 0; i < checkInfo.size(); i++) {
                JSONObject object = checkInfo.getJSONObject(i);//把每一个对象转成json对象
                check(prohibition, jsonArray, object);
            }
        }

        return jsonArray.toJSONString();
    }

    //封禁检查
    private void check(Prohibition prohibition, JSONArray jsonArray, JSONObject object) {
        Prohibition p = new Prohibition();
        p.setClosureWay(object.getInteger("closureWay"));
        p.setClosureAccount(object.getString("closureAccount"));
        p.setServerId(object.getLong("serverId"));
        Prohibition prohibition1 = prohibitionService.checkInfo(p);

        JSONObject jsonObject = new JSONObject();
        StringBuffer msg = new StringBuffer();
        if (prohibition1 == null) {
            jsonObject.put("closureWay", prohibition.getClosureWay());
            jsonObject.put("closureAccount", prohibition.getClosureAccount());
            jsonObject.put("serverId", prohibition.getServerId());
            jsonObject.put("state", QUERY_FAIL);
            msg.append("未找到查询对像");
            jsonObject.put("msg", msg);
        } else {
            jsonObject.put("closureWay", prohibition1.getClosureWay());
            jsonObject.put("closureAccount", prohibition1.getClosureAccount());
            jsonObject.put("serverId", prohibition1.getServerId());
            jsonObject.put("state", prohibition1.getClosureType());
            if (prohibition1.getClosureType() == BAN_PROHIBITION) {
                msg.append("封禁中");
            } else if (prohibition1.getClosureType() == BAN_UNSEAL) {
                msg.append("未解封");
            }
            jsonObject.put("msg", msg);
        }

        jsonArray.add(jsonObject);
    }

    //支付分发
    @RequestMapping(value = "/recharge", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String recharge(HttpServletRequest req) {
        String agent = req.getParameter("agent"); //渠道代号
        String cpOrderId = req.getParameter("cp_order_id"); //cp游戏订单号
        String gameId = req.getParameter("game_id"); //平台游戏id
        String orderId = req.getParameter("order_id"); //平台订单号
        String orderStatus = req.getParameter("order_status"); //订单状态 2为支付成功，其他值统一为失败处理
        String payTime = req.getParameter("pay_time"); //支付时间
        String playerIdStr = req.getParameter("player_id"); //玩家平台id
        String productId = req.getParameter("product_id"); //商品id
        String productName = req.getParameter("product_name"); //商品名
        String productPriceStr = req.getParameter("product_price"); //商品金额
        String sign = req.getParameter("sign"); //签名
        String ext = req.getParameter("ext"); //透传参数

        String[] arr = ext.split("_");
        if (arr.length < 6) {
            logger.error("透传参数错误，透传参数=" + ext);
            return PAY_FAIL;
        }

        StringBuffer parameter = new StringBuffer();
        parameter.append("agent=").append(agent)
                .append("&cp_order_id=").append(cpOrderId)
                .append("&game_id=").append(gameId)
                .append("&order_id=").append(orderId)
                .append("&order_status=").append(orderStatus)
                .append("&pay_time=").append(payTime)
                .append("&player_id=").append(playerIdStr)
                .append("&product_id=").append(productId)
                .append("&product_name=").append(productName)
                .append("&product_price=").append(productPriceStr)
                .append("&sign=").append(sign)
                .append("&ext=").append(ext);

        Server server = serverService.getByServerId(Long.parseLong(arr[5]));
        logger.info("安卓支付分发，分发服务器" + server.getServerName());

        return HttpRequestUtil.sendPost(server.getPayAddress(), parameter.toString());
    }

    //支付分发
    @RequestMapping(value = "/rechargeIOS", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String rechargeIOS(HttpServletRequest req) {
        String appId = req.getParameter("app_id"); //游戏ID
        String cpOrderId = req.getParameter("cp_order_id"); //游戏传入的外部订单号。服务器会根据这个订单号生成对应的平台订单号，请保证每笔订单传入的订单号的唯一性
        String memId = req.getParameter("mem_id"); //玩家ID
        String orderId = req.getParameter("order_id"); //平台订单号
        String orderStatus = req.getParameter("order_status"); //平台订单状态,2为平台订单支付成功，非2是支付异常
        String payTime = req.getParameter("pay_time"); //时间戳
        String productId = req.getParameter("product_id"); //商品ID
        String productPrice = req.getParameter("product_price"); //商品价格
        String sign = req.getParameter("sign"); //签名
        String ext = req.getParameter("ext"); //透传信息
        String productName;
        String[] arr;

        try {
            productName = URLEncoder.encode(req.getParameter("product_name"), "UTF-8"); //商品名
            arr = ext.split("_");
        } catch (Exception e) {
            logger.error("透传参数解析错误，透传参数=" + ext);
            return PAY_FAIL_IOS;
        }

        if (arr.length < 6) {
            logger.error("透传参数错误，透传参数=" + ext);
            return PAY_FAIL_IOS;
        }

        StringBuffer parameter = new StringBuffer();
        parameter.append("app_id=").append(appId)
                .append("&cp_order_id=").append(cpOrderId)
                .append("&mem_id=").append(memId)
                .append("&order_id=").append(orderId)
                .append("&order_status=").append(orderStatus)
                .append("&pay_time=").append(payTime)
                .append("&product_id=").append(productId)
                .append("&product_name=").append(productName)
                .append("&product_price=").append(productPrice)
                .append("&sign=").append(sign)
                .append("&ext=").append(ext);

        Server server = serverService.getByServerId(Long.parseLong(arr[5]));
        if (server == null) {
            logger.error("支付分发服务器不存在，服务器ID=" + Long.parseLong(arr[5]));
            return PAY_FAIL_IOS;
        }

        logger.error("IOS支付分发，分发服务器" + server.getServerName());

        return HttpRequestUtil.sendPost(server.getPayAddress() + "IOS", parameter.toString());
    }

    //查询充值返利是否已经领取
    @RequestMapping(value = "/checkReceiveRebate", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public boolean checkReceiveRebate(Recharge recharge) {
        if (rechargeList.contains(recharge)) {
            return true;
        } else {
            rechargeList.add(recharge);
            ThreadPoolConfig.getExecutorService().execute(() -> {
                rechargeService.save(recharge);
            });
            return false;
        }
    }
}
