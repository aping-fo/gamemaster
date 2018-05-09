import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.service.ChannelService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Ignore
public class serverChannelGenerator {

    private static String[] channelNames = {
            "春江潮水连海平",
            "海上明月共潮生",
            "滟滟随波千万里",
            "何处春江无月明",
            "江流宛转绕芳甸",
            "月照花林皆似霰",
            "空里流霜不觉飞",
            "汀上白沙看不见",
            "江天一色无纤尘",
            "皎皎空中孤月轮",
            "江畔何人初见月",
            "江月何年初照人",
            "人生代代无穷已",
            "江月年年祇相似",
            "不知江月待何人",
            "但见长江送流水",
            "白云一片去悠悠",
            "青枫浦上不胜愁",
            "谁家今夜扁舟子",
            "何处相思明月楼",
            "可怜楼上月徘徊",
            "应照离人妆镜台",
            "玉户帘中卷不去",
            "捣衣砧上拂还来",
            "此时相望不相闻",
            "愿逐月华流照君",
            "鸿雁长飞光不度",
            "鱼龙潜跃水成文",
            "昨夜闲潭梦落花",
            "可怜春半不还家",
            "江水流春去欲尽",
            "江潭落月复西斜",
            "斜月沉沉藏海雾",
            "碣石潇湘无限路",
            "不知乘月几人归",
            "落月摇情满江树"
    };
    private static String[] serverNames = {
            "天地玄黄",
            "宇宙洪荒",
            "日月盈昃",
            "辰宿列张",
            "寒来暑往",
            "秋收冬藏",
            "闰馀成岁",
            "律吕调阳",
            "云腾致雨",
            "露结为霜",
            "金生丽水",
            "玉出昆冈",
            "剑号巨阙",
            "珠称夜光",
            "果珍李柰",
            "菜重芥姜",
            "海咸河淡",
            "鳞潜羽翔",
            "龙师火帝",
            "鸟官人皇",
            "始制文字",
            "乃服衣裳",
            "推位让国",
            "有虞陶唐",
            "吊民伐罪",
            "周发殷汤",
            "坐朝问道",
            "垂拱平章",
            "爱育黎首",
            "臣伏戎羌",
            "遐迩壹体",
            "率宾归王",
            "鸣凤在树",
            "白驹食场",
            "化被草木",
            "赖及万方",
            "盖此身发",
            "四大五常",
            "恭惟鞠养",
            "岂敢毁伤",
            "女慕贞絜",
            "男效才良",
            "知过必改",
            "得能莫忘",
            "罔谈彼短",
            "靡恃己长",
            "信使可覆",
            "器欲难量",
            "墨悲丝染",
            "诗讃羔羊",
            "景行维贤",
            "克念作圣",
            "德建名立",
            "形端表正",
            "空谷传声",
            "虚堂习听",
            "祸因恶积",
            "福缘善庆",
            "尺璧非宝",
            "寸阴是竞",
            "资父事君",
            "曰严与敬",
            "孝当竭力",
            "忠则尽命",
            "临深履薄",
            "夙兴温凊",
            "似兰斯馨",
            "如松之盛",
            "川流不息",
            "渊澄取映",
            "容止若思",
            "言辞安定",
            "笃初诚美",
            "慎终宜令",
            "荣业所基",
            "籍甚无竟",
            "学优登仕",
            "摄职从政",
            "存以甘棠",
            "去而益咏",
            "乐殊贵贱",
            "礼别尊卑",
            "上和下睦",
            "夫唱妇随",
            "外受傅训",
            "入奉母仪",
            "诸姑伯叔",
            "犹子比儿",
            "孔怀兄弟",
            "同气连枝",
            "交友投分",
            "切磨箴规",
            "仁慈隐恻",
            "造次弗离",
            "节义廉退",
            "颠沛匪亏",
            "性静情逸",
            "心动神疲",
            "守真志满",
            "逐物意移",
    };
    @Autowired
    private ServerService serverService;
    @Autowired
    private ChannelService channelService;

    @Test
    @Commit
    //@Ignore
    public void generateServerData() {
        for (int i = 0; i < 2/*serverNames.length*/; i++) {
            Server server = this.serverService.getByServerId((long) i + 1);
            if (server == null) {
                server = new Server();
                server.setServerId((long) i + 1);
                server.setOpenDate(DateUtils.Now());
            }
            server.setServerName(serverNames[i]);
            this.serverService.save(server);
        }
    }

    @Test
    @Commit
    //@Ignore
    public void generateChannelData() {
        for (int i = 0; i < 2/*channelNames.length*/; i++) {
            Channel channel = this.channelService.getByChannelId((long) i + 1);
            if (channel == null) {
                channel = new Channel();
                channel.setChannelId((long) i + 1);
                channel.setOpenDate(DateUtils.Now());
            }
            channel.setChannelName(channelNames[i]);
            this.channelService.save(channel);
        }
    }
}
