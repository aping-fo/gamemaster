import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class orderDataGenerator {
    @Autowired
    private PlayerOrderService playerOrderService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private PlayerCharacterService playerCharacterService;

    @Test
    @Transactional
    @Commit
    public void generateOrderData() {
        long channelCount = this.channelService.countChannles();
        long serverCount = this.serverService.countServers();
        long playerCount = this.playerService.countPlayers();

        for (int i = 0; i < 5000; i++) {
            PlayerOrder playerOrder = new PlayerOrder();
            playerOrder.setRechargedDate(DateUtils.RandomDateTime(DateUtils.StringToDate("2018-04-01"), DateUtils.StringToDate("2018-06-01")));

            playerOrder.setOrderCode(DateUtils.DateTimeToStringCompact(playerOrder.getRechargedDate()));
            playerOrder.setChannelId(RandomUtils.nextLong(1, channelCount));
            Channel channel = this.channelService.getByChannelId(playerOrder.getChannelId());
            if (channel != null) {
                playerOrder.setChannelName(channel.getChannelName());
            }
            playerOrder.setServerId(RandomUtils.nextLong(1, serverCount));
            Server server = this.serverService.getByServerId(playerOrder.getServerId());
            if (channel != null) {
                playerOrder.setServerName(server.getServerName());
            }
            playerOrder.setPlayerId(RandomUtils.nextLong(1, playerCount));
            playerOrder.setCharId(playerOrder.getPlayerId());
            PlayerCharacter playerCharacter = this.playerCharacterService.getByCharId(playerOrder.getCharId());
            if (playerCharacter != null) {
                playerOrder.setCharGold(playerCharacter.getLeftGold());
                playerOrder.setCharLevel(playerCharacter.getLevel());
                playerOrder.setCharName(playerCharacter.getCharName());
            }
            playerOrder.setAmount(BigDecimal.valueOf(Math.round(RandomUtils.nextDouble(40, 700))));
            playerOrder.setGoldQuantity((int) Math.round(playerOrder.getAmount().doubleValue() * 10));
            playerOrder.setOrderType("TEST");
            playerOrder.setOrderStatus("TEST");
            playerOrder.setPaidDate(playerOrder.getRechargedDate());
            playerOrder.setStatus(Status.NORMAL);
            this.playerOrderService.save(playerOrder);

            playerOrder.setOrderId(playerOrder.getId());
            this.playerOrderService.save(playerOrder);
        }

    }
}
