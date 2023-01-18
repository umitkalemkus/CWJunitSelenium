package Day12_Screenshots;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;



    public class C03_WebTablesizlemengerekiyor extends BaseTest {


        @Test
        public void webTableExample() {

            driver.get("http://demo.guru99.com/test/web-table-element.php");

            //Tablomuzu locate ettik
            WebElement table = driver.findElement(By.className("dataTable")).findElement(By.tagName("tbody"));

            // 3. satir locate edildi
            WebElement row3 = table.findElement(By.xpath(".//tr[3]"));

            //3. satir sutun hucre locate edildi



            System.out.println(row3.getText());
        }
    }