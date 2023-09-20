package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {

    WebDriver driver;

    @Before
    public void setup(){

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //LinkedIn sitesine gidildi
        driver.get("https://www.linkedin.com/");

        // driver imiz maximize edildi
        driver.manage().window().maximize();

         //sayfanin yuklenmesi beklendi

    }

    @After
    public void tearDown(){

        // driver imiz kapatildi
       // driver.quit();
    }



    @Test
    public void idLocator(){
        // id Locator -> "session_key"

        driver.findElement(By.xpath("(//*[contains(text(), \"Reject\")])[2]")).click();
        WebElement email = driver.findElement(By.id("session_key"));
        email.sendKeys("umitkalemkus@gmail.com"+ Keys.TAB);
        WebElement password = driver.findElement(By.name("session_password"));
        password.sendKeys("Umit1umit");
        WebElement signInButton = driver.findElement(By.xpath("(//*[contains(text(), \"Sign in\")])[2]"));
        signInButton.click();
        WebElement SearchButton = driver.findElement(By.id("global-nav-typeahead"));
        String idtext = SearchButton.getAttribute("id");
        Assert.assertEquals(idtext,"global-nav-typeahead");
        Point point = SearchButton.getLocation();
        System.out.println("X COORDINATE :"+ point.x + "Y COORDINATE :" + point.y);



    }

    @Test
    public void nameLocator(){
        // name locator -> "session_password"
        driver.findElement(By.xpath("(//*[contains(text(), \"Reject\")])[2]")).click();
        WebElement password = driver.findElement(By.name("session_password"));
        password.sendKeys("Sifre");
    }

    @Test

    public void classLocator(){

        // class locator ->input_input

        WebElement element =driver.findElement(By.className("input__input"));
        element.sendKeys("Class Locator Keys");




    }
    @Test
    public void  tagNameLocator(){

        driver.findElement(By.xpath("(//*[contains(text(), \"Reject\")])[2]")).click();
      List<WebElement> emaillist =driver.findElements(By.tagName("input"));

      //
       WebElement email =emaillist.get(1);
       email.sendKeys("Tag Locator test");

    }


    @Test
    public void linkname(){
        // Xpath locator -> //input[@name="session_key"]
        // a tag ile baslayan eger bir yazi varsa yazyi alisrsin
        WebElement frgpassword =driver.findElement(By.linkText("Forgot password?"));
        frgpassword.click();



    }
    @Test
    public void partiallinkname(){
        // Xpath locator -> //input[@name="session_key"]

        WebElement frgpassword =driver.findElement(By.partialLinkText("Forgot"));
        frgpassword.click();



    }



    @Test
    public void absolutePath(){
        driver.findElement(By.xpath("(//*[contains(text(), \"Reject\")])[2]")).click();
        WebElement email =driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[1]/div/div/input"));
        email.sendKeys("x path basarili sekilde calisitirildi");


    }


                            /// DINAMIC Xpath


    @Test
    public void relativeXpath(){
        // Xpath locator -> //input[@name="session_key"]

        WebElement email =driver.findElement(By.xpath("//input[@name='session_key']"));
        email.sendKeys("X path relative testi deneniyor");

    }
    @Test
    public void multipleAttributeXpath(){
        // Xpath locator -> //input[@name="session_key"]



        WebElement email =driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
        email.sendKeys("X path multiple testi deneniyor");

    }

    @Test
    public void AndorXpath(){
        // Xpath locator -> //input[@name="session_key"]



        WebElement email =driver.findElement(By.xpath("//input[@class='input__input' and @autocomplete='username']"));
        email.sendKeys("X path and or  testi deneniyor");



    }


    @Test
    public void containsXpath(){
        // Xpath locator -> //input[@name="session_key"]

        WebElement email =driver.findElement(By.xpath("//input[contains(@id , 'session')]"));
        email.sendKeys("X path contains  testi deneniyor");

    }



    @Test
    public void startwithXpath(){
        // Xpath locator -> //input[@name="session_key"]

        WebElement email =driver.findElement(By.xpath("//input[starts-with(@id , 'session')]"));
        email.sendKeys("X path startswith  testi deneniyor");

    }
    @Test
    public void textXpath(){
        // Xpath locator -> //input[@name="session_key"]

        WebElement email =driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        email.sendKeys("X path text()  testi deneniyor");

    }







}


