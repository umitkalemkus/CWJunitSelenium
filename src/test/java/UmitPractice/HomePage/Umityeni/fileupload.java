package UmitPractice.HomePage.Umityeni;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class fileupload extends BaseTest {


    @Test
    public void upload() throws AWTException, InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\umitkalemkus\\Desktop\\fori.txt"); // send keys getiriyor.
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();
        WebElement FileText = driver.findElement(By.tagName("h3"));
        System.out.println(FileText.getText());
        Assert.assertTrue(FileText.getText().contains("File Uploaded!"));

    }
}
