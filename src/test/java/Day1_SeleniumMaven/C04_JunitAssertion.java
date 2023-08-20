package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_JunitAssertion {

    WebDriver driver;


     @Before
    public void before(){

         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
     }


     @After
    public void after(){
         driver.quit();



     }

   @Test
     public void assertionTest(){


     }

}
