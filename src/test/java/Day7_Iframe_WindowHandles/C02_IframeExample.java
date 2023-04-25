package Day7_Iframe_WindowHandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BaseTest;

import java.time.Duration;
import java.util.List;

public class C02_IframeExample extends BaseTest {
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
// Web sitesini maximize yapınız.
// İkinci emojiye tıklayınız.
// Tüm ikinci emoji öğelerine tıklayınız.
// Parent iframe geri dönünüz.
// Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.























    @Test
    public void iframeExample() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.switchTo().frame("emoojis");

        WebElement secondEmojiTab = driver.findElement(By.xpath("//a[contains(@href , '#nature')]"));
        secondEmojiTab.click();

        List<WebElement> emojiList = driver.findElements(By.xpath("//div[@id ='nature']//img"));

        // Tüm ikinci emoji öğelerine tıklayınız.
        emojiList.forEach(WebElement::click);



        // Parent iframe geri dönünüz.
        driver.switchTo().defaultContent();

        WebElement text = driver.findElement(By.id("text"));
        text.sendKeys("Umit");

        WebElement nameofsmiles = driver.findElement(By.id("smiles"));
        nameofsmiles.sendKeys("Kalem");

         WebElement nameofnature = driver.findElement(By.id("nature"));
        nameofnature.sendKeys("Rhosilli");

         WebElement nameoffood = driver.findElement(By.id("food"));
        nameoffood.sendKeys("Cheakpea Wrap");

         WebElement nameofactivities = driver.findElement(By.id("activities"));
        nameofactivities.sendKeys("Basketball");

         WebElement nameofplaces = driver.findElement(By.id("places"));
        nameofplaces.sendKeys("Marina");


        WebElement button = driver.findElement(By.tagName("button"));
        button.click();



        



    }
}