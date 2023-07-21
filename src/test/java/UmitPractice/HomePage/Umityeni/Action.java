package UmitPractice.HomePage.Umityeni;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class Action extends BaseTest {


    @Test
    public void doubleClick() {
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        WebElement doublexclickbutton = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doublexclickbutton).perform();
        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());
    }

    @Test
    public void rightClick() {
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        WebElement rightclickbutton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightclickbutton).perform();
        Assert.assertTrue(rightclickbutton.isDisplayed());

    }

    @Test
    public void click() {
        driver.get("https://demoqa.com/buttons");
        WebElement ClickBtn = driver.findElement(By.xpath("//button[.='Click Me']"));
        Actions actions = new Actions(driver);
        actions.click(ClickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("dynamicClickMessage")).isDisplayed());

    }

    @Test
    public void dragAndDrop() {


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement Washington = driver.findElement(By.id("box3"));
        WebElement Copenhagen = driver.findElement(By.id("box4"));
        WebElement Seoul = driver.findElement(By.id("box5"));
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Madrid = driver.findElement(By.id("box7"));
        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Stockholm = driver.findElement(By.id("box2"));

        WebElement Italy = driver.findElement(By.id("box106"));
        WebElement Spain = driver.findElement(By.id("box107"));
        WebElement Norway = driver.findElement(By.id("box101"));
        WebElement Dermark = driver.findElement(By.id("box104"));
        WebElement SouthKorea = driver.findElement(By.id("box105"));
        WebElement Sweden = driver.findElement(By.id("box102"));
        WebElement US = driver.findElement(By.id("box103"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(Washington,US).perform();
        actions.dragAndDrop(Copenhagen,Dermark).perform();
        actions.dragAndDrop(Seoul,SouthKorea).perform();
        actions.dragAndDrop(Rome,Italy).perform();
        actions.dragAndDrop(Madrid,Spain).perform();
        actions.dragAndDrop(Oslo,Norway).perform();
        actions.dragAndDrop(Stockholm,Sweden).perform();

    }

    @Test

    public void dragAndDropOffset() {

        driver.get("https://rangeslider.js.org/");
        WebElement Slider = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(Slider,100,0).perform();


    }

    @Test
    public






    }