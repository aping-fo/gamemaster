

import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import com.luckygames.wmxz.gamemaster.service.RechargeMonthlyService;
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
    @Autowired
    private RechargeMonthlyService rechargeMonthlyService;

    @Test
    @Commit
    public void generateRechargeDailyReportToday() {
        rechargeDailyService.generateRechargeDailyReportToday();
    }

    @Test
    @Commit
    public void generateRechangeMonthlyReportToday() {
        rechargeMonthlyService.generateRechargeMonthlyReportToday();
    }

    @Test
    @Commit
    public void generateRechargeDailyReportYesterday() {
        rechargeDailyService.generateRechargeDailyReportYesterDay();
    }

    @Test
    @Commit
    public void generateRechangeMonthlyReportYesterday() {
        rechargeMonthlyService.generateRechargeMonthlyReportYesterday();
    }
}
