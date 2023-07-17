package UmitPractice.HomePage.Umityeni;

import com.github.javafaker.Faker;
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
import java.util.List;

public class iframe {
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
    public void frame() {
        // How many frame does it have in the website
        driver.get("https://demo.guru99.com/test/yahoo.html");
        List<WebElement> numberOfIframe =driver.findElements(By.xpath("//iframe"));
        System.out.println("numberOfIframe.size() = " + numberOfIframe.size());


    }


    @Test
    public void frame1() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement BoldText = driver.findElement(By.xpath("//p[text()=\"Your content goes here.\"]"));
        BoldText.clear();
        BoldText.sendKeys("Hi everyone");
        driver.switchTo().parentFrame();
        WebElement Elementaltext = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        System.out.println("Elementaltext.getText() = " + Elementaltext.getText());
        Assert.assertTrue(Elementaltext.getText().contains("Elemental Selenium"));
        //Assert.assertTrue(BoldText.getText().contains("content"));
    }
       @Test
        public void iframeExample() {
            driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
            driver.switchTo().frame(1);
            WebElement bear = driver.findElement(By.xpath("//a[@href='#nature']"));
            bear.click();








    }








}
