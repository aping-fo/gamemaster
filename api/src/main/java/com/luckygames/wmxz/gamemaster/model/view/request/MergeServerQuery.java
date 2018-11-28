package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

public class MergeServerQuery extends GMQuery {
    private Long fromServer;
    private String fromIp;
    private String dbName;

    public MergeServerQuery(Long serverId, Long fromServer, String fromIp, String dbName) {
        super(serverId);
        this.fromServer = fromServer;
        this.fromIp = fromIp;
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Long getFromServer() {
        return fromServer;
    }

    public void setFromServer(Long fromServer) {
        this.fromServer = fromServer;
    }

    public String getFromIp() {
        return fromIp;
    }

    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }
}
