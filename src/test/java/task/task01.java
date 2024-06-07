package task;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task01 {
     /*
 Go to the Clarusway URL : https://www.clarusway.com/
 Print the position and size of the page.
 Adjust the position of the page as:
     xCoordinate: 70
     yCoordinate: 70
 Adjust the size of the page as:
     height: 900
     width: 900
 Close the page.
 /7Clarusway URL'sine gidin: https://www.clarusway.com/
 // Sayfanın konumunu ve boyutunu yazdırın.
  //Sayfanın konumunu şu şekilde ayarlayın:
    //  xKoordinat: 70
      //y Koordinatı: 70
  //Sayfanın boyutunu şu şekilde ayarlayın:
    //  yükseklik: 900
      //genişlik: 900
  //Sayfayı kapatın.
*/
     public static void main(String[] args) throws InterruptedException {


      WebDriver driver = new ChromeDriver();
      driver.get("https://clarusway.com");
      System.out.println(driver.manage().window().getSize());
      Thread.sleep(3000);
      System.out.println(driver.manage().window().getPosition());
      Thread.sleep(3000);
      driver.manage().window().setPosition(new Point(70,70));

      System.out.println("driver.manage().window().getPosition="+driver.manage().window().getPosition());
      Thread.sleep(3000);
      driver.manage().window().setSize(new Dimension(900,900));
      System.out.println("driver.manage().window().setSize()="+driver.manage().window().getSize());
      Thread.sleep(3000);
      driver.quit();

  //WebDriver driver=new ChromeDriver();
//driver.get("https://clarusway.com");
//Point position=driver.manage().window().getPosition();
  //       System.out.println("position="+position);
    //     Dimension size=driver.manage().window().getSize();
    //    System.out.println("size="+size);
    //    driver.manage().window().setPosition(new Point(70,70));
    //    Point yeniPozsition=driver.manage().window().getPosition();
    //    System.out.println("yeniPozsition="+yeniPozsition);
    //    driver.manage().window().setSize(new Dimension(900,900));
    //    Dimension yeniSize=driver.manage().window().getSize();
    //    System.out.println("yeniSize="+yeniSize);
    //    Thread.sleep(3000);
    //    driver.quit();
//      @Test
//      public void test01() throws InterruptedException {
//        Go to the Clarusway URL : https://www.clarusway.com/
 //      driver.get("https://www.clarusway.com/");

//        Print the position and size of the page.
  //   Point position = driver.manage().window().getPosition();
  //   System.out.println("position = " + position);
  //   Dimension size =  driver.manage().window().getSize();
  //   System.out.println("size = " + size);


//        Adjust the position of the page as:
//        xCoordinate: 70
//        yCoordinate: 70
 //     driver.manage().window().setPosition(new Point(70,70));
 //     Point position1 = driver.manage().window().getPosition();
 //     System.out.println("position1 = " + position1);

//        Adjust the size of the page as:
//        height: 900
//        width: 900
  //    Dimension input = new Dimension(900,900);
  //    driver.manage().window().setSize(input);
  //    Dimension size1 = driver.manage().window().getSize();
  //    System.out.println("size1 = " + size1);

//        Close the page.
  //     Thread.sleep(1000);
  //     driver.quit();
//
//
      }

     }

