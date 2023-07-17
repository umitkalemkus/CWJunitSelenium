package UmitPractice.HomePage.Umityeni;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {

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
    public void dropDown() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        //select.selectByIndex(2);
       // select.selectByValue("8");
        select.selectByVisibleText("NEPAL");
        System.out.println("select.isMultiple() = " + select.isMultiple());
        //(boolen islemi dondurur )-> false


    }
    @Test
    public void multipleselect(){
        driver.get("https://output.jsbin.com/osebed/2");
        WebElement fruits = driver.findElement(By.id("fruits"));
        Select select = new Select(fruits);
        System.out.println("select.isMultiple() = " + select.isMultiple());
        select.selectByValue("apple");
        select.selectByIndex(3);


    }

    @Test
    public void demoqa() {
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        System.out.println("select.getOptions().get(3) = " + select.getOptions().get(3).isDisplayed());
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            //System.out.println("option.getText() = " + option.getText()))

        }
    }

    @Test
    public void getFirstSelectedOptions(){

        driver.get("https://output.jsbin.com/osebed/2");
        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByIndex(3);//Grape
        select.selectByIndex(2);// Orange

        WebElement selectedoptions = select.getFirstSelectedOption();
        System.out.println("selectedoptions.getText() = " + selectedoptions.getText());
        //Orange


    }


    @Test
    public void getAllselectedoptions(){

        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByIndex(1);
        select.selectByIndex(3);
       List<WebElement> selectedOptions = select.getAllSelectedOptions();
       selectedOptions.stream().forEach(t-> System.out.println("t.getText() = " + t.getText()));
        
    }


    @Test
    public  void demoguru99(){
        Faker faker = new Faker();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement firstName =driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastname =driver.findElement(By.xpath("//input[@name='lastName']"));
        lastname.sendKeys(faker.name().lastName());
        WebElement phone =driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.phoneNumber().cellPhone());
        WebElement email =driver.findElement(By.xpath("//input[@name='userName']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement address =driver.findElement(By.xpath("//input[@name='address1']"));
        address.sendKeys(faker.address().fullAddress());
        WebElement city =driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys(faker.address().city());
        WebElement state =driver.findElement(By.xpath("//input[@name='state']"));
        state.sendKeys(faker.address().state());
        WebElement postalCode =driver.findElement(By.xpath("//input[@name='postalCode']"));
        postalCode.sendKeys(faker.address().zipCode());
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        select.selectByValue("TURKEY");
        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
        username.sendKeys(faker.name().username());
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("1234");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        confirmPassword.sendKeys("1234");
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();








    }
    
    
    



    }
