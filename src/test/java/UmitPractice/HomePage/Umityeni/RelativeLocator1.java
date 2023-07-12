package UmitPractice.HomePage.Umityeni;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocator1 {

  //  / Go to http://www.bestbuy.com
// Verify that the page title contains "Best" Also, using Relative Locator.
// LogoTest  Verify if the BestBuy logo is displayed.
// mexicoLinkTest  Verify if the link is displayed.

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
    public void relativeLocator() {
        driver.get("http://www.bestbuy.com");
        System.out.println("driver.getTitle().toLowerCase() = " + driver.getTitle().toLowerCase());
        Assert.assertTrue("Title Best kelimesi icermiyor" ,driver.getTitle().contains("Best"));

       By logoLocator = RelativeLocator.with(By.tagName("img")).above(By.xpath("//div[text()='Hello!']"));
       WebElement logo = driver.findElement(logoLocator);

       Assert.assertTrue(logo.isDisplayed());



       // mexicoLinkTest

        By UsaLinkTest = RelativeLocator.with(By.tagName("img")).toRightOf(By.xpath("(//h4[text()='Canada'])[1]"));
        WebElement flag = driver.findElement(UsaLinkTest);
        Assert.assertTrue(flag.isDisplayed());




    }
    }
