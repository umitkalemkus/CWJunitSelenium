package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class HomeWork extends BaseTest {


  /*  Go to URL: https://www.monsterindia.com/seeker/registration
    Upload file.*/


    @Test
    public void Uploadfile () {

        driver.get("https://www.monsterindia.com/seeker/registration");
        String path = ("C:\\Users\\umitkalemkus\\Desktop\\CV.docx");
        WebElement ChooseCV = driver.findElement(By.id("file-upload"));
        ChooseCV.sendKeys(path);
        WebElement FileCheck = driver.findElement(By.id("registrationDetails"));
        Assert.assertEquals("CV.docx", FileCheck.getText());




    }
}
