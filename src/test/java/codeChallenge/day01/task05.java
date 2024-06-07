package codeChallenge.day01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task05 {

    /*
        go to https://eviltester.github.io/simpletodolist/todolists.html
        then
        verify display eviltester on todo_list
        and
        delete eviltester
        Then
        Enter new todo_list as "Clarusway"
        And
        Verify new todo_list is created
        Then
        add new Todo_ as "merhaba admin" on the new todo_list
        And
        Verify new Todo_ is added
        Then
        Login as Admin
        And
        Verify
         {"active":1,"completed":0,"total":1}
         Then
        Delete the new Todo_ and the new todo_list
        And
        Verify is deleted
//a[.='[use]']

//a[text()='[use]']

(//label)[2]
        */

    static WebDriver driver;//class seviyesinde tanımlamalıyız
    @BeforeClass
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
        //go to https://eviltester.github.io/simpletodolist/todolists.html
        driver.get("https://eviltester.github.io/simpletodolist/todolists.html");
        //verify display eviltester on todo_list
        WebElement testerText=driver.findElement(By.xpath("//label"));
        Assert.assertTrue(testerText.isDisplayed());
        //delete eviltester
        driver.findElement(By.xpath("//button[@class='destroy']")).click();
        driver.switchTo().alert().accept();
        //        Enter new todo_list as "Clarusway"
      //  driver.findElements(By.xpath("//input[@class='new-todo-list']")).sendKeys("Clarusway"+ Keys.ENTER);
        //Verify new todo_list is created
        WebElement clarusText=driver.findElement(By.xpath("//label"));
        //Assert.assertTrue(clarusText.isDsplayed());
        //add new Todo_ as "merhaba admin" on the new todo_list
        driver.findElement(By.xpath("//"));

    }

}
