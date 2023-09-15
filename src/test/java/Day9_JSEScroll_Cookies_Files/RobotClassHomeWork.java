package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassHomeWork extends BaseTest {

   /* https://api.jquery.com/ sitesine gidelim
    arama alanina json yazalim
    Enter islemini robot class kullanrak yapalim
*/
    @Test
    public void Robot() throws AWTException {
        driver.get("https://api.jquery.com/ ");

        WebElement search = driver.findElement(By.name("s"));
        search.click();



        Robot robot = new Robot();;
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);










    }
}
