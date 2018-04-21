import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
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
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class orderDataGenerator {
    @Autowired
    private PlayerOrderMapper playerOrderMapper;

    @Test
    @Transactional
    @Commit
    public void generateOrderData() {
        for (int i = 0; i < 500; i++) {
            Date date = new Date();
            PlayerOrder playerOrder = new PlayerOrder();
            playerOrder.setOrderCode(DateUtils.DateTimeToStringCompact(date));
            playerOrder.setChannelId(RandomUtils.nextLong(1, 4));
            playerOrder.setServerId(RandomUtils.nextLong(1, 4));
            playerOrder.setPlayerId(RandomUtils.nextLong(1, 900));
            playerOrder.setCharId((long) (i+1));
            playerOrder.setAmount(BigDecimal.valueOf(RandomUtils.nextDouble(100, 5000)));
            playerOrder.setGoldQuantity((int) Math.round(playerOrder.getAmount().doubleValue() * 10));
            playerOrder.setOrderType("TEST");
            playerOrder.setOrderStatus("TEST");
            playerOrder.setRechargedDate(date);
            playerOrder.setPaidDate(playerOrder.getRechargedDate());
            playerOrder.setStatus(Status.NORMAL);
            playerOrder.setCharGold(RandomUtils.nextInt(0, 5000));
            playerOrder.setCharLevel(RandomUtils.nextInt(10, 80));
            playerOrderMapper.insertSelective(playerOrder);
            playerOrder.setOrderId(playerOrder.getId());
            playerOrderMapper.updateByPrimaryKeySelective(playerOrder);
        }

    }
}
