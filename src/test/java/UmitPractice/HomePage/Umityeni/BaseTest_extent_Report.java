package UmitPractice.HomePage.Umityeni;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTest_extent_Report {
     protected WebDriver driver;

     protected ExtentReports extentReports;

     protected ExtentHtmlReporter extentHtmlReporter;

     protected ExtentTest extentTest;





    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();;

        String currentDate = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        String filePath = System.getProperty("user.dir") + "/test-output/reports2/testNewReport"+ currentDate + ".html";

        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);

        extentReports.setSystemInfo("Envoroment","QA");
        extentReports.setSystemInfo("Browser","QA");
        extentHtmlReporter.config().setDocumentTitle("Umit Report");
        extentHtmlReporter.config().setReportName("Test run report");







    }


    @After
    public void tearDown(){

   //   driver.quit();
        extentReports.flush();


    }





}
