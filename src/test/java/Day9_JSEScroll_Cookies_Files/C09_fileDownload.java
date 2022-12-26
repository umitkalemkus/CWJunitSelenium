package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C09_fileDownload extends BaseTest {

    /*Go to URL: https://opensource-demo.orangehrmlive.com/
    Login page valid credentials.
    Download sample CSV file.
    Verify if the file downloaded successfully.
*/

    @Test
    public void name() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();





    }
}
