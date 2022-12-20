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

import java.time.Duration;

public class C06_RadioButton {
    //    Go to URL:  https://www.facebook.com/
//    Click on Create an Account button.
//    Then click on the radio buttons.


    WebDriver driver;

    @Before
    public void setup() {

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // driver imiz maximize edildi
        driver.manage().window().maximize();

        //sayfanin yuklenmesi beklendi

    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
       // driver.quit();
    }


    @Test
    public void RadioButtons() {


        driver.get("https://www.facebook.com/");
        WebElement Kaydol = driver.findElement(By.xpath("//a[contains(@data-testid, 'registration-form')]"));
        Kaydol.click();

        WebElement kadinRadio = driver.findElement(By.xpath("//*[@name ='sex' and @value='1']"  ));
        WebElement ErkekRadio = driver.findElement(By.xpath("//*[@name ='sex' and @value='2']"  ));
        kadinRadio.click();
        ErkekRadio.click();

        Assert.assertTrue(ErkekRadio.isSelected());
        Assert.assertTrue(!kadinRadio.isSelected());


    }
}