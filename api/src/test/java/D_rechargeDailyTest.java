import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.service.RechargeDailyService;
import com.luckygames.wmxz.gamemaster.service.RechargeMonthlyService;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Ignore
public class D_rechargeDailyTest {

    @Autowired
    private RechargeDailyService rechargeDailyService;
    @Autowired
    private RechargeMonthlyService rechargeMonthlyService;

    @Test
    @Commit
    @Ignore
    public void D03_generateRechargeDailyReportToday() {
        rechargeDailyService.generateRechargeDailyReportToday();
    }

    @Test
    @Commit
    @Ignore
    public void D04_generateRechargeMonthlyReportToday() {
        rechargeMonthlyService.generateRechargeMonthlyReportToday();
    }

    @Test
    @Commit
    @Ignore
    public void D05_generateRechargeDailyReportYesterday() {
        rechargeDailyService.generateRechargeDailyReportYesterDay();
    }

    @Test
    @Commit
    @Ignore
    public void D06_generateRechargeMonthlyReportYesterday() {
        rechargeMonthlyService.generateRechargeMonthlyReportYesterday();
    }

    @Test
    @Commit
    public void D01_generateRechargeDailyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            rechargeDailyService.generateRechargeDailyReportByDay(Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant()));
            localDate = localDate.plusDays(1);
        }
    }

    @Test
    @Commit
    public void D02_generateRechargeMonthlyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            rechargeMonthlyService.generateRechargeMonthlyReportByDay(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            localDate = localDate.plusDays(1);
        }

    }
}
