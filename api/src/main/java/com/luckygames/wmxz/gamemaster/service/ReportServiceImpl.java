package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntity;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntityExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.DataCollectionMapper;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reportService")
public class ReportServiceImpl implements ReportService {
    @Autowired
    private DataCollectionMapper dataCollectionMapper;

    @Override
    public Page<DataCollection> searchPage(DataCollectionSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> dataCollectionMapper.queryRechargeDailyReport(query));
    }

    @Override
    public Page<DataCollection> searchChannelDataPage(ChannelDataSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> dataCollectionMapper.queryChannelDataReport(query));
    }

    @Override
    public Page<DataCollection> searchChannelDailyPage(ChannelDataSearchQuery query,Integer type) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> dataCollectionMapper.queryChannelDailyReport(query,type));
    }

    @Override
    public void generateDataCollectionReportToday() {
        List<DataCollection> list = dataCollectionMapper.queryDataCollectionReportFromOrderSingleDate(DateUtils.Now());
        if (list == null || list.isEmpty()) {
            return;
        }
        saveDataCollectionReport(list);
    }

    private void saveDataCollectionReport(List<DataCollection> list) {
        list.forEach(r -> {
            DataCollection dataCollection = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (dataCollection == null) {
                dataCollection = new DataCollection();
            }
            Long id = dataCollection.getId();
            BeanUtils.copyProperties(dataCollection, r);
            if (r.getId() == null) {
                dataCollectionMapper.insertSelective(r);
            } else {
                dataCollectionMapper.updateByPrimaryKeySelective(r);
            }
        });
    }

    @Override
    public DataCollection findOne(Long channelId, Long serverId, String date) {
        DataCollectionEntityExample example = new DataCollectionEntityExample();
        DataCollectionEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(date);
        List<DataCollectionEntity> dataCollectionList = dataCollectionMapper.selectByExample(example);
        if (dataCollectionList == null || dataCollectionList.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(dataCollectionList.get(0), DataCollection.class);
    }
}