import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntityExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerCharacterMapper;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerMapper;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class playerDataGenerator {
    @Autowired
    private PlayerMapper playerMapper;
    @Autowired
    private PlayerCharacterMapper playerCharacterMapper;
    @Autowired
    private PlayerOrderMapper playerOrderMapper;

    @Test
    @Commit
    public void GeneratePlayerData() {
        for (long i = 0; i < 900; i++) {
            Player player = new Player();
            player.setPlayerId(i+1);
            player.setChannelId(RandomUtils.nextLong(1, 4));
            Date date = new Date();
            player.setCreateTime(date);
            playerMapper.insertSelective(player);
            PlayerCharacter playerCharacter = new PlayerCharacter();
            playerCharacter.setPlayerId(player.getPlayerId());
            playerCharacter.setCharId(playerCharacter.getPlayerId());

            PlayerOrderEntityExample example = new PlayerOrderEntityExample();
            PlayerOrderEntityExample.Criteria criteria = example.createCriteria();
            criteria.andStatusEqualTo(Status.NORMAL)
                    .andCharIdEqualTo(playerCharacter.getCharId());
            example.setOrderByClause("paid_date asc");
            List<PlayerOrderEntity> playerOrder = playerOrderMapper.selectByExample(example);
            if (playerOrder != null && !playerOrder.isEmpty()) {
                playerCharacter.setFirstRechargeTime(playerOrder.get(0).getPaidDate());
            }
            playerCharacter.setServerId(RandomUtils.nextLong(1, 4));
            playerCharacter.setCreateTime(date);
            playerCharacter.setPlayerId(i+1);
            playerCharacterMapper.insertSelective(playerCharacter);
        }
    }
}
