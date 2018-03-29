package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CommonController extends BaseController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

//    @GetMapping("/error")
//    public String error() {
//        return "error";
//    }
}
