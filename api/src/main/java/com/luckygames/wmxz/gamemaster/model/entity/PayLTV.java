package com.luckygames.wmxz.gamemaster.model.entity;

import com.luckygames.wmxz.gamemaster.dao.PayLTVEntity;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;

import java.util.Map;

public class PayLTV extends PayLTVEntity {
    private Map<LTVDaysType, PayLTVDay> daysMap;

    public Map<LTVDaysType, PayLTVDay> getDaysMap() {
        return daysMap;
    }

    public void setDaysMap(Map<LTVDaysType, PayLTVDay> daysMap) {
        this.daysMap = daysMap;
    }
}