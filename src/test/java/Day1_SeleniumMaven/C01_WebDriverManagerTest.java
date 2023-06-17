package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {


    // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.


    public static void main(String[] args) {

         /// Webdriver Manager clasini kullanarak chromedriver binary lerimizi indirdik.

        WebDriverManager.chromedriver().setup();
        //driver objemizi olusturduk
        WebDriver driver = new ChromeDriver();



        driver.manage().window().maximize();

        // google anasayfamizi actik
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Sampiyon Galatasaray");
        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();



        // title imizi aliyoruz.

        String title = driver.getTitle();


        // title imizi dogruladik.

        if (title.equals("Google")){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        //Driver imizi kapattik
        //driver.quit();













    }
}
