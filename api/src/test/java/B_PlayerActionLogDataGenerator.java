import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.enums.ActionType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@Ignore
public class B_PlayerActionLogDataGenerator {
    @Autowired
    private PlayerActionLogService playerActionLogService;
    @Autowired
    private PlayerActionDailyService playerActionDailyService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private CharacterDailyService characterDailyService;

//    @Test
//    @Commit
//    @Ignore
//    public void B01_generatePlayerActionLogData() {
//        long channelCount = this.channelService.countChannles();
//        long serverCount = this.serverService.countServers();
//        long playerCount = this.playerService.countPlayers();
//
//        for (long i = 0; i < 20000; i++) {
//            PlayerActionLog playerActionLog = new PlayerActionLog();
//            playerActionLog.setDeviceId("" + (i + 1));
//            playerActionLog.setAction((int) i % 5 + 1);//RandomUtils.nextInt(1, 6));
//            playerActionLog.setActionDate(DateUtils.RandomDateTime(DateUtils.StringToDate("2018-01-01"), DateUtils.StringToDate("2018-06-01")));
//            playerActionLog.setChannelId(RandomUtils.nextLong(1, channelCount));
//            Channel channel = this.channelService.getByChannelId(playerActionLog.getChannelId());
//            if (channel != null) {
//                boolean needSave = false;
//                if (channel.getOpenDate() == null || channel.getOpenDate().after(playerActionLog.getActionDate())) {
//                    channel.setOpenDate(DateUtils.AddDays(playerActionLog.getActionDate(), -2));
//                    needSave = true;
//                }
//                if (needSave) {
//                    this.channelService.save(channel);
//                }
//            }
//            playerActionLog.setServerId(RandomUtils.nextLong(1, serverCount));
//            Server server = this.serverService.getByServerId(playerActionLog.getServerId());
//            if (channel != null) {
//                boolean needSave = false;
//                if (server.getOpenDate() == null || server.getOpenDate().after(playerActionLog.getActionDate())) {
//                    server.setOpenDate(DateUtils.AddDays(playerActionLog.getActionDate(), -2));
//                    needSave = true;
//                }
//                if (needSave) {
//                    this.serverService.save(server);
//                }
//            }
//
//            playerActionLog.setPlayerId(RandomUtils.nextLong(1, playerCount));
//            playerActionLog.setCharId(playerActionLog.getPlayerId());
//            if (playerActionLog.getAction() == 5) {
//                playerActionLog.setOnlineTime(RandomUtils.nextLong(5000, 200000));
//            }
//            playerActionLogService.save(playerActionLog);
//        }
//    }

    @Test
    @Commit
    public void B05_generatePlayerLoginLogoutData() {
        long charCount = this.playerCharacterService.countCharaters();
        for (long i = 0; i < 20000; i++) {
            long charId = RandomUtils.nextLong(1, charCount);
            PlayerCharacter character = playerCharacterService.getByCharId(charId);
            if (character == null) {
                continue;
            }
            Player player = playerService.getByPlayerId(character.getPlayerId());
            if (player == null) {
                continue;
            }
            Date endDate = DateUtils.StringToDate("2018-06-01");
            Date lastLogoff = playerActionLogService.getCharaterLastLogout(character.getCharId());
            lastLogoff = (lastLogoff == null) ? character.getCreateTime() : lastLogoff;
            if (lastLogoff.after(endDate)) {
                continue;
            }

            Date actionDate = DateUtils.RandomDateTime(lastLogoff, endDate);
            PlayerActionLog actionLog = new PlayerActionLog();
            actionLog.setCharId(character.getCharId());
            actionLog.setPlayerId(player.getPlayerId());
            actionLog.setServerId(character.getServerId());
            actionLog.setChannelId(player.getChannelId());
            actionLog.setActionDate(actionDate);
            actionLog.setAction(ActionType.ONLINE);
            actionLog.setDeviceId(player.getCreateDevice());
            actionLog.setStatus(Status.NORMAL);
            playerActionLogService.save(actionLog);

            int onlineTime = RandomUtils.nextInt(300, 21600);
            actionDate = DateUtils.addSeconds(actionDate, onlineTime);
            actionLog.setId(null);
            actionLog.setActionDate(actionDate);
            actionLog.setAction(ActionType.OFFLINE);
            actionLog.setOnlineTime((long) onlineTime);
            playerActionLogService.save(actionLog);

        }
    }

    @Test
    @Commit
    @Ignore
    public void B04_generatePlayerActionDailyReportToday() {
        playerActionDailyService.generatePlayerActionDailyReportToday();
    }

    @Test
    @Commit
    @Ignore
    public void B03_generatePlayerActionDailyReportYesterday() {
        playerActionDailyService.generatePlayerActionDailyReportYesterday();
    }

    @Test
    @Commit
    public void B02_generatePlayerActionDailyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            playerActionDailyService.generatePlayerActionDailyReportByDay(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            localDate = localDate.plusDays(1);
        }

    }

    @Test
    @Commit
    public void B06_generateCharacterDailyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            characterDailyService.generateCharacterDailyReportByDate(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            localDate = localDate.plusDays(1);
        }

    }
}