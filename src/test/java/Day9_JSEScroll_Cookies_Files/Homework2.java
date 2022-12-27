package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Homework2 extends BaseTest {
    // Go to https://the-internet.herokuapp.com/download
//  Download sample.png file
//  Then verify if the file downloaded successfully

    @Test
    public void name() {

        driver.get("https://the-internet.herokuapp.com/download");

        WebElement SamplePng = driver.findElement(By.linkText("sample.png"));
        SamplePng.click();
        String Filepath = "C:\\Users\\umitkalemkus\\Downloads\\sample.png";

        Assert.assertTrue("Dosya bulunamadi", Files.exists(Paths.get(Filepath)));






    }
}
