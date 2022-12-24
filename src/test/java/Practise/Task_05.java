package Practise;

import org.junit.Test;
import utilities.BaseTest;

public class Task_05 extends BaseTest {
    /*
    ● https://the-internet.herokuapp.com/windows adresine gidin.
    ● Sayfadaki textin "Opening a new window" olduğunu doğrulayın.
    ● Sayfa başlığının (title) "The Internet" olduğunu doğrulayın.
    ● Click Here butonuna basın.
    ● Açılan yeni pencerenin sayfa başlığının (title) "New Window" olduğunu doğrulayın.
    ● Sayfadaki textin "New Window" olduğunu doğrulayın.
    ● Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın.
*/

    @Test
    public void test() {

        driver.get("https://the-internet.herokuapp.com/windows");

    }
}
