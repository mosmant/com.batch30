package tests.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {

    public static void main(String[] args) {

        // Yeni bir class olusturalim : (VerifyURLTest)

        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Youtube ana sayfasina gidelim https://www.techproeducation.com/

        driver.get("https://www.techproeducation.com/");

        // Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin

        String expectedUrl = "www.techproeducation.com";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("TEST PASSED");

        }else {
            System.out.println("TEST FAILED");
            System.out.println("actual URL : "+ driver.getCurrentUrl());
        }

        driver.close();


        // test failed oldu. nedeni ise https://www.techproeducation.com gelmesi gerekir.



    }
}
