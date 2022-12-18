package Day04_LocatorPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev_2 {
    //Navigate to https://testpages.herokuapp.com/styled/index.html
// Click on Calculate under Micro Apps.
// Type any number in the first input.
// Type any number in the second input.
// Click on Calculate.
// Get the result.
// Print the result.

    WebDriver driver;
    @Before
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();






    }

    @After
    public void tearDown(){

        driver.quit();





    }
    @Test
    public void test(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement Calculate = driver.findElement(By.id("calculatetest"));
        Calculate.click();

        WebElement input1 = driver.findElement(By.name("number1"));

        input1.click();
        input1.sendKeys("10");

        WebElement input2 = driver.findElement(By.name("number2"));
        input2.click();
        input2.sendKeys("100");


        WebElement CalculateButton = driver.findElement(By.id("calculate"));
        CalculateButton.click();



        WebElement Result  = driver.findElement(By.id("answer"));
        String Answer = Result.getText();
        System.out.println(Answer);






    }





}
