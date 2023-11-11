package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExcelMethod {


    public static void main(String[] args) throws IOException {





          String path ="src\\test\\java\\resources\\excelfile.xlsx";
          //Dosyasimi actik
          FileInputStream fis = new FileInputStream(path);

         //Actigimiz dosyayi excel workbook una cevirdik
           Workbook workbook = WorkbookFactory.create(fis);

           // Workbookuzdan sheetimize gecis yaptik

           Sheet sheet1 = workbook.getSheetAt(0);
          // Sheetimizden istedigimiz satiri aldik. Index 0 dan baslar
           Row row1 = sheet1.getRow(0);
        //Satirimizdam istedigimiz hucreyi aldik. Index 0 dan baslar
           Cell cell1 = row1.getCell(0);
        // Hucrelerimizde string operasyonlari gerceklestirmek istersek toString methodunu kulannarak cok sey yapabiliriz
        System.out.println("cell1 = " + cell1.toString().toLowerCase());







    }




}
