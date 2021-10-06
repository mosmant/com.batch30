package tests.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // aliskanlik edinelim ve her driver objesinden sonra bunu yapalim.
        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        Thread.sleep(2000);
        // XPATH KULLANIRKEN BUTUN HEPSINI KULLANABILIRIZ. EN IYISI EN SADE OLANIDIR.

        // WebElement addButonu = driver.findElement(By.tagName("button")); BU KOLAY YOLUYDU
        // WebElement addButonu = driver.findElement(By.xpath("//button")); BU DA XPATH IN KOLAY YOLU
        // WebElement addButonu = driver.findElement(By.xpath("//button[text()='Add Element']")); BU DA XPATHIN DİGER YOLU
        // WebElement addButonu = driver.findElement(By.xpath("//*[text()='Add Element']")); BUTTON U SILDIK.
        WebElement addButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonu.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete Butonu TEST PASS");
        }else {
            System.out.println("Delete Butonu TEST FAILED");
        }
        // 4- Delete tusuna basin
        deleteButonu.click();
        // 5- Delete butonunun gorunur olmadigini test edin
        // EGER BUTONA BASTIGIMIZDA HTML KODUNDAKI SATIRDA SILINIYORSA DRIVERIN O ELEMENTE ULASMASI MUMKUN OLMAYACAGINDAN VARLIGINI YADA YOKLUGUNU TEST ETMEMIZ MUMKUN OLMAZ.
        // VAR OLAN BIR ELEMENT BU SEKILDE SILINDIKTEN SONRA LOCATE ETMEYE CALISIRSAK : StaleElementReferenceException I ALIRIZ. IF DE COZUM OLMAZ.

        /*
        if (!deleteButonu.isDisplayed()) {
            System.out.println("Delete Butonu Gorunmuyor TEST PASS");
        }else {
            System.out.println("Delete Butonu Gorunmuyor TEST FAILED");
        }*/

        // StaleElementReferenceException => bazen gorunen bazende gorunmuyecen elementlerde bazen boyle calismayan kodlar cikabilir.
        // burada HTML kodu da ortadan kalkıyor.
    }
}
