package UmitPractice.HomePage.Umityeni;

import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_files  {


    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir")); //C:\\Users\\umitkalemkus\\IdeaProjects\\CWJunitSelenium
        String projectRoot = System.getProperty("user.dir");

        String filePath = "\\src\\test\\java\\resources\\fileExist.jpg";
        filePath = projectRoot + filePath;

        System.out.println(Files.exists(Paths.get(filePath))); // bu dosya var mi yok mu kontrol eder.

        if(Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu");
        }else {
            System.out.println("Dosya bulunamadi");
        }





    }
}