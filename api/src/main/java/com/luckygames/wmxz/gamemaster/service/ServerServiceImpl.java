package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.Server;
import com.luckygames.wmxz.gamemaster.dao.ServerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serverService")
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerMapper serverMapper;

    public List<Server> test() {
        List<Server> list = serverMapper.selectAll();
        return list;
    }
}
