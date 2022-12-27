package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C09_fileDownload extends BaseTest {

    /*Go to URL: https://opensource-demo.orangehrmlive.com/
    Login page valid credentials.
    Download sample CSV file.
    Verify if the file downloaded successfully.
*/

    @Test
    public void name() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement PIM = driver.findElement(By.xpath("(//li[@class ='oxd-main-menu-item-wrapper'])[2]"));
        PIM.click();

        WebElement Configurations = driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]"));
        Configurations.click();

        WebElement DataImport = driver.findElement(By.linkText("Data Import"));
        DataImport.click();

        WebElement Download =driver.findElement(By.className("download-link"));
        Download.click();
        Thread.sleep(5000);

        String downloadPath = "C:\\Users\\umitkalemkus\\Downloads\\importData.csv";

       Assert.assertTrue("Indirilen dosya bulunamadi",Files.exists(Paths.get(downloadPath)));







    }
}
