package com.luckygames.wmxz.gamemaster.service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntity;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.GiftpackageAddMapper;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageAdd;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.GiftpackageAddSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
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
        GiftpackageAdd giftpackageAdd=new GiftpackageAdd();
        giftpackageAdd.setName(giftpackageAddSearchQuery.getName());
        giftpackageAdd.setDes(giftpackageAddSearchQuery.getDes());
        giftpackageAdd.setIsbinding(giftpackageAddSearchQuery.getIsBinding());
        giftpackageAdd.setGoods0Name(giftpackageAddSearchQuery.getGoods0Name());
        giftpackageAdd.setGoods0Count(giftpackageAddSearchQuery.getGoods0Count());
        giftpackageAdd.setGoods1Name(giftpackageAddSearchQuery.getGoods1Name());
        giftpackageAdd.setGoods1Count(giftpackageAddSearchQuery.getGoods1Count());
        giftpackageAdd.setGoods2Name(giftpackageAddSearchQuery.getGoods2Name());
        giftpackageAdd.setGoods2Count(giftpackageAddSearchQuery.getGoods2Count());
        giftpackageAdd.setGoods3Name(giftpackageAddSearchQuery.getGoods3Name());
        giftpackageAdd.setGoods3Count(giftpackageAddSearchQuery.getGoods3Count());
        giftpackageAdd.setGoods4Name(giftpackageAddSearchQuery.getGoods4Name());
        giftpackageAdd.setGoods4Count(giftpackageAddSearchQuery.getGoods4Count());
        create(giftpackageAdd);
    }

    @Override
    public List<GiftpackageAdd> searchType() {
        return GiftpackageAddMapper.queryGiftpackageAddReport();
    }
}
