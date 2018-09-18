package com.luckygames.wmxz.gamemaster.data;

/**
* w物品配置表.xlsx(自动生成，请勿编辑！)
*/
public class GoodsConfig {
	public int id;//物品id
	public String atlas;//图集
	public String name;//名称
	public String name_en;//名称
	public int[][] decompose;//分解获得
	public int[] copys;//产出副本ID
	public int buyPrice;//购买价格
	public int sellPrice;//出售价格
	public int type;//物品类型
	public int level;//等级
	public int vocation;//职业要求
	public int color;//物品品质
	public int maxStack;//可叠加数量
	public int[] contentsRates;//获得物品权重
	public int[][] contents;//使用后获得物品
	public int hp;//生命
	public int attack;//威力
	public int defense;//防御
	public int symptom;//异常
	public int crit;//暴击
	public int fu;//抗性
	public int[] param1;//参数1
	public int[][] param2;//参数2
	public int rare;//稀缺
	public int tipsType;//提示框类型
	public int[][] openId;//跳转界面ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtlas() {
        return atlas;
    }

    public void setAtlas(String atlas) {
        this.atlas = atlas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public int[][] getDecompose() {
        return decompose;
    }

    public void setDecompose(int[][] decompose) {
        this.decompose = decompose;
    }

    public int[] getCopys() {
        return copys;
    }

    public void setCopys(int[] copys) {
        this.copys = copys;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVocation() {
        return vocation;
    }

    public void setVocation(int vocation) {
        this.vocation = vocation;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(int maxStack) {
        this.maxStack = maxStack;
    }

    public int[] getContentsRates() {
        return contentsRates;
    }

    public void setContentsRates(int[] contentsRates) {
        this.contentsRates = contentsRates;
    }

    public int[][] getContents() {
        return contents;
    }

    public void setContents(int[][] contents) {
        this.contents = contents;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSymptom() {
        return symptom;
    }

    public void setSymptom(int symptom) {
        this.symptom = symptom;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getFu() {
        return fu;
    }

    public void setFu(int fu) {
        this.fu = fu;
    }

    public int[] getParam1() {
        return param1;
    }

    public void setParam1(int[] param1) {
        this.param1 = param1;
    }

    public int[][] getParam2() {
        return param2;
    }

    public void setParam2(int[][] param2) {
        this.param2 = param2;
    }

    public int getRare() {
        return rare;
    }

    public void setRare(int rare) {
        this.rare = rare;
    }

    public int getTipsType() {
        return tipsType;
    }

    public void setTipsType(int tipsType) {
        this.tipsType = tipsType;
    }

    public int[][] getOpenId() {
        return openId;
    }

    public void setOpenId(int[][] openId) {
        this.openId = openId;
    }
}