package UmitPractice.HomePage.Umityeni;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown {

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
    public void dropDown() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        //select.selectByIndex(2);
       // select.selectByValue("8");
        select.selectByVisibleText("NEPAL");





    }
    }
