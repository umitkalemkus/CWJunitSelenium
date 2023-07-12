package UmitPractice.HomePage.Umityeni;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locator_Practise_1 {

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
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }



    @After
    public void teardown(){
        //driver.quit();



    }


    @Test
    public void test() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alertLink = driver.findElement(By.id("alerts"));
        alertLink.click();
        String alertsUrl =driver.getCurrentUrl();
        System.out.println("alertsUrl = " + alertsUrl);
        driver.navigate().back();
        String homeUrl = driver.getCurrentUrl();
        System.out.println("homeUrl = " + homeUrl);
        WebElement BasicAjax = driver.findElement(By.id("basicajax"));
        BasicAjax.click();
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        WebElement Submitvaluestxt = driver.findElement(By.xpath("//p[text() ='Submitted Values']"));
        Assert.assertTrue(Submitvaluestxt.isDisplayed());



        //guru99 sitesini incele ekstra locator icin









    }








}
