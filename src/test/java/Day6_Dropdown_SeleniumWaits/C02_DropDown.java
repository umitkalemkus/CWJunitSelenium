package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class C02_DropDown {
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
        driver.close();

    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        //driver.quit();
    }


    @Test
    public void selectByIndex() {


        driver.get("https://demo.guru99.com/test/newtours/register.php");
        // id Locator -> "session_key"

        //Dropdown locate edildi

        WebElement drpDown = driver.findElement(By.name("country"));

        // locate edilen dropdown select objesine donusturuldu
        Select select = new Select(drpDown);
        select.selectByIndex(1);//ALGERIA
        select.selectByIndex(56);

        //selectByIndex() metodu 0 ile baslar
    }

    @Test
    public void selectByValue() {


        driver.get("https://demo.guru99.com/test/newtours/register.php");
        // id Locator -> "session_key"

        //Dropdown locate edildi

        WebElement drpDown = driver.findElement(By.name("country"));

        Select select = new Select(drpDown);
        select.selectByValue("TURKEY");
        System.out.println();


    }

    @Test
    public void selectByVisibletext() {


        driver.get("https://demo.guru99.com/test/newtours/register.php");
        // id Locator -> "session_key"
        WebElement drpDown = driver.findElement(By.name("country"));
        //Dropdown locate edildi
        Select select = new Select(drpDown);
        select.selectByVisibleText("NEPAL");
        System.out.println(select.isMultiple());


    }

    @Test
    public void MultipleSelect() {


        driver.get("https://output.jsbin.com/osebed/2");

        Select select = new Select(driver.findElement(By.id("fruits")));

        System.out.println(select.isMultiple());

        select.selectByValue("apple");
        select.selectByIndex(3);


    }

    @Test
    public void getOptions() {


        driver.get("https://demo.guru99.com/test/newtours/register.php");
        // id Locator -> "session_key"
        Select select = new Select(driver.findElement(By.name("country")));


        // get options metodu select elementinin tum secenekelrini bir liste icerisinde verir.
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }

    @Test
    public void getFirstSelectedOption() {


        driver.get("https://output.jsbin.com/osebed/2");

        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByIndex(3);// Grape
        select.selectByIndex(2);
        WebElement selectedOptions = (select.getFirstSelectedOption());
        System.out.println(selectedOptions.getText());

        // getFirstSelectedOption()) metodu secili olan ilk option elementini bize verir. Sectigimiz ilk option degil.

    }

    @Test
    public void getAllSelectedOption() {


        driver.get("https://output.jsbin.com/osebed/2");

        Select select = new Select(driver.findElement(By.id("fruits")));

          select.selectByValue("banana");
          select.selectByValue("elma");
          List<WebElement> selectedOptions  = select.getAllSelectedOptions();
          selectedOptions.forEach(t-> System.out.println("t.getText() = " + t.getText()));






    }
}