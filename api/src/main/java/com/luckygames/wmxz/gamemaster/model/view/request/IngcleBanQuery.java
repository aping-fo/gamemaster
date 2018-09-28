package com.luckygames.wmxz.gamemaster.model.view.request;

/**
 * Created by lucky on 2018/9/26.
 */
public class IngcleBanQuery {
    private String gameId; //游戏ID,每个游戏的唯一标识
    private String closureType; //1封禁操作，2解封操作
    private String closureWay; //封禁类型：1禁言, 2封号，3禁ip，4禁IMEI，5 踢下线
    private String closureAccount; //需要封禁或解禁的目标，根据封禁类型值不同：1禁言：角色ID，2封号：玩家账号，3禁IP：IP，4禁IMEI：IMEI，5 踢下线：角色ID
    private String closureRemark; //封禁/解封原因
    private String serverId; //发言游戏区服ID
    private String closureTime; //封禁时间（按秒数，-1为永久封禁），解封操作时传0
    private String timestamp; //当前操作时间戳，精确到秒，签名验证时请使用这个值
    private String sign; //签名

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getClosureType() {
        return closureType;
    }

    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    public String getClosureWay() {
        return closureWay;
    }

    public void setClosureWay(String closureWay) {
        this.closureWay = closureWay;
    }

    public String getClosureAccount() {
        return closureAccount;
    }

    public void setClosureAccount(String closureAccount) {
        this.closureAccount = closureAccount;
    }

    public String getClosureRemark() {
        return closureRemark;
    }

    public void setClosureRemark(String closureRemark) {
        this.closureRemark = closureRemark;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getClosureTime() {
        return closureTime;
    }

    public void setClosureTime(String closureTime) {
        this.closureTime = closureTime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
