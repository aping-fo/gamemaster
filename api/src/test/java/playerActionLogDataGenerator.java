import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class playerActionLogDataGenerator {
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

    @Test
    @Commit
    public void GeneratePlayerData() {
        long channelCount = this.channelService.countChannles();
        long serverCount = this.serverService.countServers();
        long playerCount = this.playerService.countPlayers();

        for (long i = 0; i < 200000; i++) {
            PlayerActionLog playerActionLog = new PlayerActionLog();
            playerActionLog.setDeviceId("" + (i + 1));
            playerActionLog.setAction(RandomUtils.nextInt(1, 6));
            playerActionLog.setActionDate(DateUtils.RandomDateTime(DateUtils.StringToDate("2018-03-01"), DateUtils.StringToDate("2018-06-01")));
            playerActionLog.setChannelId(RandomUtils.nextLong(1, channelCount));
            playerActionLog.setServerId(RandomUtils.nextLong(1, serverCount));
            playerActionLog.setPlayerId(RandomUtils.nextLong(1, playerCount));
            playerActionLog.setCharId(playerActionLog.getPlayerId());
            if (playerActionLog.getAction() == 5) {
                playerActionLog.setOnlineTime(RandomUtils.nextLong(5000, 200000));
            }
            playerActionLogService.save(playerActionLog);
        }
    }

    @Test
    @Commit
    public void generatePlayerActionDailyReportToday() {
        playerActionDailyService.generatePlayerActionDailyReportToday();
    }

    @Test
    @Commit
    public void generatePlayerActionDailyReportYesterday() {
        playerActionDailyService.generatePlayerActionDailyReportYesterday();
    }

    @Test
    @Commit
    public void generatePlayerActionDailyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-03-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-05-31", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            playerActionDailyService.generatePlayerActionDailyReportByDay(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            localDate = localDate.plusDays(1);
        }

    }

}