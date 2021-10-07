package tests.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        /*===============
        XPATH VE CSS SELECTOR DE UNIQUE OLMAZSA DA KOD CALISIR FKAT BU SEFER ILK BULDUGU DEGERI KULLANIR.
         ================*/

        //1. Bir class oluşturun : Locators_css
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(2000);
        // b. Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector(".form-control"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        // c. Locate password textbox ve
        WebElement passTextBox = driver.findElement(By.cssSelector("#session_password"));
        passTextBox.sendKeys("Test1234!");
        // d. Locate signin button
        WebElement signInButonu = driver.findElement(By.cssSelector("input[type='submit']"));
        signInButonu.click();
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!

        driver.close();

        //================ ONEMLI ===================
        // XPATH 'DE ATTRIBUTE LERIN VALUELARINI TANITIRKEN @ KONUR
        // CSS SELECTOR DE ATTRIBUTELERDE @ 'E GEREK YOKTUR.

    }
}
