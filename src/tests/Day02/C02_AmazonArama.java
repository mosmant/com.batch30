package tests.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // amazon web sayfasina giriniz
        driver.get("https://www.amazon.com/");

        // java icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java"+ Keys.ENTER);

        // ve bulunan sonucun sonuc sayisini yazdirin.

        // ACIKLAMA UNIQUE olmayan tag ve classname ve id olmadiginden dolayi xpath kullandik.

        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div"));
        System.out.println(sonucYazisi.getText());
        // burada sonucYazisi 'nin data type i WebElement dir.
        // sout un icinde yazdir dersek reference kodunu yazdirir. .getText() methodunu cagirirsak bunu console da string seklinde yazdirir.

        // output : 1-48 of over 4,000 results for "java"





    }
}
