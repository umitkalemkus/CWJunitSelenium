package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C10_FileUpload extends BaseTest {


    @Test
    public void fileUpload() {

        /*Go to URL: https://the-internet.herokuapp.com/upload
        Find the path of the file that you want to upload.
                Click on Upload button.
                Verify the upload message.
        */

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement ChooseFile = driver.findElement(By.id("file-upload"));
        ChooseFile.sendKeys("C:\\Users\\umitkalemkus\\Desktop\\fileExist.png");

        WebElement Upload = driver.findElement(By.id("file-submit"));
        Upload.click();

        WebElement Message  = driver.findElement(By.tagName("h3"));
        System.out.println(Message.getText());


        Assert.assertTrue(Message.isDisplayed());
        Assert.assertEquals("File Uploaded!", Message.getText());


    }
}
