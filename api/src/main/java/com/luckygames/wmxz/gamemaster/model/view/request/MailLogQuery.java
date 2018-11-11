package com.luckygames.wmxz.gamemaster.model.view.request;

import com.luckygames.wmxz.gamemaster.model.view.base.GMQuery;

/**
 * Created by lucky on 2018/3/29.
 * 邮件
 */
public class MailLogQuery extends GMQuery {
    /**
     * 标题
     */
    private String title;

    /**
     * 邮件内容
     */
    private String content;

    /**
     * 奖励，奖励格式：itemId:count,itemId:count .....
     */
    private String rewards;

    /**
     * 角色id列表，列表格式id1,id2 ...... ，全服的时候此参数为null
     */
    private String ids;
    /**
     * 全服邮件，最小等级限制 ,非全服邮件此参数为null
     */
    private Integer min_lev;
    /**
     * 服邮件，最大等级限制 ,非全服邮件此参数为null
     */
    private Integer max_lev;
    /**
     * 全服邮件，职业限制(1,2,3) ,非全服邮件此参数为null
     */
    private Integer vocation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getMin_lev() {
        return min_lev;
    }

    public void setMin_lev(Integer min_lev) {
        this.min_lev = min_lev;
    }

    public Integer getMax_lev() {
        return max_lev;
    }

    public void setMax_lev(Integer max_lev) {
        this.max_lev = max_lev;
    }

    public Integer getVocation() {
        return vocation;
    }

    public void setVocation(Integer vocation) {
        this.vocation = vocation;
    }

    public MailLogQuery(Long serverId, String title, String content, String ids, Integer min_lev, Integer max_lev, Integer vocation, String rewards) {
        super(serverId);
        this.title = title;
        this.content = content;
        this.rewards = rewards;
        this.ids = ids;
        this.min_lev = min_lev;
        this.max_lev = max_lev;
        this.vocation = vocation;
    }
}
