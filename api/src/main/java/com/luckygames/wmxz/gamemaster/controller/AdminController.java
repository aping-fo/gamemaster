package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.model.entity.Server;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @作者 周聪
 * @时间 2018/9/12 19:46
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    public static List<Server> serverList = Collections.synchronizedList(new ArrayList<>());

    @RequestMapping(value = "/serverList", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<Server> getServerList(String group, String channel) {
        return serverList;
    }
}
