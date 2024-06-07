package codeChallenge.day01;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task03 {

    /*
    TESTLİO (https://testlio.com/) LİVE INTERVİEW QUESTION
    //1) Open the browser
    //2) Enter the URL “http://practice.automationtesting.in/”
    //3) Test whether the Home page has Three Sliders only
    //4) The Home page must contains only three sliders
    */
   // TESTLİO (https://testlio.com/) CANLI RÖPORTAJ SORUSU
    //1) Tarayıcıyı açın
    //2) “http://practice.automationtesting.in/” URL'sini girin
    //3) Ana sayfada yalnızca Üç Kaydırıcının olup olmadığını test edin
    //4) Ana sayfada yalnızca üç kaydırıcı bulunmalıdır


    //  TESTLİO (https://testlio.com/) LİVE INTERVİEW QUESTION
            //1) Open the browser
            //2) Enter the URL “http://practice.automationtesting.in/”
            //3) Test whether the Home page has Three Sliders only
            //4) The Home page must contains only three sliders
    static WebDriver driver;
    @BeforeClass
 public static void setUp(){
        //1) Open the browser
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


@Test
public void test1(){
    //2) Enter the URL “http://practice.automationtesting.in/”
    driver.get("http://practice.automationtesting.in/");
    //3) Test whether the Home page has Three Sliders only
List<WebElement> sliderList=driver.findElements(By.xpath("//div [@data-slide-duration='0']"));
Assert.assertEquals(3, sliderList.size());
    }
    @AfterClass
    public static void tearDown(){
        //4) The Home page must contains only three sliders
        driver.quit();
    }
}


