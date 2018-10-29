package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.NoticeEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Notice;
import com.luckygames.wmxz.gamemaster.model.view.request.NoticeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

import java.util.List;

public interface NoticeService extends BaseNewService<NoticeEntity> {
    Page<Notice> searchPage(NoticeSearchQuery query);

    void  deleteById(Long id);

    Notice searchById(Long id);

    List<Notice> searchLast();
}
