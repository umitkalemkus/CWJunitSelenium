package Day9_JSEScroll_Cookies_Files;

import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C07_FileExist extends BaseTest {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
           String projectRoot = System.getProperty("user.dir");

        String filePath = "\\src\\test\\java\\resources\\fileExist.jpg";
        filePath = projectRoot+filePath;

        System.out.println(Files.exists(Paths.get(filePath)));


        if (Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu"); // Varsa bulundu yazdirdik
        }else{
            System.out.println("Dosya bulunamadi"); // Yoksa bulunamadi yazdirdik
        }







    }







}
