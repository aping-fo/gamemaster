package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.GiftpackageAddMapper;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageAdd;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageAddSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("GiftpackageAddService")
public class GiftpackageAddServiceImpl extends BaseServiceImpl<GiftpackageAddEntity> implements GiftpackageAddService {
    @Autowired
    private GiftpackageAddMapper GiftpackageAddMapper;

    @Override
    public Mapper<GiftpackageAddEntity> getMapper() {
        return GiftpackageAddMapper;
    }

    @Override
    public void addGiftpackage(GiftpackageAddSearchQuery giftpackageAddSearchQuery) {
        GiftpackageAdd giftpackageAdd = new GiftpackageAdd();
        giftpackageAdd.setName(giftpackageAddSearchQuery.getName());
        giftpackageAdd.setDes(giftpackageAddSearchQuery.getDes());
        giftpackageAdd.setGoods(giftpackageAddSearchQuery.getGoods());
        create(giftpackageAdd);
    }

    @Override
    public List<GiftpackageAdd> searchType() {
        return GiftpackageAddMapper.queryGiftpackageAddReport();
    }
}
