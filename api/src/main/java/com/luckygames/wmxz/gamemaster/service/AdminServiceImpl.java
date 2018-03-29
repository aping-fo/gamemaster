package com.luckygames.wmxz.gamemaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lucky on 2018/3/29.
 * GM管理
 */
@RestController
@EnableAutoConfiguration
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${global.gmHost}")
    private String host;

}
