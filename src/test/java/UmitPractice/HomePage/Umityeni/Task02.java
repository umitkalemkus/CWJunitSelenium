package UmitPractice.HomePage.Umityeni;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Task02 {

    //https://www.teknosa.com/ adresine gidiniz.
// Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.``
// Sonuç sayısını yazdırınız.
// Çıkan ilk ürüne tıklayınız.
// `Sepete ekleyiniz.`
// Sepetime gite tıklayınız.
// Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
// Alışverişi tamamlayınız.
// Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
// Driver'ı kapatınız.


      @Test
     public void relativelocator(){
         driver.get("https://www.teknosa.com");
         WebElement searchbox = driver.findElement(By.id("search-input"));
         searchbox.sendKeys("oppo"+ Keys.ENTER);
          WebElement Sonuc = driver.findElement(By.className("plp-info"));
          System.out.println("Sonuc.getText() = " + Sonuc.getText());
          WebElement ilkurun = driver.findElement(By.className("prd-link"));
          ilkurun.click();


        /*  List <WebElement> ilkurun = driver.findElements(By.className("prd-link"));
          for (int i = 0; i < ilkurun.size() ; i++) {
              if(ilkurun.get(0).isDisplayed()){
                  ilkurun.get(0).click();
              }
          }*/
          WebElement SepeteEkle = driver.findElement(By.id("addToCartButton"));
          SepeteEkle.click();

          WebElement SepeteEkle2 = driver.findElement(By.xpath("(//a[@href='/sepet'])[2]"));
          SepeteEkle2.click();


          WebElement SiparisOzeti = driver.findElement(By.xpath("//div[@class='cart-sum-title']"));
          System.out.println("SiparisOzeti.getText() = " + SiparisOzeti.getText());


          WebElement AlisverisiTamamla = driver.findElement(By.xpath("//*[text()='Alışverişi Tamamla']"));
         AlisverisiTamamla.click();


          WebElement Hosgeldiniz = driver.findElement(By.xpath("//*[text()='Teknosa’ya Hoş Geldiniz']"));
          Hosgeldiniz.getText();

      }











    WebDriver driver;
    @Before
    public void setup(){

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        // driver imiz maximize edildi
        driver.manage().window().maximize();

        //sayfanin yuklenmesi beklendi

    }

    @After
    public void tearDown(){

        // driver imiz kapatildi
        //driver.quit();
    }



}
