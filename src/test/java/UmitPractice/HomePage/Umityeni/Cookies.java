package UmitPractice.HomePage.Umityeni;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class Cookies extends BaseTest {
    @Override
    public void tearDown() {

    }

    // Go to URL: https://kitchen.applitools.com/ingredients/cookie
    // Get Cookie.
    // Find the total number of cookies.
    // Print all the cookies.
    // Add Cookie.
    // Edit Cookie.
    // Delete Cookie.
    // Delete All Cookies.
    @Test
    public void testCookie() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
      //  System.out.println("driver.manage().getCookies() = " + driver.manage().getCookies());
        System.out.println("Test get cookie");
        Cookie cookie  =driver.manage().getCookieNamed("protein");
        Assert.assertEquals("chicken",cookie.getValue());
        //find all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        int numberOfCookies = cookies.size();
        System.out.println("numberOfCookies = " + numberOfCookies);
        System.out.println("cookies = " + cookies);

        for (Cookie w :cookies) {
            System.out.println("w = " + w);
            System.out.println("w.getName() = " + w.getName());
            System.out.println("w.getValue() = " + w.getValue());
            
        }






    }
}