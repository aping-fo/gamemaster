package com.luckygames.wmxz.gamemaster.model.view.request;

public class GiftpackageAddSearchQuery extends CommonSearchQuery {
    private String name;
    private String des;
    private Integer isBinding;
    private String goods;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Integer getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(Integer isBinding) {
        this.isBinding = isBinding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

}
