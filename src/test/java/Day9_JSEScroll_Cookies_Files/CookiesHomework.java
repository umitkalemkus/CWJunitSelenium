package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class CookiesHomework extends BaseTest {

   /* Go to URL: http://facebook.com
    getCookies,
    addCookie,
    deleteCookieNamed,
    deleteAllCookies.*/

    @Test
    public void Cookies() {

        //getCookies,
        driver.get("http://facebook.com");
        Set<Cookie> allCookies = driver.manage().getCookies();
        int numberofcookies = driver.manage().getCookies().size();
        System.out.println("numberofcookies = " + numberofcookies);

        //addCookie,
        System.out.println("add cookie");
        Cookie cookies1 = new Cookie("Cheese", "Cecil");
        driver.manage().addCookie(cookies1);
        Assert.assertEquals(cookies1.getValue(),driver.manage().getCookieNamed(cookies1.getName()).getValue());
        System.out.println(driver.manage().getCookieNamed(cookies1.getName()).getValue());

        //deleteCookieNamed,

        System.out.println("deletedCookieNamed");
        driver.manage().deleteCookie(cookies1);
        Assert.assertNull("cookieshalen var" , driver.manage().getCookieNamed(cookies1.getName()));
        System.out.println(driver.manage().getCookies().size());



        //deleteAllCookies
        System.out.println("deleteAllCookies");
        driver.manage().deleteAllCookies();
        allCookies =driver.manage().getCookies();
        System.out.println("allCookies = " + allCookies.size());





    }
}
