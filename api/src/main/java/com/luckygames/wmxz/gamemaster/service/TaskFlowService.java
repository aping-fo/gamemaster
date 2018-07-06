package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.TaskFlowEntity;
import com.luckygames.wmxz.gamemaster.model.entity.TaskFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.TaskFlowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface TaskFlowService extends BaseService<TaskFlowEntity> {
    Page<TaskFlow> searchPage(TaskFlowSearchQuery query);
}
