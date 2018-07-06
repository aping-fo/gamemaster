import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.ActionType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@Ignore
public class A_PlayerDataGenerator {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private PlayerOrderService playerOrderService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private PlayerActionLogService playerActionLogService;


    @Test
    @Commit
    public void A01_generatePlayerData() {
        long channelCount = this.channelService.countChannles();
        for (long i = 0; i < 1000; i++) {
            Player player = this.playerService.getByPlayerId(i + 1);
            if (player != null) {
                continue;
            }
            Date registerDate = DateUtils.RandomDateTime(DateUtils.StringToDate("2018-01-01"), DateUtils.StringToDate("2018-06-01"));

            player = new Player();
            player.setPlayerId(i + 1);
            player.setStatus(Status.NORMAL);
            player.setChannelId(RandomUtils.nextLong(1, channelCount + 1));
            Channel channel = this.channelService.getByChannelId(player.getChannelId());
            if (channel != null) {
                player.setChannelName(channel.getChannelName());
                channelService.fixOpenDate(player.getChannelId(), registerDate);
            }
            player.setCreateDevice(RandomStringUtils.randomAlphanumeric(32));
            player.setCreateMac(RandomStringUtils.randomAlphanumeric(32));
            player.setIdCard(RandomStringUtils.randomNumeric(18));
            player.setMobile(RandomStringUtils.randomNumeric(11));
            player.setUsername(RandomStringUtils.randomAlphanumeric(10));
            player.setCreateIp(String.format("%d.%d.%d.%d", RandomUtils.nextInt(1, 250), RandomUtils.nextInt(1, 250), RandomUtils.nextInt(1, 250), RandomUtils.nextInt(1, 250)));


            this.playerService.save(player);

            player.setCreateTime(registerDate);
            this.playerService.save(player);

        }
    }

    @Test
    @Commit
    public void A02_generatCharacterData() {
        long serverCount = this.serverService.countServers();
        for (long i = 0; i < 1000; i++) {
            PlayerCharacter playerCharacter = this.playerCharacterService.getByCharId(i + 1);
            if (playerCharacter != null) {
                continue;
            }

            playerCharacter = new PlayerCharacter();
            playerCharacter.setPlayerId(i + 1);
            playerCharacter.setCharId(i + 1);
            playerCharacter.setStatus(Status.NORMAL);
            Player player = this.playerService.getByPlayerId(playerCharacter.getPlayerId());
            if (player != null) {
                playerCharacter.setCharName(player.getUsername());
            }
            playerCharacter.setLeftCoin(RandomUtils.nextLong(0, 50000));
            playerCharacter.setExp(RandomUtils.nextInt(1, 500000));
            playerCharacter.setLeftGold(RandomUtils.nextInt(0, 5000));
            playerCharacter.setLevel(RandomUtils.nextInt(1, 50));
            playerCharacter.setPower(RandomUtils.nextInt(1000, 1000000));
            playerCharacter.setServerId(RandomUtils.nextLong(1, serverCount + 1));
            Server server = this.serverService.getByServerId(playerCharacter.getServerId());
            if (server != null) {
                playerCharacter.setServerName(server.getServerName());
                this.serverService.fixOpenDate(playerCharacter.getServerId(), player.getCreateTime());
            }

            this.playerCharacterService.save(playerCharacter);
            playerCharacter.setCreateTime(player.getCreateTime());
            this.playerCharacterService.save(playerCharacter);

            PlayerActionLog playerActionLog = new PlayerActionLog();
            playerActionLog.setAction(ActionType.ACTIVATE);
            playerActionLog.setActionDate(player.getCreateTime());
            playerActionLog.setChannelId(player.getChannelId());
            playerActionLog.setServerId(playerCharacter.getServerId());
            playerActionLog.setDeviceId(player.getCreateDevice());
            playerActionLog.setPlayerId(player.getPlayerId());
            playerActionLog.setCharId(playerCharacter.getCharId());
            playerActionLog.setStatus(Status.NORMAL);
            playerActionLogService.save(playerActionLog);

            playerActionLog.setId(null);
            playerActionLog.setAction(ActionType.NEW_PLAYER);
            playerActionLogService.save(playerActionLog);

            playerActionLog.setId(null);
            playerActionLog.setAction(ActionType.NEW_CHAR);
            playerActionLogService.save(playerActionLog);
        }
    }
}
