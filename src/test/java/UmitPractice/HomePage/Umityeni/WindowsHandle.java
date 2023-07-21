package UmitPractice.HomePage.Umityeni;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowsHandle extends BaseTest {

    @Override
    public void tearDown() {

    }

    @Test
    public void windowHandle() {

        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://blog.testproject.io/");
    }

    @Test
    public void windowHandle3() {

        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://blog.testproject.io/");
    }


    @Test
    public void windowHandle2() {
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        // Yeni sekmeler olusturmak adina target = _blank olan linklerden 2 tanesine tikliyoruz
        String homePageId = driver.getWindowHandle();
        System.out.println("homePageId = " + homePageId);

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
        //links.forEach(WebElement ::click);
        links.get(0).click();
        links.get(1).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            driver.switchTo().window(iterator.next());
            if (driver.getWindowHandle().equals(homePageId)) {
                continue;
            }
            driver.close();
        }

    }


    @Test
    public void windowHandle5() {
       //
        driver.get("https://www.amazon.com/");
        String homePageHandle = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.alibaba.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.google.com/");

        Set<String> handles = driver.getWindowHandles();
        Iterator<String>   i = handles.iterator();

        while (i.hasNext()){
            String currentTab = i.next();
            driver.switchTo().window(currentTab);
              // 1. yol
            System.out.println(driver.getTitle());
            if(!driver.getWindowHandle().equals(homePageHandle)){
                driver.close();

             // 2. yol
             if(!driver.getTitle().contains("Spend")){
                 driver.close();

             }




            }        }




    }



}

