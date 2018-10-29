package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;


/**
 * Created by lucky on 2018/3/29.
 * 充值
 */
public class NewPlayerQuery extends GMQuery {
    private String startDate;
    private String endDate;

    public NewPlayerQuery(Long serverId, String startDate, String endDate) {
        super(serverId);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
