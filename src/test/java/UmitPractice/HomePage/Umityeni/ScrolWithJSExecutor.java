package UmitPractice.HomePage.Umityeni;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class ScrolWithJSExecutor extends BaseTest {

    @Test
    public void doubleclickbutton() {
        driver.get("https://api.jquery.com/dblclick/");
        driver.switchTo().frame(0);
        WebElement bluebox = driver.findElement(By.cssSelector("body>div"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("\"arguments[0].scrollIntoView();\"",bluebox);
        Actions action = new Actions(driver);
        action.doubleClick(bluebox).perform();





    }


    @Test  /// DIREK WEB ELEMENTE GIDER
    public void doubleclickbutton2() {
        driver.get("https://www.amazon.com/");
        //driver.switchTo().frame(0);
        WebElement Careers = driver.findElement(By.xpath("//a[text() ='Careers']"));
        JavascriptExecutor js =(JavascriptExecutor) driver;   //KOD
        js.executeScript("\"arguments[0].scrollIntoView();\"",Careers);
        Actions action = new Actions(driver);
        action.click(Careers).perform();

    }


    @Test   /// onemli
    public void Electronics() {
        List<String> contentList1 = new ArrayList<>();
        driver.get("https://www.amazon.com/");
        //driver.switchTo().frame(0);
        WebElement Electronics = driver.findElement(By.xpath("//img[@alt = 'Electronics']"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("\"arguments[0].scrollIntoView();\"",Electronics);
        Actions action = new Actions(driver);
        action.click(Electronics).perform();
        List<WebElement> contentlist = new ArrayList<>(driver.findElements(By.className("_octopus-search-result-card_style_apbSearchResultItem__2-mx4")));
           for (int i = 0; i <contentlist.size() ; i++) {
               contentList1.add(contentlist.get(i).getText());
               System.out.println("contentlist.get(i).getText() = " + contentlist.get(i).getText());

           }
         //   contentlist.get(0).click();
    }


    //System.out.println("contentlist.get(0).getText() = " + contentlist.get(0).getText());
        //System.out.println("contentlist.get(1).getText() = " + contentlist.get(1).getText());
}










