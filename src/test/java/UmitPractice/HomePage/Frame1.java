package UmitPractice.HomePage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class Frame1 extends BaseTest {


    @Test
    public void Frame (){
        driver.get("https://demoqa.com/frames");
        //driver.switchTo().frame(1);
        driver.switchTo().frame("frame1");

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);













    }







}
