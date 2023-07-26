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
    // Add Cookie.
     @Test
    public void addCookie() {
        System.out.println("add cookie");
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Cookie cookie1 = new Cookie("fruit","apple");
        driver.manage().addCookie(cookie1);
        System.out.println("cookie1 = " + cookie1);
        Assert.assertEquals(cookie1.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
        Set<Cookie> allcookies = driver.manage().getCookies();
        System.out.println("allcookies = " + allcookies);
         System.out.println("allcookies.size() = " + allcookies.size());
         System.out.println("Edit cookie  ");

         Cookie edited = new Cookie(cookie1.getName(), "ananas");
         System.out.println("edited = " + edited);
         driver.manage().addCookie(edited);
         System.out.println("driver.manage().getCookieNamed(cookie1.getName()).getValue() = " + driver.manage().getCookieNamed(cookie1.getName()).getValue());

    }

    @Test
    public void deleteCookies() {

        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Set<Cookie> Allcookies = driver.manage().getCookies();
        for (Cookie w : Allcookies) {
            System.out.println("w.getValue() = " + w.getValue());

        }
        Cookie newcookie = new Cookie("drinks","fanta");
        driver.manage().addCookie(newcookie);
        System.out.println(driver.manage().getCookies());
        System.out.println(driver.manage().getCookies().size());
        System.out.println("delete cookies");
        driver.manage().deleteCookie(newcookie);
        System.out.println(driver.manage().getCookies().size());


    }
}