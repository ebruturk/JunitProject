package task;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;


public class task07 extends TestBase {
    /*
  Go to https://testpages.eviltester.com/styled/find-by-playground-test.html
  Assert that there are 42 web elements with 'p' tag on the page
*/
    @Test
    public void test(){
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");
        List<WebElement>pTags=driver.findElements(By.tagName("p"));
        Assert.assertEquals(41, pTags.size());


    }
}
