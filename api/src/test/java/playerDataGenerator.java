import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class playerDataGenerator {
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


    @Test
    @Commit
    public void generatePlayerData() {
        long channelCount = this.channelService.countChannles();
        for (long i = 0; i < 1000; i++) {
            Player player = this.playerService.getByPlayerId(i + 1);
            if (player == null) {
                player = new Player();
            }

            player.setPlayerId(i + 1);
            player.setStatus(Status.NORMAL);
            player.setChannelId(RandomUtils.nextLong(1, channelCount));
            Channel channel = this.channelService.getByChannelId(player.getChannelId());
            if (channel != null) {
                player.setChannelName(channel.getChannelName());
            }
            player.setCreateDevice(RandomStringUtils.randomAlphanumeric(32));
            player.setCreateMac(RandomStringUtils.randomAlphanumeric(32));
            player.setIdCard(RandomStringUtils.randomNumeric(18));
            player.setMobile(RandomStringUtils.randomNumeric(11));
            player.setUsername(RandomStringUtils.randomAlphanumeric(10));
            player.setCreateIp(String.format("%d.%d.%d.%d", RandomUtils.nextInt(1, 250), RandomUtils.nextInt(1, 250), RandomUtils.nextInt(1, 250), RandomUtils.nextInt(1, 250)));


            this.playerService.save(player);
        }
    }

    @Test
    @Commit
    public void generatCharacterData() {
        long serverCount = this.serverService.countServers();
        for (long i = 0; i < 1000; i++) {
            PlayerCharacter playerCharacter = this.playerCharacterService.getByCharId(i + 1);
            if (playerCharacter == null) {
                playerCharacter = new PlayerCharacter();
            }
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
            playerCharacter.setServerId(RandomUtils.nextLong(1, serverCount));
            Server server = this.serverService.getByServerId(playerCharacter.getServerId());
            if (server != null) {
                playerCharacter.setServerName(server.getServerName());
            }

            this.playerCharacterService.save(playerCharacter);
        }
    }
}
