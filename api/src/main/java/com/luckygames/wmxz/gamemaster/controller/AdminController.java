package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.entity.Notice;
import com.luckygames.wmxz.gamemaster.model.entity.Online;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeQuery;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @作者 周聪
 * @时间 2018/9/12 19:46
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    public static List<Server> serverList = Collections.synchronizedList(new ArrayList<>());
    public static Notice notice = new Notice();

    @Autowired
    private ActivationCodeService activationCodeService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private OnlineService onlineService;

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
    public Notice getNotice() {
        return notice;
    }

    //获取激活码
    @RequestMapping(value = "/activationCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<ActivationCode> getActivationCode(Long serverId) {
        return activationCodeService.searchByServerId(serverId);
    }

    //更新激活码
    @RequestMapping(value = "/updateActivationCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void addActivationCode(ActivationCode activationCode) {
        activationCode.setUseTime(new Date());
        activationCodeService.update(activationCode);
        new Thread(() -> adminService.sendActivationCode(new ActivationCodeQuery(activationCode.getServerId(), "update"))).start();
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
}
