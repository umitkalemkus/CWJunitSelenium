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

public class Alert2  {
    WebDriver driver;

    @Before
    public void setup() {

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // driver imiz maximize edildi
        driver.manage().window().maximize();

        //sayfanin yuklenmesi beklendi

    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        //driver.quit();
    }


    @Test
    public void checkboxes() throws InterruptedException {


        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebElement AlertWithOk = driver.findElement(By.cssSelector(".btn.btn-danger"));
        AlertWithOk.click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        WebElement AlertandCancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        AlertandCancel.click();

        WebElement AlertandCancelClickbutton = driver.findElement(By.xpath(("//button[@class='btn btn-primary']")));
        AlertandCancelClickbutton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();


        WebElement AlertwithTextBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
        AlertwithTextBox.click();

        WebElement  Promptbox = driver.findElement(By.cssSelector(".btn.btn-info"));
        Promptbox.click();
        driver.switchTo().alert().sendKeys("Umit");//omer ozdemir de kaldik alerts onaylanmadi





}
}