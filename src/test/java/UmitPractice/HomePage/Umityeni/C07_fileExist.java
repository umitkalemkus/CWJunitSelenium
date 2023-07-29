package UmitPractice.HomePage.Umityeni;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class C07_fileExist {


    @Test

    public void fileExist(){

    /* C:\\Users\\umitkalemkus\\Desktop\\anime-girl-girly-6024x4084-9792.jpg*/


        System.out.println(System.getProperty("user.home")); // C:\\Users\\umitkalemkus

        String homePath = System.getProperty("user.home");
        String filePath = "\\Desktop\\anime-girl-girly-6024x4084-9792.jpg";

        String fullPath =  homePath + filePath;

        File image = new File(fullPath);

        Assert.assertTrue(image.exists());
        System.out.println(image.getName());
        System.out.println(image.canRead());
        System.out.println(image.canWrite());
        System.out.println(image.delete());


    }






}
