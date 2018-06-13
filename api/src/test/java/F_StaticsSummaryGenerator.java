import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.service.StaticsSummaryService;
import org.junit.FixMethodOrder;
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
public class F_StaticsSummaryGenerator {

    @Autowired
    private StaticsSummaryService staticsSummaryService;

    @Test
    @Commit
    public void F02_generateStaticsSummaryReportToday() {
        staticsSummaryService.generateStaticsSummaryReportToday();
    }

    @Test
    @Commit
    public void F01_generateStaticsSummaryReportYesterday() {
        staticsSummaryService.generateStaticsSummaryReportYesterday();
    }

    @Test
    @Commit
    public void F03_generateStaticsSummaryReportAll() {
        LocalDate startDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDate = startDate.atStartOfDay();
        while (!localDate.isAfter(endDate.atStartOfDay())) {
            staticsSummaryService.generateStaticsSummaryReportByDay(Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant()));
            localDate = localDate.plusDays(1);
        }
    }

}
