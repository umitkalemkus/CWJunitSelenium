package UmitPractice.HomePage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class FileDownloaded extends BaseTest {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://demo.automationtesting.in/FileDownload.html");

        WebElement TextBox = driver.findElement(By.xpath("//textarea[@id='textbox']"));
        TextBox.sendKeys("Testing is in progress");
        driver.findElement(By.id("createTxt")).click();
        WebElement Downloadind = driver.findElement(By.id("link-to-download"));
        Downloadind.click();

        WebElement PdfBox = driver.findElement(By.xpath("//textarea[@id='pdfbox']"));
        PdfBox.sendKeys("Testing pdf is in progress");
        driver.findElement(By.id("createPdf")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pdf-link-to-download")).click();






    }
}
