package com.luckygames.wmxz.gamemaster.service.base;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Long create(T entity) {
        entity.setStatus(Status.NORMAL);
        entity.setCreateTime(DateUtils.now());
        entity.setUpdateTime(DateUtils.now());

        this.getMapper().insertSelective(entity);

        return entity.getId();
    }

    @Override
    public void update(T entity) {
        //BaseEntity entity = BeanUtils.copyProperties(obj, BaseEntity.class);
        entity.setUpdateTime(DateUtils.now());
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
}
