package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.BaseInformationMapper;
import com.luckygames.wmxz.gamemaster.model.entity.BaseInformation;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("BaseInformationService")
public class BaseInformationServiceImpl extends BaseServiceImpl<BaseInformationEntity> implements BaseInformationService {
    @Autowired
    private BaseInformationMapper BaseInformationMapper;

    @Override
    public Mapper<BaseInformationEntity> getMapper() {
        return BaseInformationMapper;
    }

    @Override
    public BaseInformation searchById(Integer charId) {
        return BaseInformationMapper.searchById(charId);
    }

    @Override
    public void updateByCharId(BaseInformation baseInformation) {
        BaseInformationMapper.updateByCharId(baseInformation);
    }
}
