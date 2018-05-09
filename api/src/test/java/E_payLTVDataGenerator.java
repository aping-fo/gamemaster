import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.service.PayLTVDayService;
import com.luckygames.wmxz.gamemaster.service.PayLTVService;
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
public class E_payLTVDataGenerator {
    @Autowired
    private PayLTVService payLTVService;
    @Autowired
    private PayLTVDayService payLTVDayService;

    @Test
    @Commit
    public void E02_generatePayLTVDailyReportToday() {
        payLTVService.generatePayLTVDailyReportToday();
        payLTVDayService.generatePayLTVDayReportToday();
    }

    @Test
    @Commit
    public void E01_generatePayLTVDailyReportYesterday() {
        payLTVService.generatePayLTVDailyReportYesterday();
        payLTVDayService.generatePayLTVDayReportYesterday();
    }

    @Test
    @Commit
    public void E03_generatePayLTVDailyReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            payLTVService.generatePayLTVDailyReportByDay(Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant()));
            localDate = localDate.plusDays(1);
        }

    }

    @Test
    @Commit
    public void E03_generatePayLTVDayReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            payLTVDayService.generatePayLTVDayReportByDate(Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant()));
            localDate = localDate.plusDays(1);
        }

    }
}
