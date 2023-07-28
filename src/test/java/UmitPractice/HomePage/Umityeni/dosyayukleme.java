package UmitPractice.HomePage.Umityeni;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dosyayukleme {


    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir")); // projemizin rootu // C:\Users\umitkalemkus\IdeaProjects\CWJunitSelenium

        String projectRoot = System.getProperty("user.dir"); // sistemin icerisinden geliyor
        String filePath = "\\ src \\ test \\ java \\ resources \\ fileExist.jpg"; // ters slash yapmak gerekiyor.

        filePath = projectRoot +  filePath;

        System.out.println(Files.exists(Paths.get(filePath)));


    }




}
