package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenOperationType;
import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenType;
import com.luckygames.wmxz.gamemaster.model.enums.MailType;

import java.util.List;

public class KickLineRequest {
    private Long charId;
    private Long serverId;

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
    }
}
