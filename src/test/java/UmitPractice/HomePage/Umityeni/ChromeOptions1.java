package UmitPractice.HomePage.Umityeni;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1 {


    @Test
    public void chromeOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        //options.addArguments("headless");
       //  options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.teknosa.com/");
        driver.manage().window().maximize();
        WebElement searchbox = driver.findElement(By.id("search-input"));
        searchbox.sendKeys("Galatasaray"+ Keys.ENTER);




       /* start-maximized: Opens Chrome in maximize mode
        incognito: Opens Chrome in incognito mode
        headless: Opens Chrome in headless mode
        disable-extensions: Disables existing extensions on Chrome browser
        disable-popup-blocking: Disables pop-ups displayed on Chrome browser
        make-default-browser: Makes Chrome default browser
        version: Prints chrome browser version
        disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software
*/



        //






    }



}
