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
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class CheckBox_RadioButton {


    //    Go to https://the-internet.herokuapp.com/checkboxes
//    Locate the elements of checkboxes.
//    Then click on checkbox 1 if box is not selected.
//    Then click on checkbox 2 if box is not selected.
//    Then verify that checkbox 1 is checked.

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
        //driver.quit();
    }


    @Test
    public void checkboxes() {


        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement checkbox1 = Checkboxes.get(0);
        WebElement checkbox2 = Checkboxes.get(1);

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        } else if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertFalse(!checkbox1.isSelected());


    }

    @Test
    public void radioButtons() {
        //    Go to URL:  https://www.facebook.com/
       //    Click on Create an Account button.
       //    Then click on the radio buttons.

        driver.get("https://www.facebook.com/");
        WebElement cookies = driver.findElement(By.xpath("//*[@title = 'Allow all cookies']"));
        cookies.click();

        WebElement Kaydol = driver.findElement(By.xpath("//a[contains(@data-testid, 'registration-form')]"));
        Kaydol.click();

        WebElement kadinRadio = driver.findElement(By.xpath("//*[@name ='sex' and @value='1']"  ));
        WebElement ErkekRadio = driver.findElement(By.xpath("//*[@name ='sex' and @value='2']"  ));
        kadinRadio.click();
        ErkekRadio.click();

        Assert.assertTrue(ErkekRadio.isSelected());
        Assert.assertTrue(!kadinRadio.isSelected());


    }


        //a[@data-testid='open-registration-form-button']










    }


