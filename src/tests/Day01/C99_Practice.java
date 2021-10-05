package tests.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C99_Practice {

    public static void main(String[] args) {

        //1.Yeni bir class olusturalim (Practise)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://tr-tr.facebook.com");

        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle) ) {
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification Failed");
            System.out.println("actual Title : " + driver.getTitle());
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin,icermiyorsa “actual” URL’i yazdirin.
        String expectedUrl = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Verification PASSED");

        }else{
            System.out.println("Verification Failed");
            System.out.println("actual URL :" + driver.getCurrentUrl());
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expTitle = "Walmart.com";
        String actTitle = driver.getTitle();

        if (actTitle.contains("Walmart.com")) {
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification Failed");
            System.out.println("actual Title : " + driver.getTitle());

        }

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();


    }
}
