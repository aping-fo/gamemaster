package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseNewEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="player_new")
public class PlayerEntity extends BaseNewEntity {
    private Long playerId;

    private String accname;

    private String name;

    private Byte sex;

    private Byte vocation;

    private Integer exp;

    private Integer coin;

    private Integer diamond;

    private Integer chargediamond;

    private Integer vip;

    private Integer energy;

    private Date regtime;

    private Date lastlogintime;

    private Date lastlogouttime;

    private String ip;

    private Integer sceneid;

    private Float x;

    private Float y;

    private Integer lastsceneid;

    private Short lev;

    private Integer crit;

    private Integer hp;

    private Integer symptom;

    private Integer fu;

    private Integer fight;

    private Float z;

    private Integer fashionid;

    private Integer gangid;

    private Integer totalcoin;

    private Integer weaponid;

    private Long energytime;

    private Integer totaldiamond;

    private String channel;

    private Integer attack;

    private Integer defense;

    private Integer title;

    private Integer achievement;

    private Long serverId;

    private Long type;

    private Long amount;

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname == null ? null : accname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getVocation() {
        return vocation;
    }

    public void setVocation(Byte vocation) {
        this.vocation = vocation;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    public Integer getChargediamond() {
        return chargediamond;
    }

    public void setChargediamond(Integer chargediamond) {
        this.chargediamond = chargediamond;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getLastlogouttime() {
        return lastlogouttime;
    }

    public void setLastlogouttime(Date lastlogouttime) {
        this.lastlogouttime = lastlogouttime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Integer getLastsceneid() {
        return lastsceneid;
    }

    public void setLastsceneid(Integer lastsceneid) {
        this.lastsceneid = lastsceneid;
    }

    public Short getLev() {
        return lev;
    }

    public void setLev(Short lev) {
        this.lev = lev;
    }

    public Integer getCrit() {
        return crit;
    }

    public void setCrit(Integer crit) {
        this.crit = crit;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getSymptom() {
        return symptom;
    }

    public void setSymptom(Integer symptom) {
        this.symptom = symptom;
    }

    public Integer getFu() {
        return fu;
    }

    public void setFu(Integer fu) {
        this.fu = fu;
    }

    public Integer getFight() {
        return fight;
    }

    public void setFight(Integer fight) {
        this.fight = fight;
    }

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    public Integer getFashionid() {
        return fashionid;
    }

    public void setFashionid(Integer fashionid) {
        this.fashionid = fashionid;
    }

    public Integer getGangid() {
        return gangid;
    }

    public void setGangid(Integer gangid) {
        this.gangid = gangid;
    }

    public Integer getTotalcoin() {
        return totalcoin;
    }

    public void setTotalcoin(Integer totalcoin) {
        this.totalcoin = totalcoin;
    }

    public Integer getWeaponid() {
        return weaponid;
    }

    public void setWeaponid(Integer weaponid) {
        this.weaponid = weaponid;
    }

    public Long getEnergytime() {
        return energytime;
    }

    public void setEnergytime(Long energytime) {
        this.energytime = energytime;
    }

    public Integer getTotaldiamond() {
        return totaldiamond;
    }

    public void setTotaldiamond(Integer totaldiamond) {
        this.totaldiamond = totaldiamond;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getAchievement() {
        return achievement;
    }

    public void setAchievement(Integer achievement) {
        this.achievement = achievement;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}