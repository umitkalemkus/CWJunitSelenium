package UmitPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.BaseTest;

public class WindowsHandle extends BaseTest {


    @Test
    public void Test() throws InterruptedException {

        driver.get("http://www.demo.guru99.com/popup.php");
        ChromeOptions op = new ChromeOptions();
        //disable notification parameter
        op.addArguments("disable-popup-blocking");

        // driver.findElement(By.cssSelector(("//button)[4]"))).click();

         WebElement ClickButton = driver.findElement(By.xpath("//a[starts-with(text(),'Click Here')]"));
        ClickButton.click();

    }
}
