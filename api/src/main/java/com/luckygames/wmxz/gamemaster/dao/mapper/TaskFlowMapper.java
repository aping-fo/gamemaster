package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.TaskFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.TaskFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.TaskFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.TaskFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.TaskFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface TaskFlowMapper extends TaskFlowEntityMapper<TaskFlowEntity> {
    @SelectProvider(type = TaskFlowSqlProvider.class, method = "searchPage")
    Page<TaskFlow> searchPage(TaskFlowSearchQuery query);
}
