

import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
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
public class rechargeDailyTest {

    @Autowired
    private RechargeDailyService rechargeDailyService;

    @Test
    @Commit
    public void buildData() {
        rechargeDailyService.generateRechargeDailyReportToday();
    }
}
