package com.luckygames.wmxz.gamemaster.service.base;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseNewServiceImpl<T extends BaseNewEntity> implements BaseNewService<T> {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Long create(T entity) {
        entity.setCreateTime(DateUtils.Now());
        entity.setUpdateTime(DateUtils.Now());

        this.getMapper().insertSelective(entity);

        return entity.getId();
    }

    @Override
    public void update(T entity) {
        //BaseEntity entity = BeanUtils.copyProperties(obj, BaseEntity.class);
        entity.setUpdateTime(DateUtils.Now());
        this.getMapper().updateByPrimaryKeySelective(entity);
    }

    @Override
    public Long save(T obj) {
        if (obj.getId() == null) {
            this.create(obj);
        } else {
            this.update(obj);
        }

        return obj.getId();
    }

    @Override
    public void delete(T obj) {
//        obj.setStatus(Status.DELETED);
        update(obj);
    }
}
