package com.luckygames.wmxz.gamemaster.model.view.request;

public class RechargeErroneousOrderSearchQuery extends CommonSearchQuery {
    private String orderCode;
    private String userName;
    private String charName;

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
