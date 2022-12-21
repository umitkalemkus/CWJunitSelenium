package UmitPractice.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class DynamicElements2 {

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
        driver.get("https://demoqa.com/dynamic-properties");

       // WebElement enableAfter = driver.findElement(By.id("enableAfter"));
      //  enableAfter.click();


       /* WebElement TextELEMENT = driver.findElement(By.xpath("//div/p"));
        String Text = TextELEMENT.getText();
        System.out.println(Text);



        WebElement Firstbutton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(Firstbutton));
        Firstbutton.click();


        WebElement ColorchangeButton = driver.findElement(By.id("colorChange"));
         String classname =  ColorchangeButton.getAttribute("class");
        System.out.println(classname);

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
         classname =  ColorchangeButton.getAttribute("class");
        wait1.until(ExpectedConditions.attributeContains(ColorchangeButton, "class" ,"mt-4 text-danger btn btn-primary"));
        System.out.println(classname);*/



        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();


















    }
}