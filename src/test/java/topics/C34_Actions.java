package topics;

import org.junit.Test;
import utilities.TestBase;

    public class C34_Actions extends TestBase {
/*
    Mouse Actions
    click(): Kullanıldığında mevcut konumu tıklar.
    doubleClick(): Fare konumunda çift tıklama yapar.
    clickAndHold(): Fare tıklamasını bırakmadan gerçekleştirir.
    contextClick(): Mevcut fare konumunda sağ tıklama yapar.
    moveToElement(WebElement target): Fare işaretçisini hedef konumun merkezine taşır.
    dragAndDrop(WebElement source, WebElement target): Öğeyi kaynaktan sürükler ve hedef konuma bırakır.
    dragAndDropBy(source, xOffset, yOffset): Bu yöntem, kaynak öğeyi tıklar, belirli bir ofset kadar hareket ettirir, ardından fareyi serbest bırakır. Ofsetler x ve y ile tanımlanır.
        (X = Yatay Kaydırma, Y = Dikey Kaydırma)
    release(): Mevcut konumdaki sol fare düğmesini bırakır.
    perform(): Bir eylemi gerçekleştirir. Bir eylemi tamamlamak için kullanılmalıdır.
    perform() KULLANMAYI UNUTMAYIN!
*/

/*
    Go to URL: https://demoqa.com/buttons
    Run the buttons on the page using the Actions Class.
    Verify the texts that appear after the buttons are operated.
*/

        @Test
        public void actionsTest(){
//Go to URL: https://demoqa.com/buttons

driver.get("http://demoqa.com/buttons");




//Verify the texts that appear after the buttons are operated.


        }

    }

