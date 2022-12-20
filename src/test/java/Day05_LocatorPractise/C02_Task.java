package Day05_LocatorPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_Task {
    //https://www.teknosa.com/ adresine gidiniz.
// Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
// Sonuç sayısını yazdırınız.
// Çıkan ilk ürüne tıklayınız.
// Sepete ekleyiniz.
// Sepetime gite tıklayınız.
// Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
// Alışverişi tamamlayınız.
// Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
// Driver'ı kapatınız.





    WebDriver driver;
    @Test
    public void relativeLocator() {

        //Teknosa sitesine gidildi
        driver.get("https://www.teknosa.com/");

        //Arama alani locate edilip istenen deger yazildi

        WebElement search = driver.findElement(By.id("search-input"));
        search.sendKeys("oppo"+ Keys.ENTER);

        // Sonuc sayisi yazdirildi
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='plp-info']"));
        String sonucyazdir = sonuc.getText();
        System.out.println(sonucyazdir);

        //ilk urune tiklanip  sepete eklendi
        WebElement tiklama = driver.findElement(By.className("prd-link"));
        tiklama.click();


        //Sepete Ekle butonu tiklayacagiz

        WebElement SepeteEkle = driver.findElement(By.xpath("//button[@id='addToCartButton']"));
        SepeteEkle.click();

          //sepete butona tiklandi
        WebElement SepeteGitbutton = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
         SepeteGitbutton.click();

        WebElement siparisOzet = driver.findElement(By.xpath("//div[@class='cart-sum-body']"));
        System.out.println(siparisOzet.getText());


        WebElement alisverisTamamla = driver.findElement(By.partialLinkText("Alışverişi Tamamla"));
         alisverisTamamla.click();


        WebElement Hosgeldiniz = driver.findElement(By.xpath("//*[@class='lrp-title']"));
        Hosgeldiniz.click();



    }










    @Before
    public void setup() {

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // driver imiz maximize edildi
        driver.manage().window().maximize();

        //sayfanin yuklenmesi beklendi

    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        //driver.quit();
    }




}