package com.luckygames.wmxz.gamemaster.model.view.request;

public class RegisteredDataSearchQuery extends CommonSearchQuery {
    private String orderCode;
    private String userName;
    private String charName;
    private Integer goldQuantityFrom;
    private Integer goldQuantityTo;

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

    public Integer getGoldQuantityFrom() {
        return goldQuantityFrom;
    }

    public void setGoldQuantityFrom(Integer goldQuantityFrom) {
        this.goldQuantityFrom = goldQuantityFrom;
    }

    public Integer getGoldQuantityTo() {
        return goldQuantityTo;
    }

    public void setGoldQuantityTo(Integer goldQuantityTo) {
        this.goldQuantityTo = goldQuantityTo;
    }
}
