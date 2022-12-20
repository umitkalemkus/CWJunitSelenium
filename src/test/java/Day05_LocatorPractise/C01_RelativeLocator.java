package Day05_LocatorPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public class C01_RelativeLocator {
// Go to http://www.bestbuy.com
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

        //LinkedIn sitesine gidildi
        driver.get("http://www.bestbuy.com");
        // id Locator -> "session_key"

        Assert.assertTrue("Title Best kelimesini icermiyor ",driver.getTitle().contains("Best"));


        // lOGO LOCATE EDILIYOR
        By logoLOCATOR = RelativeLocator.with(By.tagName("img")).above(By.xpath("//div[text()='Hello!']"));
        WebElement logo = driver.findElement(logoLOCATOR);
        Assert.assertTrue(logo.isDisplayed());



        //mexixo link locate edilip kontrol ediliyor.

        By MexicoLinkLocator = RelativeLocator.with(By.tagName("a")).toRightOf(By.xpath("//div[@lang='en']//a[@class='us-link']"));
        WebElement mexicoLink  = driver.findElement(MexicoLinkLocator);
        Assert.assertTrue(mexicoLink.isDisplayed());








    }
}
