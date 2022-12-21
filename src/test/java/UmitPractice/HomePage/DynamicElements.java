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

public class DynamicElements {
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
    public void cssSelectorTest() {

        //site linkimize gidiyoruz
        driver.get("https://demoqa.com/buttons");

        //"//button[starts-with(text() , 'Click Me')]
        //"//button[contains(text() , 'Click Me')]
        //


        WebElement dynamicButton = driver.findElement(By.xpath("//button[starts-with(text() , 'Click Me')]"));
        dynamicButton.click();

        WebElement ClickMeMessage = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(ClickMeMessage.getText());


    }
}