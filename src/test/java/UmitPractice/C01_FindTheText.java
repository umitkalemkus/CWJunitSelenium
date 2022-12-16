package UmitPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FindTheText {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();

    }

    @Test

    public void Email(){

        driver.get("https://demoqa.com/text-box");
        WebElement nameText = driver.findElement(By.id("userName"));
        nameText.click();
        nameText.sendKeys("Hakki Bulut");

    }

    @Test

    public void Email1(){

        driver.get("https://demoqa.com/text-box");
        WebElement nameText = driver.findElement(By.id("userEmail"));
        nameText.click();
        nameText.sendKeys("HakkiBulut@gmail.c");



    }

    @Test

    public void CurrentAdress(){

        driver.get("https://demoqa.com/text-box");
        WebElement nameText = driver.findElement(By.id("currentAddress"));
        nameText.click();
        nameText.sendKeys("Ankara Kocatepe");

    }
    @Test
    public void PermanentAdress(){

        driver.get("https://demoqa.com/text-box");
        WebElement nameText1 = driver.findElement(By.id("id=permanentAddress"));
        nameText1.click();
        nameText1.sendKeys("Istanbul Uskudar");

    }


    public void Submit(){

        driver.get("https://demoqa.com/text-box");
        WebElement nameText2 = driver.findElement(By.xpath("//*[@id='submit']"));
        nameText2.click();


    }






    @Test

    public void FindText(){

        driver.get("https://demoqa.com/text-box");
        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name =nameText.getText();
        System.out.println(name);

    }









}
