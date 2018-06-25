package com.luckygames.wmxz.gamemaster.service.base;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

public interface BaseService<T extends BaseEntity> {
    Long create(T obj);

    void update(T obj);

    Long save(T obj);

    void delete(T obj);

    Mapper<T> getMapper();

}
