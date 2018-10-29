package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.BroadcastEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.NoticeEntity;
import com.luckygames.wmxz.gamemaster.dao.NoticeSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Notice;
import com.luckygames.wmxz.gamemaster.model.view.request.NoticeSearchQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface NoticeMapper extends BroadcastEntityMapper<NoticeEntity> {
    @SelectProvider(type = NoticeSqlProvider.class, method = "searchPage")
    List<Notice> searchPage(NoticeSearchQuery query);

    @Select("select * from notice where id = #{id}")
    Notice selectById(@Param("id") Long id);

    @Select("SELECT * from(SELECT * FROM notice ORDER by update_time desc) t1 group by t1.notice_group ORDER BY t1.update_time desc")
    List<Notice> searchLast();
}