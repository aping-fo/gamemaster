import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerActionLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class playerActionLogDataGenerator {
    @Autowired
    private PlayerActionLogMapper playerActionLogMapper;

    @Test
    @Commit
    public void GeneratePlayerData() {
        for (long i = 0; i < 20000; i++) {
            PlayerActionLog playerActionLog = new PlayerActionLog();
            playerActionLog.setId(  i + 1);
            playerActionLog.setDeviceId("" + (i + 1));
            playerActionLog.setAction(RandomUtils.nextInt(3, 5));
            playerActionLog.setActionDate(DateUtils.RandomDateTime(DateUtils.StringToDate("2018-04-13"), DateUtils.StringToDate("2018-04-20")));
            playerActionLog.setChannelId(RandomUtils.nextLong(1, 4));
            playerActionLog.setServerId(RandomUtils.nextLong(1, 4));
            playerActionLog.setPlayerId((i + 1) % 2500);
            playerActionLog.setCharId((i + 1) % 2500);
            playerActionLog.setOnlineTime(RandomUtils.nextLong(1000, 2000));
            playerActionLogMapper.insert(playerActionLog);
        }
    }
}
