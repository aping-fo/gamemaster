package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Prohibition;
import com.luckygames.wmxz.gamemaster.model.view.request.ProhibitionSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface ProhibitionService extends BaseNewService<ProhibitionEntity> {
    Page<Prohibition> searchPage(ProhibitionSearchQuery query);

    Prohibition checkInfo(Prohibition prohibition);
}
