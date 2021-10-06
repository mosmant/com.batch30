package tests.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {

    public static void main(String[] args) throws InterruptedException {

        // <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        // placeholder="E-posta veya Telefon Numarası" autofocus="1" aria-label="E-posta veya Telefon Numarası">

        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        // facebook.com a git email textbox'a ali yazdiralim.
        // Locator i secmeden once element incelenir ve ona gore secim yapilir.


        // BYFIND ELEMENT KULLANIRKEN UNIQUE OLAMSINA DIKKAT ETMELIYIZ...


        // burada textboxun id sini girdik ve bu element mailTextBox a assign ettik.
        WebElement mailTextBox = driver.findElement(By.id("email"));

        // burada textboxa "aliseleniumcu@gmail.com" yazdirmak istiyoruz.
        mailTextBox.sendKeys("aliseleniumcu@gmail.com");

        Thread.sleep(2000);
        mailTextBox.clear(); // yazdigimiz yeri temziliyoruz.

        // tag name ile textboxa giris syapmaya calisiyoruz.
        WebElement mailKutusuTagNameile = driver.findElement(By.tagName("input"));
        // mailKutusuTagNameile.sendKeys("veliGocer@gmail.com"); // burada asagidaki kod calissin diye comment line altina aldik.
        // asagidaki hatalardan mavi ile yazili olanlari dikkate almaliyiz. burada 34. satirda hata var dedi.
        // buradaki sorun birkac tane input olmasidir. birden fazla olmasi durumunda ne yapacağini bilemez

        // ***  incele> ctrl+f e basarsaniz "//input" yazarsak kac adet input var ogrenebiliriz. Her attribute te kullanilamaz bu tag larda kullanilir.

        // NoSuchElementException = locatorsda hata var demektir
        // WebElement yanlisElement = driver.findElement(By.id("emailyanlis"));
        // yanlisElement.sendKeys("yanlis eleman"); // burada asagidaki kod calissin diye comment line altina aldik.
        // Exception in thread "main" org.openqa.selenium.NoSuchElementException: locatorsda hata var demektir.


        // GIRIS YAP butonuna tiklayalim.

        // <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login"
        // data-testid="royal_login_button" type="submit" id="u_0_d_D0">Giriş Yap</button>

        WebElement girisButonu = driver.findElement(By.tagName("button"));


        // isDisplayed - isEnabled() gorundu mu ya da erisilebiliyor mu
        System.out.println(girisButonu.isEnabled()); // true yaziyor. butona eristik mi erisemedik mi diye bakiyor.

        girisButonu.click();







    }
}
