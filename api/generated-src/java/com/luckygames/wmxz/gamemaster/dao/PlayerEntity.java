package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import java.util.Date;
import javax.persistence.Table;

@Table(name="player")
public class PlayerEntity extends BaseEntity {
    private Integer playerid;

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

    private Short serverid;

    private Date regtime;

    private Date lastlogintime;

    private Date lastlogouttime;

    private String ip;

    private Integer sceneid;

    private Float x;

    private Float y;

    private Integer lastsceneid;

    private Short lev;

    private Integer physicattack;

    private Integer physicdefense;

    private Integer magicattack;

    private Integer magicdefense;

    private Integer crit;

    private Integer critdefense;

    private Integer mp;

    private Integer curmp;

    private Integer hp;

    private Integer curhp;

    private Integer fightstrength;

    private Float z;

    private Integer fashionid;

    private Integer gangid;

    private Integer totalcoin;

    private Integer totalreputation;

    private Integer weaponid;

    private Integer contribute;

    private Long energytime;

    private Integer reputation;

    private Integer totaldiamond;

    private Integer soul;

    private Integer lotteryscore;

    private Integer freediamond;

    private String channel;

    private Integer consumediamon;

    public Integer getPlayerid() {
        return playerid;
    }

    public void setPlayerid(Integer playerid) {
        this.playerid = playerid;
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

    public Short getServerid() {
        return serverid;
    }

    public void setServerid(Short serverid) {
        this.serverid = serverid;
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

    public Integer getPhysicattack() {
        return physicattack;
    }

    public void setPhysicattack(Integer physicattack) {
        this.physicattack = physicattack;
    }

    public Integer getPhysicdefense() {
        return physicdefense;
    }

    public void setPhysicdefense(Integer physicdefense) {
        this.physicdefense = physicdefense;
    }

    public Integer getMagicattack() {
        return magicattack;
    }

    public void setMagicattack(Integer magicattack) {
        this.magicattack = magicattack;
    }

    public Integer getMagicdefense() {
        return magicdefense;
    }

    public void setMagicdefense(Integer magicdefense) {
        this.magicdefense = magicdefense;
    }

    public Integer getCrit() {
        return crit;
    }

    public void setCrit(Integer crit) {
        this.crit = crit;
    }

    public Integer getCritdefense() {
        return critdefense;
    }

    public void setCritdefense(Integer critdefense) {
        this.critdefense = critdefense;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getCurmp() {
        return curmp;
    }

    public void setCurmp(Integer curmp) {
        this.curmp = curmp;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getCurhp() {
        return curhp;
    }

    public void setCurhp(Integer curhp) {
        this.curhp = curhp;
    }

    public Integer getFightstrength() {
        return fightstrength;
    }

    public void setFightstrength(Integer fightstrength) {
        this.fightstrength = fightstrength;
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

    public Integer getTotalreputation() {
        return totalreputation;
    }

    public void setTotalreputation(Integer totalreputation) {
        this.totalreputation = totalreputation;
    }

    public Integer getWeaponid() {
        return weaponid;
    }

    public void setWeaponid(Integer weaponid) {
        this.weaponid = weaponid;
    }

    public Integer getContribute() {
        return contribute;
    }

    public void setContribute(Integer contribute) {
        this.contribute = contribute;
    }

    public Long getEnergytime() {
        return energytime;
    }

    public void setEnergytime(Long energytime) {
        this.energytime = energytime;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getTotaldiamond() {
        return totaldiamond;
    }

    public void setTotaldiamond(Integer totaldiamond) {
        this.totaldiamond = totaldiamond;
    }

    public Integer getSoul() {
        return soul;
    }

    public void setSoul(Integer soul) {
        this.soul = soul;
    }

    public Integer getLotteryscore() {
        return lotteryscore;
    }

    public void setLotteryscore(Integer lotteryscore) {
        this.lotteryscore = lotteryscore;
    }

    public Integer getFreediamond() {
        return freediamond;
    }

    public void setFreediamond(Integer freediamond) {
        this.freediamond = freediamond;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getConsumediamon() {
        return consumediamon;
    }

    public void setConsumediamon(Integer consumediamon) {
        this.consumediamon = consumediamon;
    }
}