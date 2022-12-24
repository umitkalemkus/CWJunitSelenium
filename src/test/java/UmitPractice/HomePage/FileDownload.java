package UmitPractice.HomePage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;

public class FileDownload  extends BaseTest {

    @Test
    public void name() {

        driver.get("https://demoqa.com/upload-download");
        WebElement Button = driver.findElement(By.id("downloadButton"));
        Button.click();
        String Path = "C:/Users/umitkalemkus/Downloads";
        String fileName = "sampleFile";

    }



}


