package com.luckygames.wmxz.gamemaster.common.constants;

/**
 * Created by lucky on 2018/3/29.
 * GM管理地址
 */
public enum AdminUrl {
    BAN("/ban", "封禁操作"),
    MESSAGE("/sendSysMsg", "系统消息"),
    MAIL("/sendMail", "发送邮件");

    private final String url;
    private final String desc;

    private AdminUrl(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public String getDesc() {
        return desc;
    }
}
