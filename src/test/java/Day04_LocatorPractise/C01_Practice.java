package Day04_LocatorPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Practice {

    //Navigate to website  https://testpages.herokuapp.com/styled/index.html
// Under the ORIGINAL CONTENTS
// Click on Alerts
// Print the URL
// Navigate back
// Print the URL
// Click on Basic Ajax
// Print the URL
// Enter value  20 and Enter
// And then verify Submitted Values is displayed open page
// Close driver.
    WebDriver driver;

    @Before
    public void setup(){

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));














        // driver imiz maximize edildi
        driver.manage().window().maximize();

        //sayfanin yuklenmesi beklendi

    }

    @After
    public void tearDown(){

        // driver imiz kapatildi
        //driver.quit();
    }



    @Test
    public void test(){

        //LinkedIn sitesine gidildi
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // id Locator -> "session_key"

        WebElement alertsLink = driver.findElement(By.xpath("//*[@id='alerts']"));
        alertsLink.click();
         // Current Url yazdirildi
        String alertsUrl =driver.getCurrentUrl();
        System.out.println(alertsUrl);
        driver.navigate().back();
        // Current URL print edildi.
        String homeUrL = driver.getCurrentUrl();
        System.out.println(homeUrL);

        WebElement basicAjaxLink = driver.findElement(By.id("basicajax"));
        basicAjaxLink.click();


        //basic AJAX URL PRINT EDILDI.

        String basicAjaxUrl = driver.getCurrentUrl();
        System.out.println(basicAjaxUrl);



        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);


         WebElement submittedValuesText = driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertTrue(submittedValuesText.isDisplayed());

    }




}
