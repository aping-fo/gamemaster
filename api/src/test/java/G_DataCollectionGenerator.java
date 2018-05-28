import com.luckygames.wmxz.gamemaster.GamemasterApplication;
import com.luckygames.wmxz.gamemaster.service.ReportService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GamemasterApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class G_DataCollectionGenerator {
    @Autowired
    private ReportService reportService;

    @Test
    @Commit
    public void G01_generateDataCollectionReportToday() {
        reportService.generateDataCollectionReportToday();
    }
}
