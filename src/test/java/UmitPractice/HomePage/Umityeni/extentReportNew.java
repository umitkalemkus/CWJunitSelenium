package UmitPractice.HomePage.Umityeni;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTestReport;

public class extentReportNew extends BaseTestReport {




    @Test
    public void test(){
        extentTest = extentReports.createTest("My test","Bu bir aciklamadir");
        extentTest.info("amazona gidiliyor");
        driver.get("https://www.amazon.com/");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        extentTest.info("Arama kismina selenium yazdirilir");
        search.sendKeys("selenium");
        extentTest.pass("Test gecerli");


    }
}
