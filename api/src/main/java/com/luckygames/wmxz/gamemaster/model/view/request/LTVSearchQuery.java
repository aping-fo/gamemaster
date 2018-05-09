package com.luckygames.wmxz.gamemaster.model.view.request;

public class LTVSearchQuery extends CommonSearchQuery {
    private String reportDate;
    private int valueType;

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public int getValueType() {
        return valueType;
    }

    public void setValueType(int valueType) {
        this.valueType = valueType;
    }
}
