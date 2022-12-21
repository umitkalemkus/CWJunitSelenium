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

public class Homework {

    //    Go to URL: https://demoqa.com/
//    Click on Elements.
//    Click on Checkbox.
//    Verify if Home checkbox is selected.
//    Verify that "You have selected" is visible.

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


        driver.get("https://demoqa.com/");
        WebElement Elements = driver.findElement(By.xpath("//*[@class='card mt-4 top-card']"));
        Elements.click();

        WebElement Checkbox = driver.findElement(By.xpath("//span[@class='text'] [.='Check Box']"));
        Checkbox.click();


        WebElement HomeButton = driver.findElement(By.xpath("//*[@class='rct-checkbox']"));

        if (!HomeButton.isSelected()){
            HomeButton.click();


        }
        WebElement Result = driver.findElement(By.xpath("//*[@id=\"result\"]"));

        Assert.assertTrue(Result.isDisplayed());


    }
}