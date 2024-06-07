package topics;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C42_Cookies extends TestBase {
    /*
        Go to URL: https://kitchen.applitools.com/ingredients/cookie
        Get Cookie.
        Find the total number of cookies.
        Print all the cookies.
        Add Cookie.
        Edit Cookie.
        Delete Cookie.
        Delete All Cookies.
     */
    @Test
    public void cookiesTest(){

//        Go to URL: https://kitchen.applitools.com/ingredients/cookie

        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        //        Print all the cookies.
        Set<Cookie> cookie=driver.manage().getCookies();
        //cookies.forEach(System.out::println);//Lambda tercih edilir
//        Get Cookie.

//        Find the total number of cookies.

//        Print all the cookies.

//        Add Cookie.

//        Edit Cookie.

//        Delete Cookie.

//        Delete All Cookies.


    }
}