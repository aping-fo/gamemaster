package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import java.math.BigDecimal;
import javax.persistence.Table;

@Table(name="pay_ltv_day")
public class PayLTVDayEntity extends BaseEntity {
    private Long payLtvId;

    private LTVDaysType days;

    private BigDecimal average;

    private BigDecimal summary;

    public Long getPayLtvId() {
        return payLtvId;
    }

    public void setPayLtvId(Long payLtvId) {
        this.payLtvId = payLtvId;
    }

    public LTVDaysType getDays() {
        return days;
    }

    public void setDays(LTVDaysType days) {
        this.days = days;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public BigDecimal getSummary() {
        return summary;
    }

    public void setSummary(BigDecimal summary) {
        this.summary = summary;
    }
}