package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/server")
public class ServerController extends BaseController {
    @Autowired
    private ServerService serverService;

    @GetMapping(value = "/")
    public Response search() {
        return null;
    }
}
