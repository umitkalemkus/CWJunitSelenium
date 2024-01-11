package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class BaseTest {


    protected static WebDriver driver;
   // Abstract yaparak TestBase Class'ından obje oluşturulmasının önüne geçeriz.
   // TestBase Class'ı sadece extends ile inherit ederek kullanacağız. Dolayısıyla oluşturduğumuz driver variable'i için protected access modifier seçiyoruz. (edited)

    @Before
    public static void setup(){


        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        //ChromeOptions co = new ChromeOptions();
       // co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }



    @After
    public  void tearDown(){

        // driver imiz kapatildi
      // driver.quit();

    }


}
