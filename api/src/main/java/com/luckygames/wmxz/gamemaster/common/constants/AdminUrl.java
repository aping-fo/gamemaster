package com.luckygames.wmxz.gamemaster.common.constants;

/**
 * Created by lucky on 2018/3/29.
 * GM管理地址
 */
public enum AdminUrl {
    BAN("/ban", "封禁操作"),
    MESSAGE("/sendSysMsg", "系统消息"),
    GETINFO("/getPlayerByPlayerId", "获取玩家信息"),
    MAIL("/send_mail", "发送邮件"),
    CHAT("/chatMonitoring", "聊天监控"),
    KICK("kickPlayer", "踢人"),
    ACTIVATION_CODE("/update_ActivationCode", "更新激活码"),
    RECOVERY_GOODS("/goods_recovery", "物品回收"),
    GET_INFO_BY_PLAYER_NAME("/getInfo", "通过玩家名称获取玩家信息"),
    PAY("/pay", "充值"),
    NEW_PLAYER("/queryNewPlayer", "新玩家"),
    MERGE_SERVER("/mergeServer", "合服"),
    UPDATE_SERVER("/updateServer", "更新服务器"),
    DIAMONDS_LOG("/diamondsLog", "钻石日志"),
    ITEM_LOG("/itemLog", "物品日志"),
    MAIL_LOG("/mailLog", "邮件日志"),
    ACTIVATION_TITLE("/activationTitle", "激活称号"),
    BROADCAST("KICK_PLAYER", "发送广播");

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
