package UmitPractice.HomePage.Umityeni;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FakerClass {

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
    public void fakerClass() throws InterruptedException {
         Faker faker = new Faker();




       /*  WebElement cookies =driver.findElement(By.xpath("//span[text()='Accept all']"));
         Thread.sleep(5000);
         cookies.click();
         WebElement searchbutton = driver.findElement(By.id("search"));
         searchbutton.sendKeys(faker.artist().name());
*/
         System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
         System.out.println("faker.animal() = " + faker.animal());
         System.out.println("faker.lorem().characters(1,100) = " + faker.lorem().characters(5,300));
         System.out.println("faker.avatar() = " + faker.avatar().image());
         System.out.println("faker.book().author() = " + faker.book().author());
         System.out.println("faker.number().numberBetween(1,10) = " + faker.number().numberBetween(1, 10));
         System.out.println("faker.country().capital() = " + faker.country().capital());
         System.out.println("faker.country() = " + faker.country().name());
         System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());



     }



}
