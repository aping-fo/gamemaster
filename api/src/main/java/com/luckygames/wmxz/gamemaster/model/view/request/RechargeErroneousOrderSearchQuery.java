package com.luckygames.wmxz.gamemaster.model.view.request;

public class RechargeErroneousOrderSearchQuery extends CommonSearchQuery {
    private String orderCode;
    private String userName;
    private String charName;
    private Boolean repeat;
    private Boolean successfulOrder;

    public Boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(Boolean repeat) {
        this.repeat = repeat;
    }

    public Boolean getSuccessfulOrder() {
        return successfulOrder;
    }

    public void setSuccessfulOrder(Boolean successfulOrder) {
        this.successfulOrder = successfulOrder;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

}
