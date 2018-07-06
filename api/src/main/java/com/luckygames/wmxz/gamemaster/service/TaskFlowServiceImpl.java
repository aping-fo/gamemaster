package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.TaskFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.TaskFlowMapper;
import com.luckygames.wmxz.gamemaster.model.entity.TaskFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.TaskFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("TaskFlowService")
public class TaskFlowServiceImpl extends BaseServiceImpl<TaskFlowEntity> implements TaskFlowService {
    @Autowired
    private TaskFlowMapper TaskFlowMapper;

    @Override
    public Mapper<TaskFlowEntity> getMapper() {
        return TaskFlowMapper;
    }

    @Override
    public Page<TaskFlow> searchPage(TaskFlowSearchQuery query) {
        return TaskFlowMapper.searchPage(query);
    }
}
