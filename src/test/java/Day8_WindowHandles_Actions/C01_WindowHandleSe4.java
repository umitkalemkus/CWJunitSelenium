package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {

    // https://testproject.io/

// https://blog.testproject.io/


    @Override
    public void tearDown() {

    }

    @Test
    public void newWindow(){

    driver.get("https://testproject.io/");
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://blog.testproject.io/");



}
   @Test

    public  void newTab() {
       driver.get("https://testproject.io/");

       WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);

       newTab.get("https://www.amazon.com/");
       System.out.println(driver.getTitle());


   }
    @Test

    public  void handleWindows() {
        driver.get("https://www.amazon.com/");
        // anasayfanin id degeri verildi
        String homePageHandle = driver.getWindowHandle();
         driver.switchTo().newWindow(WindowType.TAB);

         // YENI sekmemiz amazonu actik
         driver.get("https://www.amazon.com.tr/");
         //yeni pencere olusturduk
         driver.switchTo().newWindow(WindowType.WINDOW);
         driver.get("https://www.google.com/");

          Set<String > handles = driver.getWindowHandles();
          Iterator<String> i = handles.iterator();
          while (i.hasNext()){
             String currentTab = i.next();
              driver.switchTo().window(currentTab);
              System.out.println(driver.getTitle());

/*
              1.yol
              if(!driver.getWindowHandle().equals(homePageHandle)){
                  driver.close();

              }

*/
              if(!driver.getTitle().contains("Spend")){
                  driver.close();
              }

          }






    }
}
