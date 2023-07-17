package UmitPractice.HomePage.Umityeni;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alert {

    WebDriver driver;

    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
       // driver.quit();
    }


    @Test
    public void alerts() {
        Faker faker = new Faker();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement customer = driver.findElement(By.xpath("//input[@name='cusid']"));
        customer.sendKeys(faker.idNumber().valid());
        WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
        Submit.click();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
//*[@id="save"]/span[1]/div/span

    }
}