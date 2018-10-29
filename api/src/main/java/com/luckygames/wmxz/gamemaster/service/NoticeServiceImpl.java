package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.NoticeEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.NoticeMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Notice;
import com.luckygames.wmxz.gamemaster.model.view.request.NoticeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("NoticeService")
public class NoticeServiceImpl extends BaseNewServiceImpl<NoticeEntity> implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public Mapper<NoticeEntity> getMapper() {
        return this.noticeMapper;
    }

    @Override
    public Page<Notice> searchPage(NoticeSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> noticeMapper.searchPage(query));
    }

    @Override
    public void deleteById(Long id) {
        noticeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Notice searchById(Long id) {
        return noticeMapper.selectById(id);
    }

    @Override
    public List<Notice> searchLast() {
        return noticeMapper.searchLast();
    }
}
