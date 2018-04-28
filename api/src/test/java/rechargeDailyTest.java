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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
    public void generateRechargeMonthlyReportToday() {
        rechargeMonthlyService.generateRechargeMonthlyReportToday();
    }

    @Test
    @Commit
    public void generateRechargeDailyReportYesterday() {
        rechargeDailyService.generateRechargeDailyReportYesterDay();
    }

    @Test
    @Commit
    public void generateRechargeMonthlyReportYesterday() {
        rechargeMonthlyService.generateRechargeMonthlyReportYesterday();
    }

    @Test
    @Commit
    public void generateRechargeDailyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-03-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-05-31", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            rechargeDailyService.generateRechargeDailyReportByDay(Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant()));
            localDate = localDate.plusDays(1);
        }
    }

    @Test
    @Commit
    public void generateRechargeMonthlyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-03-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-05-31", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            rechargeMonthlyService.generateRechargeMonthlyReportByDay(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            localDate = localDate.plusDays(1);
        }

    }
}
