package task;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task03 {
    /*
Go to Clarusway homepage
Do the following tasks by creating 3 different test methods.
Check if the URL contains clarusway.
Check if the title does not contain Python.
Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
 Clarusway ana sayfasına git
3 farklı test yöntemi oluşturarak aşağıdaki görevleri yapın.
URL'nin clarusway içerip içermediğini kontrol edin.
Başlığın Python içerip içermediğini kontrol edin.
Başlığın "Çevrimiçi BT Eğitim Kampı; Kodlamayı Öğrenin, Veri Bilimi, AWS, DevOps, Siber Güvenlik ve Salesforce" olup olmadığını kontrol edin
 */
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://clarusway.com/");

    }
    @AfterClass
    public static void tearDown()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();

    }
    @Test//
    public void urlContains(){
        String url=driver.getCurrentUrl();
        System.out.println("url="+url);
        Assert.assertTrue(url.contains("clarusway"));
    }
    @Test
    public void notContainPython(){
        String title=driver.getTitle();
        System.out.println("title="+title);
        Assert.assertFalse(title.contains("Python"));
    }
    @Test
    public void equals(){
        String title=driver.getTitle();
        System.out.println("title="+title);
        Assert.assertEquals("Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce",title);
    }
}
