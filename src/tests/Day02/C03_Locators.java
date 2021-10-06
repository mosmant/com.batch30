package tests.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {


        // 1. Bir class oluşturun: LocatorsIntro
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();


        // ==============================================
        // kodun calisma hizi internetin calisma hizini gecti. Click yaptiktan sonra internet yetisemedi.
        // ==============================================

        Thread.sleep(2000);

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        // EMAIL <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        // PASS <input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        // SIGN IN BTN <input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passTextBox = driver.findElement(By.id("session_password"));
        WebElement signInBtn = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!

        emailTextBox.sendKeys(" testtechproed@gmail.com");
        passTextBox.sendKeys("Test1234!");
        signInBtn.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement dogruKullanici = driver.findElement(By.className("navbar-text")); //
        String username = "testtechproed@gmail.com";

        if (dogruKullanici.getText().equals(username)) {
            System.out.println("Dogru Kullanici adi testi PASSED");
        }else {
            System.out.println("Dogru Kullanici adi testi FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLinki = driver.findElement(By.linkText("Addresses"));
        WebElement signOutLinki = driver.findElement(By.linkText("Sign out"));
        if (adressesLinki.isDisplayed()) {
            System.out.println("Adresses linki gorunuyor TEST PASS");

        }else {
            System.out.println("Adresses linki gorunmuyor TEST FAILED");
        }

        if (signOutLinki.isDisplayed()) {
            System.out.println("Sign Out linki gorunuyor TEST PASS");

        }else {
            System.out.println("Sign Out linki gorunmuyor TEST FAILED");
        }

        // 3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> Linkler = driver.findElements(By.tagName("a"));
        System.out.println(Linkler.size());

        driver.close();


    }
}
