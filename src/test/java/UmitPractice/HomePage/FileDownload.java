package UmitPractice.HomePage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;

public class FileDownload  extends BaseTest {

    @Test
    public void name() throws InterruptedException {

        driver.get("https://demoqa.com/upload-download");
        WebElement Button = driver.findElement(By.id("downloadButton"));
        Button.click();
        String Path = "C:/Users/umitkalemkus/Downloads";
        String fileName = "sampleFile";
        boolean isDownlooded =isFileDownloaded(Path ,fileName);
        Thread.sleep(3000);
        System.out.println(isDownlooded);
    }

    public static boolean isFileDownloaded(String downloadPath , String fileName){

        File file = new File(downloadPath);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length ; i++) {
            if (files[i].getName().equals(fileName))
                return true;

        }
        return false;


    }



}


