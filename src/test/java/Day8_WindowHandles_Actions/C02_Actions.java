package Day8_WindowHandles_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C02_Actions extends BaseTest {

    @Test
    public void doubleClick(){
     driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("doubleClickBtn")).isDisplayed());
        System.out.println("doubleClickBtn = " + doubleClickBtn.getText());


    }
    @Test
    public void rightClick(){
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).build().perform();

        WebElement rightClickmessage = driver.findElement(By.id("rightClickBtn"));
        Assert.assertTrue(rightClickmessage.isDisplayed());

    }
    @Test
    public void click(){
        driver.get("https://demoqa.com/buttons");
        WebElement ClickBtn = driver.findElement(By.xpath("//button[.='Click Me']"));
        Actions actions = new Actions(driver);
        actions.click(ClickBtn).perform();

        WebElement dynamicClickmessage = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(dynamicClickmessage.isDisplayed());


















    }









}
