package UmitPractice.HomePage.Umityeni;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class fileDownload extends BaseTest {

    @Test
    public void filedown() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        loginButton.click();
        WebElement PIM = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
        PIM.click();
        WebElement Configuration = driver.findElement(By.xpath("//span[text()='Configuration ']"));
        Configuration.click();
        WebElement dataImport = driver.findElement(By.linkText("Data Import"));
        dataImport.click();
        WebElement download = driver.findElement(By.className("download-link"));
        download.click();
        Thread.sleep(5000);
         String downloadPath =  "C:\\Users\\umitkalemkus\\Downloads\\importData.csv";
         Assert.assertTrue("indililen dosya bulunamadi" ,Files.exists(Paths.get(downloadPath)));



    }
}
