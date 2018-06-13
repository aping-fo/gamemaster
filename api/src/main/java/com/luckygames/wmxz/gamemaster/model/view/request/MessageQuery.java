package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

/**
 * Created by lucky on 2018/3/29.
 * 系统消息
 */
public class MessageQuery extends GMQuery {
    /**
     * 消息内容
     */
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
