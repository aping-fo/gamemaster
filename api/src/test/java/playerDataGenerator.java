import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@Transactional(propagation = Propagation.REQUIRED)
public class playerDataGenerator {
//    @Autowired
//    private PlayerMapper playerMapper;
//    @Autowired
//    private PlayerCharacterMapper playerCharacterMapper;
//    @Autowired
//    private PlayerOrderMapper playerOrderMapper;

    @Test
    @Commit
    public void GeneratePlayerData() {
//        for (long i = 0; i < 30000; i++) {
//            Player player = new Player();
//            player.setPlayerId(i);
//            player.setChannelId(RandomUtils.nextLong(1, 6));
//            playerMapper.insertSelective(player);
//            PlayerCharacter playerCharacter = new PlayerCharacter();
//            playerCharacter.setPlayerId(player.getPlayerId());
//            playerCharacter.setCharId(playerCharacter.getPlayerId());
//
//            PlayerOrderExample example = new PlayerOrderExample();
//            PlayerOrderExample.Criteria criteria = example.createCriteria();
//            criteria.andStatusEqualTo(Status.NORMAL)
//                    .andCharIdEqualTo(playerCharacter.getCharId());
//            example.setOrderByClause("paid_date asc");
//            List<PlayerOrder> playerOrder = playerOrderMapper.selectByExample(example);
//            if (playerOrder != null && !playerOrder.isEmpty()) {
//                playerCharacter.setFirstRechargeTime(playerOrder.get(0).getPaidDate());
//            }
//            playerCharacterMapper.insertSelective(playerCharacter);
//        }
    }
}
