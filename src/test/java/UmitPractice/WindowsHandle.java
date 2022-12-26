package UmitPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class WindowsHandle extends BaseTest {


    @Test
    public void Test() throws InterruptedException {

        driver.get("http://www.demo.guru99.com/popup.php");
        Thread.sleep(5000);
         driver.findElement(By.cssSelector(("//button)[4]"))).click();
         Thread.sleep(3000);
         WebElement ClickButton = driver.findElement(By.xpath("//a[starts-with(text(),'Click Here')]"));
        ClickButton.click();

    }
}
