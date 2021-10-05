package tests.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) throws InterruptedException {


        // biz bu key value ciftinden once  driveri ardindan da driverin yolunu set ediyoruz.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        // driver.get() bize istedimiz siteyi getirir.
        // driver.close();
        // getirilen siteyi kapatir.
        System.out.println("Su andaki url :"+driver.getCurrentUrl());
        // driver.getCurrentUrl() su andaki siteyi getirir.
        System.out.println("Su andaki baslik :"+driver.getTitle());
        // driver.getTitle() su anki sitenin basligini getirir.
        driver.manage().window().maximize();
        // driver.manage() driveri yonetir > window() ekrani yonetiriz. > maximize() ekrani en buyuk haline getirir.
        Thread.sleep(3000); // 1sn 1000 milis. 3sn 3000 milisaniye beklet demek...
        // bunu neden kullanacagiz internet yavas test hizli olabilir. gecikme olabilir. sikinti yasanmamasi icin testi yavaslatabiliriz.
        driver.navigate().to("https://www.techproeducation.com");
        // .navigate() sayfa icinde hareket edebiliriz. back forward refresh ve to methodlarini kullanabilir.
        Thread.sleep(2000);
        driver.navigate().back();
        // .navigate().back() yaparak geri donus yaptik.
        Thread.sleep(2000);
        driver.navigate().forward();
        // .navigate().forward(); yaparak ileri sayfaya gider. browserda ileri geri dugmeleri gibi...
        Thread.sleep(2000);
        driver.navigate().refresh();
        // refresh() sayfayi yeniler.
        driver.quit();
        // quit close ile ayni isi yapar. fakat quit birden fazla browser varsa hepsini kapatir.






    }
}
