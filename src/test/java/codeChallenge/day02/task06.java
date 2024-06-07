package codeChallenge.day02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;
import java.util.Random;

public class task06 extends TestBase {
    /*
 **** React Uygulama, değişken XPath
 Given
  Go to https://react-shopping-cart-67954.firebaseapp.com
 When
  Click random 3 Add To Cart Button
 Then
  Verify that there are 3 items in the cart
 And
  Click Checkout Button
 Then
  Verify Subtotal

  * https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html
 */
    @Test
    public void test1() {


        //   Go to https://react-shopping-cart-67954.firebaseapp.com
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        //Click random 3 Add To Cart Button
        List<WebElement> adToCartList=driver.findElements(By.xpath("//button[@'tabindex=\"-1\"]"));

        for(int i=0;i<3;i++) {
            Random rdm = new Random();

            int sayı = rdm.nextInt(16);

            adToCartList.get(sayı).click();
        }
        //Verify that there are 3 items in the cart
        //And
        //Click Checkout Button
        //        Then
        //Verify Subtotal

    }
}