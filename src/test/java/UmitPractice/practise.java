package UmitPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

    WebDriver driver;

    @Before
     public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");




    }
    @Test
    public void IdLocator(){

        WebElement search = driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
        search.sendKeys("Araba");


    }




}
