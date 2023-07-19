package UmitPractice.HomePage.Umityeni;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseTest;

import java.time.Duration;

public class SeleniumWait extends BaseTest {

    @Test
    public void webdriverWait(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/interaction");






    }





}
