package task;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class task02 {
   /*
    Open google home page https://www.google.com/
    Wait for 3 seconds
    Go to the https://www.youtube.com/
    Get the title and URL of the page
    Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
    Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
    Then go to https://www.instagram.com/
    Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
    Navigate Back to the previous webpage
    Refresh the page
    Navigate to forward
    Wait for 3 seconds
    Close the browser
    Google ana sayfasını açın https://www.google.com/
     3 saniye bekleyin
     https://www.youtube.com/ adresine gidin
     Sayfanın başlığını ve URL'sini alın
     Başlığın "YouTube" yazdırma konsolu "Başlık YouTube içeriyor" veya "Başlık YouTube içermiyor" kelimesini içerip içermediğini kontrol edin
     URL'nin "youtube" yazdırma konsolu "URL youtube içeriyor" veya "URL youtube içermiyor" kelimesini içerip içermediğini kontrol edin
     Daha sonra https://www.instagram.com/ adresine gidin.
     Başlığı alın ve "Instagram" kelimesini içerip içermediğini kontrol edin ve "Başlık Instagram içeriyor" veya "Başlık Instagram içermiyor" yazdırın
     Gezin Önceki web sayfasına geri dön
     Sayfayı yenile
     İleriye git
     3 saniye bekleyin
     Tarayıcıyı kapat
*/

   public static void main(String[] args) throws InterruptedException{


                   WebDriver driver = new ChromeDriver();

                   driver.manage().window().maximize();
//     Open google home page https://www.google.com/
                   driver.get("https://www.google.com/");
//     Wait for 3 seconds
                   Thread.sleep(3000);
//     Go to the https://www.youtube.com/
                   driver.navigate().to("https://www.youtube.com/");
//     Get the title and URL of the page
                   driver.getTitle();
//     Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
                   if (driver.getTitle().contains("YouTube")) {
                       System.out.println("Title contains 'YouTube'");
                   } else {
                       System.out.println("Title does not contains 'YouTube'");
                   }
//     Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
                   if (driver.getCurrentUrl().contains("youtube")) {
                       System.out.println("URL contains 'youtube'");
                   } else {
                       System.out.println("URL does not contains 'youtube'");
                   }
//     Then go to https://www.instagram.com/
                   driver.navigate().to("https://www.instagram.com/");
//     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
                   if (driver.getTitle().contains("Instagram")) {
                       System.out.println("Title contains 'Instagram'");
                   } else {
                       System.out.println("Title does not contains 'Instagram'");
                   }
//     Navigate Back to the previous webpage
                   Thread.sleep(3000);
                   driver.navigate().back();
//     Refresh the page
                   Thread.sleep(3000);
                   driver.navigate().refresh();
//     Navigate to forward
                   Thread.sleep(3000);
                   driver.navigate().forward();
//     Wait for 3 seconds
                   Thread.sleep(3000);
//     Close the browser
                   driver.quit();
 //     @Test
 //     public void test01() throws InterruptedException {

///        Open google home page https://www.google.com/
 //         driver.get("https://www.google.com/");

///        Wait for 3 seconds
 //         Thread.sleep(3000);

///        Go to the https://www.youtube.com/
 //         driver.get("https://www.youtube.com/");

///        Get the title and URL of the page
 //         String title = driver.getTitle();
 //         System.out.println("title = " + title);
 //         String url = driver.getCurrentUrl();
 //         System.out.println("url = " + url);

///        Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
 //         if (title.contains("YouTube")){
 //             System.out.println("Title contains YouTube");
 //         }else {
 //             System.out.println("Title does not contain YouTube");
 //         }
///        Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
 //         if (url.contains("youtube")){
 //             System.out.println("URL contains youtube");
 //         }else {
 //             System.out.println("URL does not contain youtube");
 //         }
///        Then go to https://www.instagram.com/
 //         driver.get("https://www.instagram.com/");

///        Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
 //         if(driver.getTitle().contains("Instagram")){
 //             System.out.println("Title contains Instagram");
 //         }else {
 //             System.out.println("Title does not contain Instagram");
 //         }

///        Navigate Back to the previous webpage
 //         driver.navigate().back();

///        Refresh the page
 //         driver.navigate().refresh();

///        Navigate to forward
 //         driver.navigate().forward();

///        Wait for 3 seconds
 //         Thread.sleep(3000);
///        Close the browser
 //         driver.close();
 //     }

               }
           }










