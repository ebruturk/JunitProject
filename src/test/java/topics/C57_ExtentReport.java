package topics;




import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

    public class C57_ExtentReport extends TestBase {

        @Test
        public void test1() {
            //Go to Clarusway
            extentTest = extentReportsSetUp().createTest("Clarusway Anasayfa", "Anasayfa gezinme testi");

            extentTest.info("Anasayfaya gidiliyor");

            driver.get("https://clarusway.com");

            extentTest.pass("Anasayfaya gidildi.");

            driver.findElement(By.xpath("//div[@data-id='4862572d']")).click();

            extentTest.pass("SDET tıklandı");

            driver.navigate().back();

            extentTest.pass("Anasayfaya dönüldü.");

            extentReports.flush();
/*
Go to https://thinking-tester-contact-list.herokuapp.com/
Enter email and password
Click submit
Add pass message in report for each step
Take screenshot of last page
 */

        }

            @Test
            public void test2(){

//        Go to https://thinking-tester-contact-list.herokuapp.com/


//        Enter email and password


//        Click submit


//        Add pass message in report for each step


//        Take screenshot of last page


            }

        }






