package UmitPractice.HomePage.Umityeni;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApachePOI {


    public static void main(String[] args) throws IOException {
         // Excel path
        String path ="src/test/java/resources/excelfile.xlsx";
         // Dosyamizi actik
        FileInputStream fileInputStream = new FileInputStream(path);
            // Actigimiz dosyayi excel workbookuna cevirdik.
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        // Sayfa acildi
        Sheet sheet1 = workbook.getSheetAt(0);
        System.out.println("sheet.getSheetName() = " + sheet1.getSheetName());

        Row row1 = sheet1.getRow(5);

        Cell cell1 = row1.getCell(0);
        System.out.println("cell1 = " + cell1);
        System.out.println("cell1 = " + cell1.toString().toLowerCase());
        System.out.println("cell1 = " + cell1.toString().length());



    }
}