package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

/**
 * Created by lucky on 2018/3/29.
 */
public interface AdminNewService {
    /**
     * 踢人
     */
    public String commonAction(GMQuery query,String actionUrl);

    /**
     * 根据服务器id获取服务器ip
     * @param serverId 服务器id
     * @return         服务器ip
     */
    public String getHost(Long serverId);
}

