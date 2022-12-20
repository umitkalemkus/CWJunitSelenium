package UmitPractice.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Sliders {
   /* 1) Open the browser
     2) Enter the URL “http://practice.automationtesting.in/”
   // 3) Click on Shop Menu
     4) Now click on Home menu button
     5) Test whether the Home page has Three Sliders only
     6) The Home page must contains only three sliders
    */

    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));






    }

    @After
    public void TearDown (){
        //driver.quit();


    }

    @Test
    public void test (){
        driver.get("http://practice.automationtesting.in/");

        WebElement Shop = driver.findElement(By.id("menu-item-40"));
        Shop.click();


        WebElement HomePage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/nav/a"));
        HomePage.click();















    }

}
