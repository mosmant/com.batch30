package tests.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {

    public static void main(String[] args) {
        //Yeni bir Class olusturalim. (VerifyTitle)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Amazon ana sayfasina gidelim . https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title beklenen deger ile ayni, Test PASS");
        }else{
            System.out.println("Title beklenenden farkli, Test FAILED");
            System.out.println("actual title : "+ driver.getTitle());
        }
        driver.close();
    }



}
