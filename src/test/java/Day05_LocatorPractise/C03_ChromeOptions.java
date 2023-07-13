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

/*
        start-maximized: Opens Chrome in maximize mode
        incognito: Opens Chrome in incognito mode
        headless: Opens Chrome in headless mode
        disable-extensions: Disables existing extensions on Chrome browser
        disable-popup-blocking: Disables pop-ups displayed on Chrome browser
        make-default-browser: Makes Chrome default browser
        version: Prints chrome browser version
        disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software*/




    }




}
