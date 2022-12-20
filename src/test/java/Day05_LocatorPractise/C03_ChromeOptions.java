package Day05_LocatorPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_ChromeOptions {

    @Test

    public void ChromeOptions(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
       // options.addArguments("headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);




    }




}
