package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C03_Actions extends BaseTest {
    @Override
    public void tearDown() {

    }

    @Test
    public void dragAndDrop(){


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement Washington = driver.findElement(By.id("box3"));
        WebElement Copenhagen = driver.findElement(By.id("box4"));
        WebElement Seoul = driver.findElement(By.id("box5"));
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Madrid = driver.findElement(By.id("box7"));
        WebElement Oslo  = driver.findElement(By.id("box1"));
        WebElement Stockholm = driver.findElement(By.id("box2"));

        WebElement Italy = driver.findElement(By.id("box106"));
        WebElement Spain = driver.findElement(By.id("box107"));
        WebElement  Norway= driver.findElement(By.id("box101"));
        WebElement Dermark = driver.findElement(By.id("box104"));
        WebElement  SouthKorea= driver.findElement(By.id("box105"));
        WebElement  Sweden= driver.findElement(By.id("box102"));
        WebElement  US= driver.findElement(By.id("box103"));


        Actions actions =new Actions(driver);
        actions.dragAndDrop(Madrid ,Spain).perform();
        actions.dragAndDrop(Rome ,Italy).perform();
        actions.dragAndDrop(Copenhagen,Dermark ).perform();
        actions.dragAndDrop(Seoul ,SouthKorea).perform();
        actions.dragAndDrop(Stockholm ,Sweden).perform();
        actions.dragAndDrop(Washington ,US).perform();
        actions.dragAndDrop(Oslo ,Norway).perform();







    }


}
