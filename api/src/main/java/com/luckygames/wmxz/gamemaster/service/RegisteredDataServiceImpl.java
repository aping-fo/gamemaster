package com.luckygames.wmxz.gamemaster.service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RegisteredDataEntity;
import com.luckygames.wmxz.gamemaster.dao.RegisteredDataExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.RegisteredDataMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RegisteredData;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RegisteredDataSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("RegisteredDataService")
public class RegisteredDataServiceImpl extends BaseServiceImpl<RegisteredDataEntity> implements RegisteredDataService {
    @Autowired
    private RegisteredDataMapper RegisteredDataMapper;

    @Override
    public Mapper<RegisteredDataEntity> getMapper() {
        return RegisteredDataMapper;
    }

    @Override
    public Page<RegisteredData> searchPage(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> RegisteredDataMapper.searchPage(query));
    }

    @Override
    public void save(RegisteredData registeredData) {
        RegisteredDataMapper.save(registeredData);
    }
}
