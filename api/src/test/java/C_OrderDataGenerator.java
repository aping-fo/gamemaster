import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@Ignore
public class C_OrderDataGenerator {
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
    @Commit
    public void C01_generateOrderData() {
        long playerCount = this.playerService.countPlayers();

        for (int i = 0; i < 20000; i++) {
            PlayerOrder playerOrder = new PlayerOrder();
            playerOrder.setPlayerId(RandomUtils.nextLong(1, playerCount + 1));
            Player player = playerService.getByPlayerId(playerOrder.getPlayerId());

            playerOrder.setCharId(playerOrder.getPlayerId());
            PlayerCharacter playerCharacter = this.playerCharacterService.getByCharId(playerOrder.getCharId());

            playerOrder.setRechargedDate(DateUtils.RandomDateTime(playerCharacter.getCreateTime(), DateUtils.StringToDate("2018-06-01")));

            playerOrder.setOrderCode(DateUtils.DateTimeToStringCompact(playerOrder.getRechargedDate()));

            playerOrder.setChannelId(player.getChannelId());
            Channel channel = this.channelService.getByChannelId(playerOrder.getChannelId());
            if (channel != null) {
                playerOrder.setChannelName(channel.getChannelName());
            }
            playerOrder.setServerId(playerCharacter.getServerId());
            Server server = this.serverService.getByServerId(playerOrder.getServerId());
            if (channel != null) {
                playerOrder.setServerName(server.getServerName());
            }

            playerOrder.setCharGold(playerCharacter.getLeftGold());
            playerOrder.setCharLevel(playerCharacter.getLevel());
            playerOrder.setCharName(playerCharacter.getCharName());

            boolean needSave = false;
            if (playerCharacter.getFirstRechargeTime() == null || playerCharacter.getFirstRechargeTime().after(playerOrder.getRechargedDate())) {
                playerCharacter.setFirstRechargeTime(playerOrder.getRechargedDate());
                needSave = true;
            }
            if (playerCharacter.getLastRechargeTime() == null || playerCharacter.getLastRechargeTime().before(playerOrder.getRechargedDate())) {
                playerCharacter.setLastRechargeTime(playerOrder.getRechargedDate());
                needSave = true;
            }
            if (needSave) {
                this.playerCharacterService.save(playerCharacter);
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
