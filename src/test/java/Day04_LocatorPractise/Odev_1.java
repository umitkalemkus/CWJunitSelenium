package Day04_LocatorPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev_1 {
    //https://id.heroku.com/login sayfasına gidiniz.
//Bir mail adresi giriniz.
//Bir password giriniz.
//Login butonuna tıklayınız.
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
//Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
//Tüm sayfaları kapatınız.
    WebDriver driver;

    @Before

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {

       // driver.quit();


    }

    @Test
    public void test() {

        driver.get("https://id.heroku.com/login");

        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("clarusway1234@yahoo.com");


        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("123456");

        WebElement login = driver.findElement(By.name("commit"));
        login.click();

        WebElement alert = driver.findElement(By.xpath("//*[@class='alert alert-danger']"));
        String LoginProblem = alert.getText();
        System.out.println(LoginProblem);
         if (alert.getText().equals(LoginProblem)){
             System.out.println("Kayit yapilamadi");
         }else
             System.out.println("Kayit yapildi");



    }
}